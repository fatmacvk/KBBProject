package Pages;


import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class carsForSalePage extends CommonMethods {


    @FindBy(xpath="//*[@id=\"app\"]/header/div/nav/div[3]/a")
    public WebElement carsForSaleMenu;

    @FindBy(xpath="//*[@id=\"mountNode\"]/header/div/nav/div[3]/a")
    public WebElement carsForSaleMenuHover;



    @FindBy(xpath="//*[@id=\"app\"]/header/div/nav/div[3]/ul/li[1]/a")
    public WebElement carsForSaleSubmenu;

    @FindBy(xpath="//*[@id=\"mountNode\"]/header/div/nav/div[3]/ul/li[2]/a")
    public WebElement sellYourCar;

    @FindBy(xpath="//*[@id=\"app\"]/header/div/nav/div[3]/ul/li[3]/a")
    public WebElement priceQuate;




    public carsForSalePage() {
        PageFactory.initElements(driver, this);
    }
}




