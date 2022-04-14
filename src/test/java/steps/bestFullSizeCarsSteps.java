package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static Utils.CommonMethods.*;
import static Utils.CommonMethods.scrollDown;
import static org.junit.Assert.assertEquals;
import static steps.PageInitializer.bestCarsTitle;

public class bestFullSizeCarsSteps {
    @When("I hover on {string} for fullsize car")
    public void i_hover_on(String string) throws InterruptedException {
        driver.manage().deleteAllCookies();
        actionClass1(bestCarsTitle.carReviews);
        Thread.sleep(2000);
    }

    @And("I click the best cars to see fullsize cars")
    public void i_click_the_best_cars_to_see_convertible_cars() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        click(bestCarsTitle.bestCars);
        scrollDown(700);
        Thread.sleep(2000);
        if(myKBBTitle.popup.isDisplayed()){
            jsClick(myKBBTitle.popupexit);
        }else{
            System.out.println("popup is not displayed");
        }
    }


    @And("I verify the first best fullsize car")
    public void i_verify_the_first_fullsize_car() throws InterruptedException {
        String expectedName = "2022 Mercedes-Benz S-Class";
        String actual = bestCarsTitle.MercedesBenzSFullsize.getText();
        Thread.sleep(2000);
        System.out.println("First fullsize car: " + actual);
        assertEquals(expectedName, actual);
        Thread.sleep(2000);

    }
    @And("I verify the second fullsize car")
    public void i_verify_the_second_convertible_car() {
        String expectedName = "2022 Audi A7";
        String actual = bestCarsTitle.audiA7.getText();
        System.out.println("Second fullsize car: " + actual);
        assertEquals(expectedName, actual);
    }

    @And("I verify the third fullsize car")
    public void i_verify_the_third_convertible_car() {
        String expectedName = "2022 BMW 7 Series";
        String actual = bestCarsTitle.BMW7Series.getText();
        System.out.println("Third fullsize car: " + actual);
        assertEquals(expectedName, actual);


    }

}
