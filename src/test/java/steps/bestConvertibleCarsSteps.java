package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static utility.CommonMethods.*;
import static org.junit.Assert.assertEquals;
import static steps.PageInitializer.bestCarsTitle;

public class bestConvertibleCarsSteps {

    @When("I hover on {string}")
    public void i_hover_on(String string) throws InterruptedException {
        driver.manage().deleteAllCookies();
        actionClass1(bestCarsTitle.carReviews);
        Thread.sleep(2000);
    }

    @And("I click the best cars to see convertible cars")
    public void i_click_the_best_cars_to_see_convertible_cars() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        click(bestCarsTitle.bestCars);
        scrollDown(400);
        Thread.sleep(2000);

    }


    @And("I verify the first convertible car")
    public void i_verify_the_first_convertible_car() throws InterruptedException {
        String expectedName = "2022 MAZDA MX-5 Miata";
        String actual = bestCarsTitle.Mazda.getText();
        Thread.sleep(2000);
        System.out.println("First convertible car: " + actual);
        assertEquals(expectedName, actual);
        Thread.sleep(2000);

    }
    @And("I verify the second convertible car")
    public void i_verify_the_second_convertible_car() throws InterruptedException {
        String expectedName = "2021 Mercedes-Benz S-Class";
        String actual = bestCarsTitle.MercedesBenzS.getText();
        System.out.println("Second convertible car: " + actual);
        assertEquals(expectedName, actual);
        Thread.sleep(2000);
    }

    @And("I verify the third convertible car")
    public void i_verify_the_third_convertible_car() {
        String expectedName = "2022 Mercedes-Benz C-Class";
        String actual = bestCarsTitle.MercedesBenzCConvertable.getText();
        System.out.println("Third convertible car: " + actual);
        assertEquals(expectedName, actual);


    }
}

