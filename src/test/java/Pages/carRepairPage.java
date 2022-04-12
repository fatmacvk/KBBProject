package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class carRepairPage extends CommonMethods {

    @FindBy(xpath = "//div[@id='app']/header/div/nav/div[5]/a")
    public WebElement carRepair;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[1]/a")
    public WebElement autoRepair;

    @FindBy(xpath="/html/body/div[2]/div/header/div/nav/div[5]/ul/li[2]/a")
    public WebElement carRecalls;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[3]/a")
    public WebElement maintenancePricing;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[4]/a")
    public WebElement findingAutoShop;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[5]/a")
    public WebElement selectService;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[6]/a")
    public WebElement obdIICodes;

    @FindBy(xpath = "//div[@class='year']//parent::select")
    public WebElement Year;

    @FindBy(xpath = "//div[@class='make']//parent::select")
    public WebElement Make;

    @FindBy(xpath = "//div[@class='model']//parent::select")
    public WebElement Model;

    @FindBy(xpath = "//div[@class='style']//parent::select")
    public WebElement Style;

    @FindBy(xpath = "//button[@type='submit']//span")
    public WebElement SaveButton;

    @FindBy(xpath="//input[@id='serviceSelectorSearchFilterBar']")
    public  WebElement serviceGuide;

    @FindBy(xpath="//div[@id='serviceSelectorSearchFilterBarResultBox']/div[2]")
    public  WebElement AcCharge;

   //  @FindBy(xpath = "//span[contains(text(),'See Pricing')]/..")
   @FindBy(xpath="//main[@id='content']/div[2]//parent::button[@class='ev39mze2 css-fq9qoh-transitionRules-default']")
    public WebElement SeePricing;

    public carRepairPage() {

        PageFactory.initElements(driver, this);
    }
}
