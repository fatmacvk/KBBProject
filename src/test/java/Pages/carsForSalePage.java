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

    @FindBy(xpath="//*[@id=\"app\"]/header/div/nav/div[3]/ul/li[4]/a")
    public WebElement historyReport;

    @FindBy(xpath="//*[@id=\"td-outer-wrap\"]/div/div[1]/div[2]/div[1]")
    public WebElement localDealers;




    public carsForSalePage() {
        PageFactory.initElements(driver, this);
    }
}




