package kbb.utils;

public class Constants {

    public static final String KBB_URL = "https://www.kbb.com/";

    public static final String BROWSER = "chrome";

    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir")
            + "/src/main/resources/drivers/chromedriver.exe"; // specify path to chrome

    public static final String CREDENTIALS_FILEPATH = System.getProperty("user.dir")

            + "/src/main/resources/configs/Configuration.properties";

    public static final String REPORT_FILRPATH = System.getProperty("user.dir") + "\\target\\report\\KBB.html";

    public static final String OS_NAME = System.getProperty("os.name");

    public static final String USER_NAME = System.getProperty("user.name");

    public static final String SCREENSHOTS_FILEPATH=System.getProperty("user.dir")+"\\target\\screenshots\\";

    public static final int PAGE_LOAD_TIME = 30;

    public static final int IMPLICIT_LOAD_TIME = 10;

    public static final int EXPLICIT_LOAD_TIME = 30;
}
