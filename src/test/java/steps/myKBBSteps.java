package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class myKBBSteps extends CommonMethods {
    @Given("user click MyKBB icon and user click on Signin button")

    public void user_click_my_kbb_icon() throws InterruptedException {

        driver.manage().deleteAllCookies();
        jsClick(myKBBTitle.myKBBIcon);
        Thread.sleep(2000);
        jsClick(myKBBTitle.firstSignInButton);
        Thread.sleep(2000);
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() throws InterruptedException {
        if(myKBBTitle.popup.isDisplayed()){
            jsClick(myKBBTitle.popupexit);
        }else{
            System.out.println("popup is not displayed");
        }
        sendText(myKBBTitle.emailInfo, "ummuhangenc14@gmail.com");
        Thread.sleep(2000);
        sendText(myKBBTitle.Password, "MyKBBProject2022*");
        Thread.sleep(1000);

    }

    @When("user click Signin button to see its account")
    public void user_click_signin_button_to_see_its_account() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(myKBBTitle.secondSignInButton);
        Thread.sleep(2000);

    }

    @Then("user is successfully logged in")
    public void userIsSuccessfullyLoggedIn() throws InterruptedException {
        System.out.println("Welcome to myKBB");
        Thread.sleep(1000);
    }

    @And("user enters invalid {string} and {string} and clicks on login")
    public void user_enters_invalid_and_and_clicks_on_login_and_verify_the(String username, String password) throws InterruptedException {
        driver.manage().deleteAllCookies();
        if(myKBBTitle.popup.isDisplayed()){
            jsClick(myKBBTitle.popupexit);
        }else{
            System.out.println("popup is not displayed");
        }
        sendText(myKBBTitle.emailInfo, username);
        sendText(myKBBTitle.Password, password);
        jsClick(myKBBTitle.secondSignInButton);
        Thread.sleep(2000);

    }

}
