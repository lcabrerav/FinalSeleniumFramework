package SignInTest;


import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.Key;

public class SignIn extends CommonAPI {
    WebElement element = null;

    @Test
    public void forgotPassword() {
        try {
            driver.findElement(By.xpath("//*[@id=\"forgotPassword\"]")).click();

        } catch (Exception e) {
            System.out.println(e);
        }


  /*  @Test
     public void PasswordInput(){
        WebElement element = driver.findElement(By.cssSelector("#password-input-field"));
        element.sendKeys("luillo2301");
     }
     @Test
     public void SignInT() throws Exception{
        UserInput();
        Thread.sleep(2000);
        PasswordInput();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("signin-button"));
        element.click();
    }
    @Test
     public void openAnAccountMenu(){
        WebElement element = driver.findElement(By.className("header__section--dropdown__title__link chaseanalytics-track-link"));
         element.click();
    }
    @Test
    public void ForgotUserAndPassword(){
         driver.findElement(By.id("forgotPassword"));

    }
    @Test
     public void signUp(){
        WebElement element = driver.findElement(By.id("enrollment"));
        element.click();
     }*/
    }
}