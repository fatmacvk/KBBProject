package steps;


import Utils.CommonMethods;
import io.cucumber.java.en.Then;

public class MainMenuSteps extends CommonMethods {
//    jsClick(carValuesTitle.carValues);

    /*@When("I hover over {string}")
    public void i_hover_over(String string) throws InterruptedException {
        actionClass(carValuesTitle.carValues);
        Thread.sleep(2000);


    }
    @And("I click {string}")
    public void i_click(String string) throws InterruptedException {
        click(carValuesTitle.newOrUsedPrice);
        Thread.sleep(2000);
    }

*/
    /*@Given("I click myKBB")
    public void i_click_myKBB() throws InterruptedException {
        click(carValuesTitle.myKBB);
        Thread.sleep(2000);

    }

    @Then("I click create account")
    public void i_click_create_account() throws InterruptedException {
        click(carValuesTitle.createAccount);
        Thread.sleep(2000);
    }
*/

    @Then("I verify {string} is displayed.")
    public void i_verify_is_displayed(String string) {

    }
    }
