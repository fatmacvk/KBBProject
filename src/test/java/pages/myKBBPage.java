package pages;

import utility.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myKBBPage extends CommonMethods {

    @FindBy(xpath="//div[@id='app']/header/div/div[2]/label")
    public WebElement myKBBIcon;

    //  @FindBy(xpath="//div[@id='app']/header/div/div[2]/div/div/a[1]")
    @FindBy(xpath = "//a[text()='Sign In']")
    public WebElement firstSignInButton;

    @FindBy(xpath="//input[@id='input']")
    public WebElement emailInfo;

    @FindBy(xpath="//*[@id='password']")
    public WebElement Password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement secondSignInButton;

    @FindBy(xpath = "//div[@id='mountNode']/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/h1")
    public WebElement verifyMessage;

    @FindBy(xpath="//*[@id='sign-in-form']/div[1]/label/span")
    public WebElement errorMessage1;

    @FindBy(xpath="//div[@id='mountNode']//parent::p")
    public WebElement errorMessage2;
    @FindBy(xpath="//div[@id='mountNode']//parent::p")
    public WebElement errorMessage3;

    @FindBy(xpath="/html/body/div[6]/div[2]/div")
    public WebElement popup;

    @FindBy(xpath="/html/body/div[6]/div[2]/div/div[1]/button")
    public WebElement popupexit;


    public myKBBPage(){

        PageFactory.initElements(driver, this);
    }
}
