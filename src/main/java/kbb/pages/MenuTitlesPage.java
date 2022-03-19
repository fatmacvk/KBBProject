package kbb.pages;

import kbb.testbase.BaseClass;
import kbb.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MenuTitlesPage extends CommonMethods {


    @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[2]/a")
    public WebElement carValues;


    @FindBy(xpath="//*[@id=\"app\"]/header/div/nav/div[2]/ul/li[1]/a")
    public WebElement newOrUsedPrice;

    @FindBy(xpath="//*[@id=\"mykbb-icon-placeholder\"]")
    public WebElement myKBB;

    @FindBy(xpath="//*[@id=\"mykbb-icon-placeholder\"]/div[1]/div/div/a[2]")
    public WebElement createAccount;

//*[@id="mykbb-icon-placeholder"]/div[1]/div/div/a[2]

    public MenuTitlesPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}