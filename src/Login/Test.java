package Login;
import AdvancedSearch.Advanced;
import Login.TestLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        TestLogin t = new TestLogin();
        System.setProperty("webdriver.chrome.driver","D:\\Programs\\selenium-java-3.11.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        t.testLogin(driver,"1","1");
        t.testLogin(driver,"1","2");
        t.testLogin(driver,"2","1");
        t.testLogin(driver,"2","2");
    }
}
