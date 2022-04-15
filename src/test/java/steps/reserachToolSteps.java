package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

}


