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

    @FindBy(xpath="//*[@id=\"input\"]")
    public WebElement emailInfo;

    @FindBy(xpath="//*[@id=\"password\"]")
    public WebElement Password;

    @FindBy(xpath="//*[@id=\"sign-in-form\"]/div[4]")
    public WebElement secondSignInButton;

    @FindBy(xpath = "//div[@id='mountNode']/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/h1")
    public WebElement verifyMessage;

    @FindBy(xpath="//*[@id=\"sign-in-form\"]/div[2]/div/label/span")
    public WebElement errorMessage1;

    @FindBy(xpath="//*[@id=\"mountNode\"]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[2]/div")
    public WebElement errorMessage2;





    public myKBBPage(){

        PageFactory.initElements(driver, this);
    }
}
