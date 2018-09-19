package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public  static WebDriver driver = null;
    String url = null;
    @BeforeMethod
    public void SetUp(){
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "/Users/luiscabrera/Documents/WebAutomation/Generic/BrowserDriver/chromedriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static WebDriver handleNewTab(WebDriver driver){
        String oldTab = driver.getWindowHandle();
        List<String > newTabs = new ArrayList<String>(driver.getWindowHandles());
        newTabs.remove(oldTab);
        driver.switchTo().window(newTabs.get(0));
        return driver;
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
