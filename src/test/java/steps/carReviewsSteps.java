package steps;


import utility.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class carReviewsSteps extends CommonMethods {
    @When("I hover on Car reviews")
    public void i_hover_on() throws InterruptedException {
        driver.manage().deleteAllCookies();
        actionClass(carReviewsTitle.carReviews);
        Thread.sleep(2000);
    }

    @And("I click the new user guide")
    public void i_click_the_new_user_guide() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carReviewsTitle.newUserGuide);
        Thread.sleep(2000);

    }

    @And("I click the electric vehicle")
    public void i_click_the_electric_vehicle() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carReviewsTitle.electricVehicle);
        Thread.sleep(2000);
    }

    @And("I click the 2022 Lexus")
    public void i_click_the_2022_lexus() throws InterruptedException {

        driver.manage().deleteAllCookies();
        jsClick(driver.findElement(By.xpath("//*[@id=\"tdi_48\"]/div/div/div[1]/div/a")));
       scrollDown(200);

    }

    @And("I click awards")
    public void i_click_awards() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carReviewsTitle.awards);
        Thread.sleep(2000);
    }
    @And("I click latest news")
    public void i_click_latest_news() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carReviewsTitle.latestNews);
        Thread.sleep(2000);

    }
}

