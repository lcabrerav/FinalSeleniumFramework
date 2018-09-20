package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public  static WebDriver driver = null;

    @BeforeMethod

    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\IdeaProjects\\FinalSeleniumFramework\\Generic\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        //driver.get("https://www.Ebay.com");
    }

   /* @AfterMethod
    public void close(){


        driver.close();
   }*/
}
