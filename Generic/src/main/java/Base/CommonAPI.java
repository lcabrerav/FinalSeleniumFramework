package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public  static WebDriver driver = null;

    @BeforeMethod

    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/luiscabrera/Documents/WebAutomation/Generic/BrowserDriver/chromedriver 3");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.get("https://www.chase.com");
    }

   // @AfterMethod
    //public void close(){


       // driver.close();
   // }
}
