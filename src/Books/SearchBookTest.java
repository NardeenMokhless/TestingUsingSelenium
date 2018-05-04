package Books;

import Register.register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchBookTest {
    SearchBook searchBook = new SearchBook();
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\FCI\\3.2\\Software Engineering 2\\Assignments\\Assignment#2\\selenium-java-3.11.0\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "searchbook1")
    public static Object[][] b1() {
        return new Object[][]{
                {"old"},
                {"new"},
                {"blabla"}
        };
    }
    @DataProvider(name = "searchbook2")
    public static Object[][] b2() {
        return new Object[][]{
                {"1997"},
                {"2002"},
                {"bbbbb"}
        };
    }

    @DataProvider(name = "searchbook3")
    public static Object[][] b3() {
        return new Object[][]{
                {"Graphics Design"},
                {"nnnnn"}
        };
    }

    @DataProvider(name = "searchbook4")
    public static Object[][] b4() {
        return new Object[][]{
                {"Second Edition"},
                {"Third Edition"},
                {"jjjjjj"}
        };
    }
    @DataProvider(name = "searchbook5")
    public static Object[][] b5() {
        return new Object[][]{
                {"Architecture"},
                {"Encyclopedia"}
        };
    }
    @DataProvider(name = "searchbook6")
    public static Object[][] b6() {
        return new Object[][]{
                {"Donald Hearn & Pauline Baker"},
                {"Merde C. Tan"},
                {"blalall"}
        };
    }
    @DataProvider(name = "searchbook7")
    public static Object[][] b7() {
        return new Object[][]{
                {"McGraw Hill"},
                {"Prentice Hall"},
                {"blalall"}
        };
    }

    @org.testng.annotations.Test(dataProvider = "searchbook1")
    public void testTestSearchForOldBooks(String q) throws Exception {
        assertEquals(true,searchBook.testSearchForOldBooks(driver,q));
    }

    @org.testng.annotations.Test(dataProvider = "searchbook2")
    public void testTestSearchForBookYear(String q) throws Exception {
        assertEquals(true,searchBook.testSearchForBookYear(driver,q));
    }

    @org.testng.annotations.Test(dataProvider = "searchbook3")
    public void testTestSearchForBookTitle(String q) throws Exception {
        assertEquals(true,searchBook.testSearchForBookTitle(driver,q));
    }

    @org.testng.annotations.Test(dataProvider = "searchbook4")
    public void testTestSearchForBookEdition(String q) throws Exception {
        assertEquals(true,searchBook.testSearchForBookEdition(driver,q));
    }

    @org.testng.annotations.Test(dataProvider = "searchbook5")
    public void testTestSearchForBookCategory(String q) throws Exception {
        assertEquals(true,searchBook.testSearchForBookCategory(driver,q));
    }
    @org.testng.annotations.Test(dataProvider = "searchbook6")
    public void testTestSearchForBookAuthor(String q) throws Exception {
        assertEquals(true,searchBook.testSearchForBookAuthor(driver,q));
    }

    @org.testng.annotations.Test(dataProvider = "searchbook7")
    public void testTestSearchForBookPubName(String q) throws Exception {
        assertEquals(true,searchBook.testSearchForBookPubName(driver,q));
    }

    @AfterTest
    public void end(){
        driver.close();
    }
}