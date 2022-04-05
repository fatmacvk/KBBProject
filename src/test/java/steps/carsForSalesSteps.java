package steps;

import Utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class carsForSalesSteps extends CommonMethods {


    @When("I hover on the cars for sale menu")
    public void i_hover_on_the_cars_for_sale_menu() throws InterruptedException {
        actionClass(carsForSaleTitle.carsForSaleMenu);
        Thread.sleep(1000);
        driver.manage().deleteAllCookies();
    }

    @And("I click the cars for sale")
    public void i_click_the_cars_for_sale() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsForSaleTitle.carsForSaleSubmenu);
        Thread.sleep(2000);

    }

    @And("I click the sell your car")
    public void i_click_the_sell_your_car() throws InterruptedException {
        driver.manage().deleteAllCookies();
        jsClick(carsForSaleTitle.sellYourCar);
        driver.manage().deleteAllCookies();

    }
    @And("I click the free dealers price quate")
    public void i_click_the_free_dealers_price_code() {
        driver.manage().deleteAllCookies();
        jsClick(carsForSaleTitle.priceQuate);
        driver.manage().deleteAllCookies();
    }

    @And("I click the vehicle history report")
    public void i_click_the_vehicle_history_report() {
        driver.manage().deleteAllCookies();
        jsClick(carsForSaleTitle.historyReport);
        driver.manage().deleteAllCookies();
    }


    @And("I click the find local dealers")
    public void i_click_the_find_local_dealers() {
        driver.manage().deleteAllCookies();
        jsClick(carsForSaleTitle.localDealers);
        driver.manage().deleteAllCookies();
    }


}
