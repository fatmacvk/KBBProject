package steps;

import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class carRepairSteps extends CommonMethods {

    @Given("user hoover over CarRepair to click {string}")
    public void user_hoover_over_car_repair_to_click(String Submenus) throws InterruptedException {

        driver.manage().deleteAllCookies();
        WebElement mainMenu = carsRepairTitle.carRepair;

//Create object 'action' of an Actions class
            Actions actions = new Actions(driver);
            driver.manage().deleteAllCookies();
//moving to the main menu and then sub menu and clicking on it using object of the Actions class
            actions.moveToElement(mainMenu).perform();

      WebElement SubMAuto = carsRepairTitle.autoRepair;
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/header/div/nav/div[5]/ul/li[1]/a")));
//        actions.click(SubMAuto).perform();
//
//        Thread.sleep(1000);
      WebElement SubMRecal = carsRepairTitle.carRecalls;
//  //     actions.moveToElement(mainMenu).build().perform();
//       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/header/div/nav/div[5]/ul/li[2]/a")));
//        actions.dragAndDrop(SubMAuto, SubMRecal).build().perform();
//         actions.click(SubMRecal).perform();
//
//           Thread.sleep(1000);
////        actions.moveToElement(mainMenu).build().perform();
       WebElement SubMPricing = carsRepairTitle.maintenancePricing;
//       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/header/div/nav/div[5]/ul/li[3]/a")));
//           actions.click(SubMPricing).perform();
//           Thread.sleep(1000);

//         actions.click(SubMPricing).perform();
//         Thread.sleep(2000);
//
//            actions.click(SubMRecal).perform();
//
//            Thread.sleep(2000);
//            actions.click(SubMAuto).perform();
//
//            Thread.sleep(2000);

        click(SubMAuto);
        click(SubMPricing);
        click(SubMRecal);


           System.out.println(Submenus);

        }
        @Then("{string} is displayed successfully")
        public void is_displayed_successfully (String string){

        }
}
