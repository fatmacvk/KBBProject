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

    @When("I hover the {string}")
    public void i_hover_over(String string) throws InterruptedException {
        actionClass(bestCarsTitle.carReviews);
        Thread.sleep(2000);

    }
    @And("I click the best cars")
    public void i_click_the_best_cars() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        click(bestCarsTitle.bestCars);
        Thread.sleep(2000);

    }
    @Then("I list each best compact car")
    public void i_click_see_the_list() throws InterruptedException {
        driver.manage().deleteAllCookies();
        System.out.println("BEST COMPACT CARS");


        List<WebElement> listElement = driver.findElements(By.xpath("//*[@id=\"primaryLists\"]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div/a/h3"));
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
        }
    }}
