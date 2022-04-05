package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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
        jsClick(carsRepairTitle.serviceGuide);
        Thread.sleep(1000);
    }

    @And("user click OBD-II Codes")
    public void user_click_obd_ii_codes() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsRepairTitle.obdIICodes);
        Thread.sleep(1000);
    }

    @Then("user verify all submenu is displayed successfully")
    public void userVerifyAllSubmenuIsDisplayedSuccessfully() {

        String actualStringforAuto = driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div/div[3]/div/div/div/div/h1")).getText();
        String expectedString = "ExpectedString";
        assertTrue(actualStringforAuto.contains(expectedString));

    }

}
