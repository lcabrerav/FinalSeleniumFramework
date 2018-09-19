package HomPageFunctions;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccountOpennigs extends CommonAPI {
    @Test
    public void checkingAccountFunction () {
        driver.get("url");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"DA_539361538983\"]/a/div[2]"));
        element.click();
    }
    @Test
    public void freeCreditScore(){
        driver.get("url");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"DA_104464986914\"]/a/div[2]"));
        element.click();
    }
    @Test
    public void findCreditCard(){
        driver.get("url");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"DA_946368735260\"]/a/div[2]"));
        element.click();
    }
    @Test
    public void homeLending(){
        driver.get("url");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"DA_359047804762\"]/a/div[2]"));
        element.click();
    }
    @Test
    public void carBuyingLoans(){
        driver.get("url");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"DA_151774008453\"]/a/div[2]"));
        element.click();
    }
    @Test
    public void rightArrow(){
        driver.get("url");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"custom-pager__container-b\"]/div[3]"));
        element.click();
    }
    @Test
    public void savingsAccountOpening (){
        rightArrow();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"DA_717828753162\"]/a/div[2]"));
        element.click();
     }
     public void chaseForBussines(){
        rightArrow();
        rightArrow();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"DA_39268018429\"]/a/div[1]"));
        element.click();
     }
}

