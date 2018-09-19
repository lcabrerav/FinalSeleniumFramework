package Home;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen extends CommonAPI {

 WebDriverWait wait = new WebDriverWait(driver, 1, 50);

    public   void signInButton() {
        WebElement signInB = null;
        signInB = driver.findElement(By.id("signin-button"));
        wait.until(ExpectedConditions.visibilityOf(signInB));
        signInB.click();
    }



}
