package pages;


import utility.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestCarsPage extends CommonMethods {


//compact cars
    @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/div[4]/a")
    public WebElement carReviews;

    @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/div[4]/ul/li[1]/a")
    public WebElement bestCars;


    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[2]/div/a[3]/span")
    public WebElement seeTheList;

    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div/a/h3")
    public WebElement Mercedes;

    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[2]/div/a[1]/div/div/p[2]")
    public WebElement Honda;

    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[2]/div/a[2]/div/div/p[2]")
    public WebElement MercedesC;

//convertible cars

    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/a/h3")
    public WebElement Mazda;

    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[2]/div/div/div[2]/div/a[1]/div/div/p[2]")
    public WebElement MercedesBenzS;


    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[2]/div/div/div[2]/div/a[2]/div/div/p[2]")
    public WebElement MercedesBenzCConvertable;


    @FindBy(xpath = "//*[@id=\"vehicle_card_1\"]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/h2")
    public WebElement MercedesBenzConvertable;



//fullsize



    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[3]/div/div/div[2]/div/a[1]/div/div/p[2]")
    public WebElement audiA7;

    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[3]/div/div/div[2]/div/a[2]/div/div/p[2]")
    public WebElement BMW7Series;

    @FindBy(xpath = "//*[@id=\"primaryLists\"]/div/div[1]/div/div[3]/div/div/div[1]/div/div/div/a/h3")
    public WebElement MercedesBenzSFullsize;

    public bestCarsPage() {

        PageFactory.initElements(driver, this);
    }

}

