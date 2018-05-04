package Users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UsersTest {
    Users users = new Users();
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\FCI\\3.2\\Software Engineering 2\\Assignments\\Assignment#2\\selenium-java-3.11.0\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "u1")
    public static Object[][] u1() {
        return new Object[][]{
                {"First Year"},
                {"Fourth Year"}
        };
    }
    @DataProvider(name = "u2")
    public static Object[][] u2() {
        return new Object[][]{
                {"name1@gmail.com"},
                {"nardeen@gmail.com"}
        };
    }
    @DataProvider(name = "u3")
    public static Object[][] u3() {
        return new Object[][]{
                {"name"},
                {"hhhh"}
        };
    }
    @DataProvider(name = "u4")
    public static Object[][] u4() {
        return new Object[][]{
                {"name"},
                {" rrr"}
        };
    }
    @DataProvider(name = "u5")
    public static Object[][] u5() {
        return new Object[][]{
                {"address"},
                {"giza"}
        };
    }
    @DataProvider(name = "u6")
    public static Object[][] u6() {
        return new Object[][]{
              //  {"Male"},
                {"Female"}
        };
    }

    @org.testng.annotations.Test(dataProvider = "u1")
    public void testUserSearchForUser(String q) throws Exception {
        assertEquals(true,users.testUsersSearchForYear(driver,q));
    }
    @org.testng.annotations.Test(dataProvider = "u2")
    public void testUserSearchForEmail(String q) throws Exception {
        assertEquals(true,users.testUsersSearchForEmail(driver,q));
    }
    @org.testng.annotations.Test(dataProvider = "u3")
    public void testUserSearchForContact(String q) throws Exception {
        assertEquals(true,users.testUsersSearchForContact(driver,q));
    }
    @org.testng.annotations.Test(dataProvider = "u4")
    public void testUserSearchForRoleNO(String q) throws Exception {
        assertEquals(true,users.testUsersSearchForRollNo(driver,q));
    }
    @org.testng.annotations.Test(dataProvider = "u5")
    public void testUserSearchForAddress(String q) throws Exception {
        assertEquals(true,users.testUsersSearchForAddress(driver,q));
    }
    @org.testng.annotations.Test(dataProvider = "u6")
    public void testUserSearchForGender(String q) throws Exception {
        assertEquals(true,users.testUsersSearchForGender(driver,q));
    }

    @AfterTest
    public void end(){
        driver.close();
    }
}