package Home;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class Search extends CommonAPI
{
    //test 1
   /* @Test
    public void searchItem()
    {
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("computer", Keys.ENTER);
    }*/
//test 2
    @Test
    public void Login()
    {

       driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn");
       driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("sadiasehil89@gmail.com",Keys.ENTER);
       driver.findElement(By.xpath( "//*[@id=\"pass\"]")).sendKeys("koussa1989",Keys.ENTER);


    }



}