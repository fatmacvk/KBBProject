package pages;


import utility.CommonMethods;
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

    @FindBy(id="navToCarsforSalenavToFindLocalDealers")
    public WebElement localDealers;

    @FindBy(xpath="//*[@id=\"makeDropdown\"]/select")
    public WebElement dropDown;

    @FindBy(xpath=" //*[@id=\"makeDropdown\"]/div")
    public WebElement dropDown2;

    @FindBy(xpath="//*[@id=\"makeDropdown\"]/select/option[2]")
    public WebElement acura;

    @FindBy(xpath="//*[@id=\"2225141853\"]")
    public WebElement zipcode;

    @FindBy(xpath="//*[@id=\"Step1Button\"]/span")
    public WebElement findDealers;

    @FindBy(xpath="//*[@id=\"ae-main-content\"]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div/div/div[3]/div[2]/div/div/div/label[2]/div")
    public WebElement usedCarCheck;

    @FindBy(xpath="//*[@id=\"ae-main-content\"]/div[3]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div[2]")
    public WebElement dealPrice;

    @FindBy(xpath="//*[@id=\"payments-popover-menu\"]/div[2]/div/button[1]")
    public WebElement notNow;


    public carsForSalePage() {
        PageFactory.initElements(driver, this);
    }
}




