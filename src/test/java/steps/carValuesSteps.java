package steps;


import utility.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

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
    @And("user select the year for a vehicle")
    public void userSelectTheYearForAVehicle() throws InterruptedException {
        driver.manage().deleteAllCookies();
        selectDropddownValue(carValuesTitle.Year, "2024");
        Thread.sleep(2000);
    }

    @And("user select the model for a vehicle")
    public void userSelectTheModelForAVehicle() throws InterruptedException {
        selectDropddownValue(carValuesTitle.Make, "Chevrolet");
        Thread.sleep(2000);
    }


    @And("user select the make for a vehicle")
    public void userSelectTheMakeForAVehicle() throws InterruptedException {
        selectDropddownValue(carValuesTitle.Model, "Blazer EV");
        Thread.sleep(2000);
    }

    @And("user enter zip code for a vehicle")
    public void userEnterZipCodeForAVehicle() throws InterruptedException {
        jsClick(carValuesTitle.ZipCode);
        sendText(carValuesTitle.ZipCode, "32092");
        Thread.sleep(2000);
    }

    @And("user click next button")
    public void userClickNextButton() {
        jsClick(carValuesTitle.Nextbutton);

    }

    @Then("user verify the selected car")
    public void userVerifyTheSelectedCar() {
        String actualStringforAuto = driver.findElement(By.xpath("//div[@id='overview']/div[1]/div/div/div[2]/div/div[1]/div/div/div[1]/h1")).getText();
        String expectedString = "2024 Chevrolet Blazer EV";
        assertTrue(actualStringforAuto.contains(expectedString));
        System.out.println("I verified the selected car that user choose by model,zipcode and brand "+ actualStringforAuto);
    }
}

