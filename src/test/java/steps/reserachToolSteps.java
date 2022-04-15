package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class reserachToolSteps extends CommonMethods{


        @When("I hover on the research tools")
        public void i_hover_on_the_research_tools() throws InterruptedException {
            driver.manage().deleteAllCookies();
            actionClass(reserachToolsTitle.researchTools);
            driver.manage().deleteAllCookies();
        }


    @And("I click the car finder")
    public void i_click_the_car_finder() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(reserachToolsTitle.carFinder);
        Thread.sleep(1000);
        if(myKBBTitle.popup.isDisplayed()){
            jsClick(myKBBTitle.popupexit);
        }else{
            System.out.println("popup is not displayed");
        }
    }

    @And("I click the compare cars")
    public void i_click_the_compare_cars() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(reserachToolsTitle.compareCars);
        Thread.sleep(2000);
        if(myKBBTitle.popup.isDisplayed()){
            jsClick(myKBBTitle.popupexit);
        }else{
            System.out.println("popup is not displayed");
        }
    }


    @And("I click the vehicle history report in research tools")
    public void i_click_the_vehicle_history_report_in_research_tools() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(reserachToolsTitle.vehicleHistoryReport);
        Thread.sleep(2000);

    }

    @And("I click the car values")
    public void i_click_the_car_values() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(reserachToolsTitle.carValueMenu);
        Thread.sleep(2000);

    }

    @And("I click the car loans")
    public void i_click_the_car_loans() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(reserachToolsTitle.carLoans);

        Thread.sleep(2000);
    }

    @And("I click the insurance")
    public void i_click_the_insurance() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(reserachToolsTitle.insurance);

        Thread.sleep(2000);
    }

    @And("I click the check my credit")
    public void i_click_the_check_my_credit() throws InterruptedException {
        driver.manage().deleteAllCookies();

        Thread.sleep(2000);
    }

    @And("I click the extended warranty")
    public void i_click_the_extended_warranty() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(reserachToolsTitle.extendedWarranty);
        Thread.sleep(2000);

    }

    @Then("I click the recalls")
    public void i_click_the_recalls() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(reserachToolsTitle.recall);
        Thread.sleep(2000);
        if(myKBBTitle.popup.isDisplayed()){
            jsClick(myKBBTitle.popupexit);
        }else{
            System.out.println("popup is not displayed");
        }
    }
    @When("I click the car research")
    public void i_click_the_car_research() {
       jsClick(reserachToolsTitle.carResearch);
    }

    @When("I select make to a new car")
    public void i_select_make_to_a_new_car() {
        if(reserachToolsTitle.popup.isDisplayed()) {
            jsClick(reserachToolsTitle.popupexit);
        }
            driver.switchTo().frame(reserachToolsTitle.iFrame);
        selectDropdown(reserachToolsTitle.makeSelect, "Acura");
    }

    @When("I select model the car")
    public void i_select_model_the_car() {
        selectDropdown(reserachToolsTitle.modelSelect, "ILX");
    }

    @When("I select trim the car")
    public void i_select_trim_the_car() {
            selectDropdown(reserachToolsTitle.trimSelect, "Premium Pkg");

    }

    @When("I enter the zipcode")
    public void i_enter_the_zipcode() {
    sendText(reserachToolsTitle.zipCode, "32092");
    }

    @When("I click the findDealer button")
    public void i_click_the_find_dealer_button() {
    jsClick(reserachToolsTitle.FindDealers);
    }

    @Then("I verify the closest dealer")
    public void i_verify_the_closest_dealer() {
        String actualStringforResearch= driver.findElement(By.xpath("//div[@id='dealerInfo0']/div[2]/p[1]/b")).getText();
        String expectedString = "Acura Of Orange Park";
        assertTrue(actualStringforResearch.contains(expectedString));
    }


}


