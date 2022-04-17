package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;


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
//        if(myKBBTitle.popup.isDisplayed()){
//            jsClick(myKBBTitle.popupexit);
//        }else{
//            System.out.println("popup is not displayed");
//        }
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

    @Then("user are still on the login page")
    public void userAreStillOnTheLoginPage() throws InterruptedException {
        String actual1 = driver.findElement(By.xpath("//div[@id='mountNode']//parent::h1")).getText();
        String expectedString1= "Sign In";
        assertTrue(actual1.contains(expectedString1));
        Thread.sleep(2000);
    }

}
