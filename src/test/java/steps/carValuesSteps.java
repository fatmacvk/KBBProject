package steps;


import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class carValuesSteps extends CommonMethods {
    @When("I hover over {string}")
    public void i_hover_over(String string) throws InterruptedException {
        actionClass(carValuesTitle.carValues);
        Thread.sleep(2000);


    }
    @And("I click {string}")
    public void i_click(String string) throws InterruptedException {
        click(carValuesTitle.newOrUsedPrice);
        Thread.sleep(2000);
    }
      @When("I click search by Price button")
    public void i_click_button() throws InterruptedException {
        click(carValuesTitle.searchPriceButton);
        Thread.sleep(2000);
    }

    @When("I choose minimum {int} K")
    public void i_choose_minimum_K(Integer int1) {

    }

    @When("I choose maximum {int} K")
    public void i_choose_maximum_K(Integer int1) {

    }

    @Then("I verify Price Range is displayed")
    public void i_verify_Price_Range_is_displayed() {

    }


}

