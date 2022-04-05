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
        click(myKBBTitle.firstSignInButton);
        Thread.sleep(3000);
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() throws InterruptedException {
        driver.manage().deleteAllCookies();
        sendText(myKBBTitle.emailInfo, "ummuhangenc14@gmail.com");
        Thread.sleep(2000);
        sendText(myKBBTitle.Password, "MyKBBProject2022*");
        Thread.sleep(2000);


        driver.manage().deleteAllCookies();
    }

    @When("user click Signin button to see its account")
    public void user_click_signin_button_to_see_its_account() throws InterruptedException {
        driver.manage().deleteAllCookies();
        click(myKBBTitle.secondSignInButton);
        Thread.sleep(2000);

    }

    @Then("user is successfully logged in")
    public void userIsSuccessfullyLoggedIn() {
        System.out.println("Welcome to myKBB");
    }

    @And("user enters invalid {string} and {string} and clicks on login and verify the {string}")
    public void user_enters_invalid_and_and_clicks_on_login_and_verify_the(String string, String string2, String string3) throws InterruptedException {
        driver.manage().deleteAllCookies();
        sendText(myKBBTitle.emailInfo, string);
        sendText(myKBBTitle.Password, string2);
        jsClick(myKBBTitle.secondSignInButton);

        Thread.sleep(2000);

        /*String errorActual = myKBBTitle.errorMessage1.getText();
        Assert.assertEquals(string3, errorActual);

        String errorActual2 = myKBBTitle.errorMessage2.getText();
        Assert.assertEquals(string3, errorActual2);
*/


    }

}
