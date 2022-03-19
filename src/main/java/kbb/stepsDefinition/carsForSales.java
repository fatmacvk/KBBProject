package kbb.stepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import kbb.utils.CommonMethods;

public class carsForSales extends CommonMethods {


    @When("I hover on the cars for sale menu")
    public void i_hover_on_the_cars_for_sale_menu() throws InterruptedException {
        actionClass(carsForSaleTitle.carsForSaleMenu);
        Thread.sleep(1000);
    }

    @And("I click the cars for sale")
    public void i_click_the_cars_for_sale() throws InterruptedException {
        jsClick(carsForSaleTitle.carsForSaleSubmenu);
        Thread.sleep(2000);
        actionClass(carsForSaleTitle.carsForSaleMenuHover);
        Thread.sleep(1000);
    }

    @And("I click the sell your car")
    public void i_click_the_sell_your_car() {
        driver.manage().deleteAllCookies();
        jsClick(carsForSaleTitle.sellYourCar);
        driver.manage().deleteAllCookies();
    }


}
