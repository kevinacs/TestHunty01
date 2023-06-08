package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PageSearchPage;

public class PageSearchSteps {
    PageSearchPage page = new PageSearchPage();

    @Given("^The user navigates to http://opencart.abstracta.us/$")
    public void navigateToPage(){
        page.navigatetoPage();
    }

    @And("^searches for (.+)$")
    public void enterSearchCriteria(String criteria){
        page.enterSearchCriteria(criteria);
        page.clickSearch();
    }

    @When("^selects the third item$")
    public void selectThirdItem(){
        page.pick3rdItem();
    }

    @Then("^the user is able to add it to the cart$")
    public void itemCanBeAddedToCart(){
        page.addToCar();
        Assert.assertEquals("Success: You have added MacBook Air to your shopping cart!", page.validateTextAddedToCartMessage().toString().substring(0,58));
    }
}
