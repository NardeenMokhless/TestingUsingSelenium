package Transaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class transactionTest {
    transaction tra = new transaction();
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\FCI\\3.2\\Software Engineering 2\\Assignments\\Assignment#2\\selenium-java-3.11.0\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "trans1")
    public static Object[][] t1() {
        return new Object[][]{
                {"nardeen"},
                {"jahid mahmud"}
        };
    }

    @DataProvider(name = "trans2")
    public static Object[][] t2() {
        return new Object[][]{
                {"Assembly Language Programming"},
                {"boook"}
        };
    }
    @DataProvider(name = "trans3")
    public static Object[][] t3() {
        return new Object[][]{
                {"Fourth Year"},
                {"Third Year"}
        };
    }
    @DataProvider(name = "trans4")
    public static Object[][] t4() {
        return new Object[][]{
                {"nardeen"},
                {"jahidd26@gmail.com"}
        };
    }
    @DataProvider(name = "trans5")
    public static Object[][] t5() {
        return new Object[][]{
                {"2015-12-14 02:39:23"},
                {"2016-07-31 05:29:22"}
        };
    }
    @DataProvider(name = "trans6")
    public static Object[][] t6() {
        return new Object[][]{
                {"17/12/2015"},
                {"31/01/1997"}
        };
    }

    @org.testng.annotations.Test(dataProvider = "trans1")
    public void testTestTransaction1(String q) throws Exception {
        assertEquals(true,tra.testTransactionSearchForBorrower(driver,q));
    }

    @org.testng.annotations.Test(dataProvider = "trans2")
    public void testTestTransaction2(String q) throws Exception {
        assertEquals(true,tra.testTransactionSearchForBookTitle(driver,q));
    }

    @org.testng.annotations.Test(dataProvider = "trans3")
    public void testTestTransaction3(String q) throws Exception {
        assertEquals(true,tra.testTransactionSearchForYear(driver,q));
    }

    @org.testng.annotations.Test(dataProvider = "trans4")
    public void testTestTransaction4(String q) throws Exception {
        assertEquals(true,tra.testTransactionSearchForEmail(driver,q));
    }
    @org.testng.annotations.Test(dataProvider = "trans5")
    public void testTestTransaction5(String q) throws Exception {
        assertEquals(true,tra.testTransactionSearchForDateBorrow(driver,q));
    }
    @org.testng.annotations.Test(dataProvider = "trans6")
    public void testTestTransaction6(String q) throws Exception {
        assertEquals(true,tra.testTransactionSearchForDueDate(driver,q));
    }

    @AfterTest
    public void end(){
        driver.close();
    }
}