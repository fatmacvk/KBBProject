package steps;


import Utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class carReviewsSteps extends CommonMethods {
    @When("I hover on Car reviews")
    public void i_hover_on() throws InterruptedException {
        actionClass(carReviewsTitle.carReviews);
        Thread.sleep(1000);

    }

    @And("I click the new user guide")
    public void i_click_the_new_user_guide() throws InterruptedException {
        driver.manage().deleteAllCookies();
        click(carReviewsTitle.newUserGuide);
        Thread.sleep(2000);

    }

    @And("I click the experts review")
    public void i_click_the_experts_review() throws InterruptedException {
       actionClass(carReviewsTitle.carReviewAfterClick);
        driver.manage().deleteAllCookies();
        jsClick(carReviewsTitle.expertsReview);
        Thread.sleep(2000);
    }



    @And("I click the electric vehicle")
    public void i_click_the_electric_vehicle() throws InterruptedException {
        //actionClass(carReviewsTitle.carReviewAfterClick);
        driver.manage().deleteAllCookies();
        jsClick(carReviewsTitle.electricVehicle);
        Thread.sleep(2000);
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

