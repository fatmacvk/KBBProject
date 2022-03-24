package steps;

import Utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class carsForSales extends CommonMethods {


    @When("I hover on the cars for sale menu")
    public void i_hover_on_the_cars_for_sale_menu() throws InterruptedException {
        actionClass(carsForSaleTitle.carsForSaleMenu);
        Thread.sleep(1000);
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
    public void i_click_the_free_dealers_price_quate() {
        driver.manage().deleteAllCookies();
        jsClick(carsForSaleTitle.priceQuate);
        driver.manage().deleteAllCookies();
    }

}