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

    @FindBy(xpath = "//*[@id=\"vehicle_card_1\"]/div[2]/div[1]/div/div/a/h2")
    public WebElement toyota2022;

    @FindBy(xpath= "//*[@id=\"navToElectricVehiclesGuidenavToElectricVehiclesGuide\"]")
    public WebElement electricVehicle;

    @FindBy(xpath= "//*[@id=\"navToElectricVehiclesGuidenavToElectricVehiclesGuide\"]")
    public WebElement EVtype;

    @FindBy(xpath= "//*[@id=\"tdi_10\"]/div/div[1]/div/div[4]/div/div/div[1]/div/a[1]")
    public WebElement startList;





    //*[@id="menu-item-294407"]/a/div


    @FindBy(xpath="//*[@id=\"navToAwardsTopsnavToKBBAwards\"]")
    public WebElement awards;

    @FindBy(xpath= "//*[@id=\"navToAwardsTopsnavToLatestCarNews\"]")
    public WebElement latestNews;


    @FindBy(xpath= "//*[@id=\"app\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/form/div[1]/div/select")
    public WebElement yearReview;



    @FindBy(xpath= "//*[@id=\"app\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/form/div[2]/div/select")
    public WebElement carBrand;

    @FindBy(xpath= "//*[@id=\"app\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/form/div[3]/div/select")
    public WebElement model;

    @FindBy(xpath= "//input[@class='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath= "//button[@type='submit']")
    public WebElement getReviews;

    @FindBy(xpath= "//*[@id=\"minimum-price\"]/select")
    public WebElement minPrice;

    @FindBy(xpath= "//*[@id=\"max-price\"]/select")
    public WebElement maxPrice;


    @FindBy(xpath= "//*[@id=\"app\"]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div/div[5]/a")
    public WebElement seeResult;






    public carReviewsPage() {
        PageFactory.initElements(driver, this);
    }
}




