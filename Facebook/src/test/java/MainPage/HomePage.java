package MainPage;

import Base.KCommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends KCommonApi {
    @Test
    public void ForgotPassword(){
    driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a"));

    }
}
