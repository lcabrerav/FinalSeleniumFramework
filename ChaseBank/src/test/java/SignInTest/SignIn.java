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
        WebElement element = driver.findElement(By.id("userId-input-field"));
        element.sendKeys("luillo123");
    }
    @Test
     public void PasswordInput(){
        WebElement element = driver.findElement(By.id("password-input-field"));
        element.sendKeys("luillo2301");
     }
     @Test
     public void SignInT(){
        UserInput();
        PasswordInput();
        WebElement element = driver.findElement(By.id("signin-button"));
        element.click();
    }
    @Test
     public void openAnAccountMenu(){
        WebElement element = driver.findElement(By.className("header__section--dropdown__title__link chaseanalytics-track-link"));
         element.click();
    }
    @Test
    public void ForgotPassword(){
        WebElement element = driver.findElement(By.id("forgotPassword"));
        element.click();
    }
}

