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

    @FindBy(xpath="//*[@id=\"app\"]/header/div/nav/div[5]/ul/li[2]/a")
    public WebElement carRecalls;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[3]/a")
    public WebElement maintenancePricing;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[4]/a")
    public WebElement findingAutoShop;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[5]/a")
    public WebElement serviceGuide;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[5]/ul/li[6]/a")
    public WebElement obdIICodes;

    public carRepairPage() {

        PageFactory.initElements(driver, this);
    }
}
