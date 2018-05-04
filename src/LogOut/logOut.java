package LogOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logOut {
    public boolean logout(WebDriver driver,String username,String password)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
        return true;
    }
}
