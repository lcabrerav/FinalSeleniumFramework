package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class KCommonApi {


    public static WebDriver driver = null;

    @BeforeMethod
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/ismayatikiran/Documents/FinalSeleniumFramework/Generic/BrowserDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
    }
}
