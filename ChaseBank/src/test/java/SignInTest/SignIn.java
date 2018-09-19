package SignInTest;


import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignIn extends CommonAPI {

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
     public void SignIn(){
        UserInput();
        PasswordInput();

     }
}
