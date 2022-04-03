package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import Utils.CommonMethods;
import Utils.ConfigsReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class bestCarsSteps extends CommonMethods {

    @When("user hover the CarReviews")
    public void user_hover_the_car_reviews() throws InterruptedException {
        actionClass(bestCarsTitle.carReviews);
        Thread.sleep(2000);

    }
    @And("user click the best cars")
    public void user_click_the_best_cars() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        click(bestCarsTitle.bestCars);
        Thread.sleep(2000);

    }
    @And("user click the See Lists button")
    public void user_click_the_See_Lists_button() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        click(bestCarsTitle.seeTheList);
        Thread.sleep(2000);

    }
    @And("user click the {string} and the best compact {string}")
    public void userClickTheAndTheBestCompact(String number, String car) throws InterruptedException {


        driver.manage().deleteAllCookies();
        List<WebElement> listElement = (List<WebElement>) bestCarsTitle.Mercedes;
        for (int i = 0; i < listElement.size(); i++) {
            String elementText = listElement.get(i).getText();
            System.out.println("1-" + elementText);

            click(bestCarsTitle.Mercedes);

            driver.manage().deleteAllCookies();

            driver.navigate().back();

            Thread.sleep(3000);

            driver.manage().deleteAllCookies();


    }

//    @Then("the top three best compact cars is displayed successfully.")
//    public void the_top_three_best_compact_cars_is_displayed_successfully() {
//
//    }

}}
/*  List<WebElement> listElement = driver.findElements(By.xpath("//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div/a/h3"));
        for (int i = 0; i < listElement.size(); i++) {
            String elementText = listElement.get(i).getText();
            System.out.println("1-" + elementText);

            click(bestCarsTitle.Mercedes);

            driver.manage().deleteAllCookies();

            driver.navigate().back();

            Thread.sleep(3000);

            driver.manage().deleteAllCookies();

            List<WebElement> HONDA = driver.findElements(By.xpath("//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[2]/div/a[1]/div/div/p[2]"));
            for (int j = 0; j < listElement.size(); j++) {
                String elementTextHONDA = HONDA.get(i).getText();
                System.out.println("2-" + elementTextHONDA);


                Thread.sleep(2000);
                click(bestCarsTitle.Honda);


                driver.navigate().back();

                Thread.sleep(2000);

            }


            List<WebElement> mercedesC = driver.findElements(By.xpath("//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[2]/div/a[2]/div/div/p[2]"));
            for (int k = 0; k < listElement.size(); k++) {
                driver.manage().deleteAllCookies();
                String elementTextMercedesC = mercedesC.get(i).getText();
                System.out.println("3-" + elementTextMercedesC);

                click(bestCarsTitle.MercedesC);

                Thread.sleep(5000);

                driver.navigate().back();
            }

        } */
