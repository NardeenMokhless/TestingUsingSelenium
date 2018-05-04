package LogOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class logOutTest {

    logOut log = new logOut();
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\FCI\\3.2\\Software Engineering 2\\Assignments\\Assignment#2\\selenium-java-3.11.0\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "l1")
    public static Object[][] l1() {
        return new Object[][]{
                {"1","1"}
        };
    }
    @org.testng.annotations.Test(dataProvider = "l1")
    public void testLogOut(String username,String password) throws Exception {
        assertEquals(true,log.logout(driver,username,password));
    }

    @AfterTest
    public void end(){
        driver.close();
    }

}