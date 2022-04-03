package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class researchToolsPage extends CommonMethods {



    @FindBy(xpath="//*[@id=\"app\"]/header/div/nav/div[6]/a")
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
    public WebElement carValues;

    @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/div[6]/ul/li[6]/a")
    public WebElement carLoans;

    @FindBy(xpath = "//*[@id=\"navToResearchToolsnavToInsurance\"]")
    public WebElement insurance;

    @FindBy(xpath = "//*[@id=\"navToResearchToolsnavToCheckMyCredit\"]")
    public WebElement checkMyCredit;

    @FindBy(xpath = "//*[@id=\"navToResearchToolsnavToExtendedWarranty\"]")
    public WebElement extendedWarranty;

    @FindBy(xpath = "//*[@id=\"navToResearchToolsnavToRecalls\"]")
    public WebElement recall;


    public researchToolsPage() {
        PageFactory.initElements(driver, this);
    }
}

