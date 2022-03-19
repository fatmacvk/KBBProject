package kbb.pages;

import kbb.testbase.BaseClass;
import kbb.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends CommonMethods {
    @FindBy(xpath="//*[@id=\"mykbb-icon-placeholder\"]")
    public WebElement myKBB;

    @FindBy(xpath="//*[@id=\"mykbb-icon-placeholder\"]/div[1]/div/div/a[2]")
    public WebElement createAccount;

    public loginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
