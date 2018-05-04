package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class TestLoginTest {
    TestLogin testLogin = new TestLogin();
    WebDriver driver;
    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver","F:\\FCI\\3.2\\Software Engineering 2\\Assignments\\Assignment#2\\selenium-java-3.11.0\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @DataProvider(name = "logindata")
    public static Object[][] data(){
        return new Object[][] {{true,"1","1"},{false,"1","2"},{false,"2","2"},{true,"1","1"},};
    }

    @org.testng.annotations.Test(dataProvider = "logindata")
    public void testTestLogin(boolean result,String un,String ps) throws Exception {
        Assert.assertEquals(result,testLogin.testLogin(driver,un,ps));
    }
    @AfterTest
    public void end(){
        driver.close();
    }
}