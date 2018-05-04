package AdvancedSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdvancedTest {
    Advanced advanced = new Advanced();

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\FCI\\3.2\\Software Engineering 2\\Assignments\\Assignment#2\\selenium-java-3.11.0\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "a1")
    public static Object[][] a1() {
        return new Object[][]{
                {"Computer Graphics","Charles Marut"}
        };
    }
    @org.testng.annotations.Test(dataProvider = "a1")
    public void testAdvanced1(String title,String author) throws Exception {
        assertEquals(true,advanced.testAdvancedSearchForBooksAndAuthor(driver,title,author));
    }
}