package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class myKBBSteps extends CommonMethods {
    @Given("user click MyKBB icon and user click on firstSignin button")
    public void user_click_my_kbb_icon_and_user_click_on_first_signin_button()  throws InterruptedException {

        driver.manage().deleteAllCookies();
        jsClick(myKBBTitle.myKBBIcon);
        Thread.sleep(2000);
        jsClick(myKBBTitle.firstSignInButton);
        Thread.sleep(4000);
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() throws InterruptedException {
        driver.manage().deleteAllCookies();
        if(myKBBTitle.popup.isDisplayed()){
            jsClick(myKBBTitle.popupexit);
//        }else{
//            System.out.println("popup is not displayed");
        }
        sendText(myKBBTitle.emailInfo, "ummuhangenc14@gmail.com");
        Thread.sleep(2000);
        sendText(myKBBTitle.Password, "MyKBBProject2022*");
        Thread.sleep(2000);

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

    @When("user enters invalid {string} and {string}")
    public void userEntersInvalidAnd(String username, String password) throws InterruptedException {
        driver.manage().deleteAllCookies();
//        if(myKBBTitle.popup.isDisplayed()){
//            jsClick(myKBBTitle.popupexit);
//        }else{
//            System.out.println("popup is not displayed");
  //      }
        sendText(myKBBTitle.emailInfo, username);
        sendText(myKBBTitle.Password, password);
        Thread.sleep(6000);

    }
    @And("user clicks Signin button")
    public void userClicksSigninButton() {
        jsClick(myKBBTitle.secondSignInButton);
    }

    @Then("user see {string}")
    public void userSee(String errMessage) {
        String errorMsg=myKBBTitle.errorMessage1.getText();
        System.out.println("actual error---" +errorMsg);
        System.out.println("expected error---" +errMessage);
        Assert.assertEquals("Error message is not displayed", errorMsg,errMessage);


    }
}
