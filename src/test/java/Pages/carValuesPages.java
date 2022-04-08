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
    @FindBy(xpath = "//div[@class='year']//parent::select")
    public WebElement Year;
//    @FindBy(xpath = "//div[@class='year']//parent::option[text()='2024']")
//    public WebElement browseByYear;
    @FindBy(xpath = "//div[@class='make']//parent::select")
    public WebElement Make;
    @FindBy(xpath = "//div[@class='model']//parent::select")
    public WebElement Model;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement ZipCode;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div/div/div/div[2]/div/div/div[3]/form/button/span")
    public WebElement Nextbutton;



    public carValuesPages() {
        PageFactory.initElements(driver, this);
    }
}
