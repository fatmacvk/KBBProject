package steps;

import Utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class carsForSalesSteps extends CommonMethods {


    @When("I hover on the cars for sale menu")
    public void i_hover_on_the_cars_for_sale_menu() throws InterruptedException {
        driver.manage().deleteAllCookies();
        actionClass(carsForSaleTitle.carsForSaleMenu);
        Thread.sleep(1000);

    }

    @And("I choose the target mile and zipcode")
    public void i_choose_the_target_mile_and_zipcode() throws InterruptedException {
        driver.manage().deleteAllCookies();
        //click(carsForSaleTitle.notNow);
        Select drpCar = new Select(driver.findElement(By.id("2281868035")));
        drpCar.selectByVisibleText("75 Miles");
        Thread.sleep(2000);
        sendText(carsForSaleTitle.driver.findElement(By.xpath("//*[@id=\"2225141853\"]")),"29334");
        Thread.sleep(2000);
    }

    @And("I choose max and min year")
    public void i_choose_max_and_min_year() throws InterruptedException {
        scrollDown(200);
        Select minYear = new Select(driver.findElement(By.id("614960940")));
        minYear.selectByVisibleText("2005");

        Select maxYear = new Select(driver.findElement(By.id("2152820002")));
        maxYear.selectByVisibleText("2017");

    }
    @And("I choose the used cars and get the good deal")
    public void i_choose_the_used_cars() throws InterruptedException {

        //click(carsForSaleTitle.usedCarCheck);
        Thread.sleep(2000);
        String price=carsForSaleTitle.dealPrice.getText();
        System.out.println(price);
    }




    @And("I click the sell your car")
    public void i_click_the_sell_your_car() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        jsClick(carsForSaleTitle.sellYourCar);
        Thread.sleep(2000);
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
