package SignInTest;


import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignIn extends CommonAPI {


    @Test
    public void chaseBankLaunch(){
        driver.get("url");
    }
    @Test
    public void UserInput (){
        driver.get("url");
        WebElement element = driver.findElement(By.id("userId-input-field"));
        element.sendKeys("luillo123");
    }
    @Test
     public void PasswordInput(){
        driver.get("url");
        WebElement element = driver.findElement(By.id("password-input-field"));
        element.sendKeys("luillo2301");
     }
     @Test
     public void SignInT() throws Exception{
        driver.get("url");
        UserInput();
        Thread.sleep(2000);
        PasswordInput();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("signin-button"));
        element.click();
    }
    @Test
     public void openAnAccountMenu(){
       driver.get("url");
        WebElement element = driver.findElement(By.className("header__section--dropdown__title__link chaseanalytics-track-link"));
         element.click();
    }
    @Test
    public void ForgotUserAndPassword(){
       driver.get("url");
        WebElement element = driver.findElement(By.id("forgotPassword"));
        element.click();
    }
    @Test
     public void signUp(){
       driver.get("url");
        WebElement element = driver.findElement(By.id("enrollment"));
        element.click();
     }
}

