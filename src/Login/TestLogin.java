package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mina_Yousry on 13/04/2018.
 */
public class TestLogin {
    boolean testLogin(WebDriver driver,String username, String password){
        driver.get("http://localhost/library-master/member/");
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("submit")).click();
        return !driver.getCurrentUrl().equals("http://localhost/library-master/member/");
    }

}
