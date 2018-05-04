package Register;

import Register.register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

/**
 * Created by Mina_Yousry on 13/04/2018.
 */
public class registerTest {
    register rg = new register();
    WebDriver  driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\FCI\\3.2\\Software Engineering 2\\Assignments\\Assignment#2\\selenium-java-3.11.0\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "rs")
    public static Object[][] rs() {
        return new Object[][]{
                {true, "fn", "ln", "address", "name", "name", "name1", "name"},
                {false, "fn", "ln", "address", "name", "name", "name1", "name"}
        };
    }

    @DataProvider(name = "rs2")
    public static Object[][] rs2() {
        return new Object[][]{
                {true, "ln", "address", "name", "name", "name1", "name"},
                {false, "ln", "address", "name", "name", "name1", "name"}
        };
    }
    @DataProvider(name = "rs3")
    public static Object[][] rs3() {
        return new Object[][]{
                {true,"fn", "ln", "address", "name", "name", "name1"},
                {false,"fn", "ln", "address", "name", "name", "name1"}
        };
    }

    @DataProvider(name = "rt")
    public static Object[][] rt() {
        return new Object[][]{
                {true, "fn", "ln", "address", "name", "name", "t1", "name"},
                {false, "fn", "ln", "address", "name", "name", "t1", "name"}
        };
    }


    @org.testng.annotations.Test(dataProvider = "rs")
    public void testRegisterStudent(boolean r, String fn, String ln,
                                    String address, String rol, String contact, String username,
                                    String pass) throws Exception {
        Assert.assertEquals(r, rg.registerStudent(driver, fn, ln, address, rol, contact, username, pass));
    }

    @org.testng.annotations.Test(dataProvider = "rs2")
    public void testRegisterStudent1(boolean r, String ln,
                                    String address, String rol, String contact, String username,
                                    String pass) throws Exception {
        Assert.assertEquals(r, rg.registerStudent2(driver, ln, address, rol, contact, username, pass));
    }

    @org.testng.annotations.Test(dataProvider = "rs3")
    public void testRegisterStudent2(boolean r,String fn, String ln,
                                    String address, String rol, String contact, String username)
                                    throws Exception {
        Assert.assertEquals(r, rg.registerStudent3(driver,fn, ln, address, rol, contact, username));
    }

    @Test(dataProvider = "rt")
    public void testRegisterTeacher(boolean r, String fn, String ln,
                                    String address, String rol, String contact, String username,
                                    String pass) throws Exception {
        Assert.assertEquals(r, rg.registerTeacher(driver, fn, ln, address, rol, contact, username, pass));
    }

    @AfterTest
    public void end(){
        driver.close();
    }
}