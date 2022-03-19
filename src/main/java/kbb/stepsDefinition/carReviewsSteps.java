package kbb.stepsDefinition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import kbb.utils.CommonMethods;

public class carReviewsSteps extends CommonMethods {
    @When("I hover on {string}")
    public void i_hover_on(String string) throws InterruptedException {
        actionClass(carReviewsTitle.carReviews);
        Thread.sleep(1000);

    }

    @And("I click the new user guide")
    public void i_click_the_new_user_guide() throws InterruptedException {
        jsClick(carReviewsTitle.newUserGuide);
        Thread.sleep(1000);
        actionClass(carReviewsTitle.carReviews);
    }

    @And("I click the experts review")
    public void i_click_the_experts_review() throws InterruptedException {
        actionClass(carReviewsTitle.carReviews);
        jsClick(carReviewsTitle.expertsReview);
        //carReviewHover();
    }

    /*

    @And("I click the electric vehicle")
    public void i_click_the_electric_vehicle() throws InterruptedException {
        jsClick(carReviewsTitle.electricVehicle);
        carReviewHover();
    }

    @And("I click awards")
    public void i_click_awards() throws InterruptedException {
        jsClick(carReviewsTitle.awards);
        carReviewHover();
    }

    @And("I click latest news")
    public void i_click_latest_news() {
        jsClick(carReviewsTitle.latestNews);

    }
*/

    public void carReviewHover() throws InterruptedException {
        Thread.sleep(3000);
        actionClass(carReviewsTitle.carReviews);
        Thread.sleep(1000);


    }

}

