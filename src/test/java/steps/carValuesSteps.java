package steps;


import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class carValuesSteps extends CommonMethods {
    @When("user hover over CarValue")
    public void user_hover_over_CarValue() throws InterruptedException {
        driver.manage().deleteAllCookies();
        actionClass(carValuesTitle.carValues);
        Thread.sleep(2000);
    }
    @And("user click the Price NewOrUsed")
    public void user_click_the_Price_NewOrUsed() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carValuesTitle.newOrUsedPrice);
        Thread.sleep(2000);

    }
    @And("user click my Cars Value")
    public void userClickMyCarsValue() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carValuesTitle.myCarsValue);
        Thread.sleep(2000);
    }

    @And("user click InstantCashOffer")
    public void user_click_InstantCashOffer() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carValuesTitle.instantCashOffer);
        Thread.sleep(2000);

    }

}

