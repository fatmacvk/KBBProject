package Pages;


import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class carReviewsPage extends CommonMethods {
    @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[4]/a")
    public WebElement carReviews;

    @FindBy(xpath= "//*[@id=\"navToCarReviews\"]")
    public WebElement carReviewAfterClick;



    @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[4]/ul/li[1]/a")
    public WebElement bestCars;


    @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[4]/ul/li[2]/a")
    public WebElement newUserGuide;

    @FindBy(xpath = "//*[@id=\"navToCarReviewsnavToKBBExpertReviews\"]")
    public WebElement expertsReview;

    @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[4]/ul/li[4]/a")
    public WebElement electricVehicle;


    @FindBy(xpath="//*[@id=\"navToAwardsTopsnavToLatestCarNews\"]")
    public WebElement awards;

    @FindBy(xpath= "//*[@id=\"navToAwardsTopsnavToLatestCarNews\"]")
    public WebElement latestNews;



    public carReviewsPage() {
        PageFactory.initElements(driver, this);
    }
}



