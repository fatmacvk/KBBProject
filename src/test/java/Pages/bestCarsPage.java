package Pages;


import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestCarsPage extends CommonMethods {

        @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[4]/a")
        public WebElement carReviews;

        @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[4]/ul/li[1]/a")
        public WebElement bestCars;


        @FindBy(xpath= "//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[2]/div/a[3]/span")
        public WebElement seeTheList;

        @FindBy(xpath= "//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div/a/h3")
        public WebElement Mercedes;

        @FindBy(xpath= "//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[2]/div/a[1]/div/div/p[2]")
        public WebElement Honda;

        @FindBy(xpath= "//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[2]/div/a[2]/div/div/p[2]")
        public WebElement MercedesC;

    public bestCarsPage() {

        PageFactory.initElements(driver, this);
    }

    }

