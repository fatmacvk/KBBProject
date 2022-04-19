package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utility.CommonMethods.driver;

public class researchToolsPage {


        @FindBy(xpath="//div[@id='app']/header/div/nav/div[6]/a")
        public WebElement researchTools;

        @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/div[6]/ul/li[1]/a")
        public WebElement carResearch;

        @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/div[6]/ul/li[2]/a")
        public WebElement carFinder;

        @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/div[6]/ul/li[3]/a")
        public WebElement compareCars;

        @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/div[6]/ul/li[4]/a")
        public WebElement vehicleHistoryReport;

        @FindBy(xpath = "//*[@id=\"navToResearchToolsnavToCarValues\"]")
        public WebElement carValueMenu;

        @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/div[6]/ul/li[6]/a")
        public WebElement carLoans;

        @FindBy(xpath = "//header[@id='desktopGlobalHeader']//parent::a[@id='navToResearchToolsnavToInsurance']")
        public WebElement insurance;

        @FindBy(xpath = "//*[@id=\"navToResearchToolsnavToCheckMyCredit\"]")
        public WebElement checkMyCredit;

        @FindBy(xpath = "//*[@id=\"navToResearchToolsnavToExtendedWarranty\"]")
        public WebElement extendedWarranty;

        @FindBy(xpath = "//*[@id=\"navToResearchToolsnavToRecalls\"]")
        public WebElement recall;

        @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/form/div[1]/div/select")
        public WebElement yearResearch;

        @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/form/div[2]/div/select")
        public WebElement makeResearch;

        @FindBy(xpath = " //*[@id=\"minimum-price\"]/select")
        public WebElement minResearch;

        @FindBy(xpath = "//*[@id=\"max-price\"]/select")
        public WebElement maxResearch;

        @FindBy(xpath = "//*[@id=\"app\"]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div/div[5]/a")
        public WebElement resultResearch;

        @FindBy(xpath = "//*[@id=\"ajaxsearchlite1\"]/div/div[3]/form/input[1]")
        public WebElement searchButton;

        @FindBy(xpath = "//div[@id='makeDropdown']/select")
        public WebElement makeSelect;

        @FindBy(xpath = "//div[@id='modelDropdown']/select")
        public WebElement modelSelect;

        @FindBy(xpath = "//div[@id='trimDropdown']/select")
        public WebElement trimSelect;

        @FindBy(xpath = "//input[@id='zipInput']")
        public WebElement zipCode;

        @FindBy(xpath = "//button[@id='Step1Button']/span")
        public WebElement FindDealers;

        @FindBy(xpath = "//*[@id='priceQuoteIframe']/iframe")
        public WebElement iFrame;
        @FindBy(xpath="/html/body/div[6]/div[2]/div")
        public WebElement popup;

        @FindBy(xpath="/html/body/div[6]/div[2]/div/div[1]/button")
        public WebElement popupexit;


        public researchToolsPage() {
            PageFactory.initElements(driver, this);
        }
    }

