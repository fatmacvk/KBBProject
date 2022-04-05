package Pages;


import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class carValuesPages extends CommonMethods {

    @FindBy(xpath= "//div[@id='app']/header/div/nav/div[2]/a")
    public WebElement carValues;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[2]/ul/li[1]/a")
    public WebElement newOrUsedPrice;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[2]/ul/li[2]/a")
    public WebElement myCarsValue;

    @FindBy(xpath="//div[@id='app']/header/div/nav/div[2]/ul/li[3]/a")
    public WebElement instantCashOffer;

    public carValuesPages() {
        PageFactory.initElements(driver, this);
    }
}
