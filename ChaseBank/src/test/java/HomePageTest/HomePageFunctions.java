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
    public void CreateAnAccount() {
        driver.findElement(By.xpath("//*[@id=\"Module1\"]/section/div/div/div[2]/div/a")).click();
    }


    @Test
    public void atmBranchFunctions () {
        driver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[3]/ul/li[1]/a")).click();
    }
    @Test
    public void lenguageFunction () {
           driver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[3]/ul/li[2]/a")).click();
        }

   /*  }
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
