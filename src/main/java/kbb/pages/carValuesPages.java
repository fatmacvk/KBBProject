package kbb.pages;

import kbb.testbase.BaseClass;
import kbb.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class carValuesPages extends CommonMethods {
    @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[2]/a")
    public WebElement carValues;


    @FindBy(xpath="//*[@id=\"app\"]/header/div/nav/div[2]/ul/li[1]/a")
    public WebElement newOrUsedPrice;

    @FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div/div/div/div[2]/div/div/div[2]/div/div/label[2]/div/div/div/div")
    public WebElement searchPriceButton;

    public carValuesPages() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
