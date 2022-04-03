package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class myKBBSteps extends CommonMethods {
    @Given("user click MyKBB icon")
    public void user_click_my_kbb_icon() {
        driver.manage().deleteAllCookies();
        jsClick(myKBBTitle.myKBBIcon);
    }

    @When("user click on Signin button")
    public void user_click_on_signin_button() {
        click(myKBBTitle.firstSignInButton);
    }

   @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
       sendText(myKBBTitle.emailInfo, "ummuhangenc14@gmail.com");
       sendText(myKBBTitle.password, "MyKBBProject2022*");
       driver.manage().deleteAllCookies();


//        driver.manage().deleteAllCookies();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementById('input').value='ummuhangenc14@gmail.com';");
//        js.executeScript("document.getElementById('password').value='MyKBBProject2022*';");
//        driver.manage().deleteAllCookies();
   }

    @When("user click Signin button to see its account")
    public void user_click_signin_button_to_see_its_account() throws InterruptedException {
        driver.manage().deleteAllCookies();
      // click(myKBBTitle.secondSignInButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('sign-in-form').click();");
        Thread.sleep(2000);
    }
    @Then("user is successfully logged in")
    public void userIsSuccessfullyLoggedIn() {
    System.out.println("Welcome to myKBB");
    }

   @And("user enters invalid {string} and {string}")
   public void userEntersInvalidAnd(String Email, String Password) {
//
//
      sendText(myKBBTitle.emailInfo, Email);
       sendText(myKBBTitle.password, Password);
       driver.manage().deleteAllCookies();
//
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("document.getElementById('input').value='ummuhangenc14@gmail.com';");
////        js.executeScript("document.getElementById('password').value='MyKBBProject2022*';");
//    }
//
//    @Then("user see {string}")
//    public void userSee(String ErrorMessage) {
//        String errmsg=myKBBTitle.errorMessage.getText();
//        System.out.println("actual error----"+errmsg);
//        System.out.println("expected-----"+ErrorMessage);
//        Assert.assertEquals("Error message is not displayed", errmsg,ErrorMessage );
//    }

}}
