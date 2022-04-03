package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myKBBPage extends CommonMethods {

    @FindBy(xpath="//div[@id='app']/header/div/div[2]/label")
    public WebElement myKBBIcon;
    @FindBy(xpath="//div[@id='app']/header/div/div[2]/div/div/a[1]")
    public WebElement firstSignInButton;
    @FindBy(xpath="//div[@id='input']")
    public WebElement emailInfo;
    @FindBy(xpath="//div[@id='password']")
    public WebElement password;
    @FindBy(xpath="//div[@id='sign-in-form']/div[4]/button/span")
    public WebElement secondSignInButton;

    @FindBy(xpath = "//div[@id='mountNode']/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/h1")
    public WebElement verifyMessage;
    @FindBy(xpath="//div[@id='mountNode']/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[2]/div/div/div[1]/p")
    public WebElement errorMessage;

    public myKBBPage(){

        PageFactory.initElements(driver, this);
    }
}
