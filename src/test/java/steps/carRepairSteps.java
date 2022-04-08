package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class carRepairSteps extends CommonMethods {

    @Given("user hoover over CarRepair")
    public void user_hoover_over_car_repair() throws InterruptedException {
        driver.manage().deleteAllCookies();
       actionClass(carsRepairTitle.carRepair);
        Thread.sleep(1000);
    }

    @And("user click Auto Repair Prices")
    public void user_click_auto_repair_prices() throws InterruptedException {
        driver.manage().deleteAllCookies();
       jsClick(carsRepairTitle.autoRepair);
        Thread.sleep(1000);

    }

    @And("user click Car Recalls")
    public void user_click_car_recalls() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.carRecalls);
        Thread.sleep(1000);
    }

    @And("user click Mainte")
    public void user_click_mainte() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.maintenancePricing);
        Thread.sleep(1000);
    }

    @And("user click Find an Auto Shop")
    public void user_click_find_an_auto_shop() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.findingAutoShop);
        Thread.sleep(1000);
    }

    @And("user click Service & Repair Guide")
    public void user_click_service_repair_guide() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.selectService);
        Thread.sleep(1000);
    }

    @And("user click OBD-II Codes")
    public void user_click_obd_ii_codes() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.obdIICodes);
        Thread.sleep(1000);
    }
    @When("user select the year for a vehicle auto repair prices")
    public void user_select_the_year_for_a_vehicle_auto_repair_prices() throws InterruptedException {

        driver.manage().deleteAllCookies();
        selectDropddownValue(carsRepairTitle.Year, "2022");
        Thread.sleep(2000);
    }

    @When("user select the model for a vehicle auto repair prices")
    public void user_select_the_model_for_a_vehicle_auto_repair_prices() throws InterruptedException {
        selectDropddownValue(carsRepairTitle.Make, "Chevrolet");
        Thread.sleep(2000);
    }

    @When("user select the make for a vehicle auto repair prices")
    public void user_select_the_make_for_a_vehicle_auto_repair_prices() throws InterruptedException {
        driver.manage().deleteAllCookies();
        selectDropddownValue(carsRepairTitle.Model, "Blazer");
        Thread.sleep(2000);
    }

    @When("user select the style for a vehicle auto repair prices")
    public void user_select_the_style_for_a_vehicle_auto_repair_prices() throws InterruptedException {
        selectDropddownValue(carsRepairTitle.Style, "2LT Sport Utility 4D");
        Thread.sleep(2000);
    }

    @When("user click save button")
    public void user_click_save_button() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.SaveButton);
        Thread.sleep(2000);
    }
    @When("user select a Service or Repair from the menu")
    public void user_select_a_service_or_repair_from_the_menu() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.serviceGuide);
        driver.manage().deleteAllCookies();
        sendText(carsRepairTitle.serviceGuide, "AC Compressor Replacement");
        Thread.sleep(2000);

    }

    @When("user click See Price button")
    public void user_click_see_price_button() throws InterruptedException{
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.SeePricing);
        Thread.sleep(3000);
    }

    @Then("user verify the Fair Repair Range for Auto Repair")
    public void user_verify_the_fair_repair_range_for_auto_repair() throws InterruptedException {
        driver.manage().deleteAllCookies();
        String actualStringforfairrepair = driver.findElement(By.xpath("//h2[text()='Chevrolet Auto Repair Near Me']")).getText();
        String expectedString = "Chevrolet Auto Repair Near Me";
        assertTrue(actualStringforfairrepair.contains(expectedString));
        Thread.sleep(2000);
    }



}
