package kbb.testbase;
import kbb.utils.ConfigsReader;
import kbb.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setUp() {


        ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);

        switch (ConfigsReader.getProperty("browser").toLowerCase()) {

            case "chrome":
              System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");  // this will hide mistakes suc as Time out
//              System.setProperty("webdriver.chrome.silentOutput", "true");


                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
                break;

            default:
                System.err.println("Browser is not supported");
        }

        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(ConfigsReader.getProperty("url"));
        driver.manage().deleteAllCookies();

    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
