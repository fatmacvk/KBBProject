package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class bestCompactCarsSteps extends CommonMethods {

    @When("I hover the {string}")
    public void i_hover_over(String string) throws InterruptedException {
        driver.manage().deleteAllCookies();
        actionClass1(bestCarsTitle.carReviews);
        Thread.sleep(2000);
        driver.manage().deleteAllCookies();
    }
    @And("I click the best cars")
    public void i_click_the_best_cars() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        click(bestCarsTitle.bestCars);
        Thread.sleep(2000);
        if (myKBBTitle.popup.isDisplayed()) {
            jsClick(myKBBTitle.popupexit);
        } else {
            System.out.println("popup is not displayed");
        }
    }
    @And("I verify the first compact car")
    public void i_verify_the_first_compact_car() throws InterruptedException {
        String expectedName = "2022 Mercedes-Benz A-Class";
        String actual = bestCarsTitle.Mercedes.getText();
        Thread.sleep(2000);
        System.out.println("First compact car: " + actual);
        assertEquals(expectedName, actual);
        Thread.sleep(2000);

    }
    @And("I verify the second compact car")
    public void i_verify_the_second_compact_car() {
        String expectedName = "2022 Honda Civic";
        String actual = bestCarsTitle.Honda.getText();
        System.out.println("Second compact car: " + actual);
        assertEquals(expectedName, actual);
    }

    @And("I verify the third compact car")
    public void i_verify_the_third_compact_car() {
        String expectedName = "2022 Mercedes-Benz C-Class";
        String actual = bestCarsTitle.MercedesC.getText();
        System.out.println("Third compact car: " + actual);
        assertEquals(expectedName, actual);
    }}