package pages;

public class PageSearchPage extends BasePage{
    private String searchBox = "//input[@placeholder='Search']";
    private String searchButton = "//button[@class='btn btn-default btn-lg']";
    private String thirdResult = "//body[1]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]/h4[1]/a[1]";
    private String addToCartButton = "//button[@id='button-cart']";
    private String addedMessageText = "//div[@class='alert alert-success alert-dismissible']";

    public PageSearchPage(){
        super(driver);
    }

    public void navigatetoPage(){
        navigateTo("http://opencart.abstracta.us/");
    }

    public void enterSearchCriteria(String criteria){
        write(searchBox,criteria);
    }

    public void clickSearch(){

        clickElement(searchButton);
    }

    public void pick3rdItem(){

        clickElement(thirdResult);
    }

    public void addToCar(){

        clickElement(addToCartButton);
    }

    public String validateTextAddedToCartMessage(){
        return textFromElement(addedMessageText);
    }


}
