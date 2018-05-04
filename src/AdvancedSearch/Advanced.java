package AdvancedSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced {

    public static void main(String[] args) {
            String title = "Computer Graphics", author = "Charles Maru";

            System.setProperty("webdriver.chrome.driver", "F:\\FCI\\3.2\\Software Engineering 2\\Assignments\\Assignment#2\\selenium-java-3.11.0\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://localhost:88/library/member/");

            driver.findElement(By.name("username")).clear();
            driver.findElement(By.name("username")).sendKeys("mostafa");
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys("mostafa");

            driver.findElement(By.name("submit")).click();


            driver.get("http://localhost:88/library/member/books.php");

            driver.findElement(By.xpath("//a[@href='#myModal']")).click();

            driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//input[@id='inputEmail']")).sendKeys(title);
            driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//input[@id='inputPassword']")).sendKeys(author);
            driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//button[@type='submit']")).click();

        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
            if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
                System.out.println("Success");
            else {
                for (int i = 1; i <= sz; i++) {
                    String Temp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[" + i + "]/td[2]")).getText();
                    String Temp2 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[" + i + "]/td[4]")).getText();
                    if (Temp1.toLowerCase().equals(title.toLowerCase()) || Temp2.toLowerCase().equals(author.toLowerCase()))///
                        System.out.println("failed");

                }
            }
            System.out.println("Success");
    }

    public boolean testAdvancedSearchForBooksAndAuthor(WebDriver driver, String title, String author)
    {
        //WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("//a[@href='#myModal']")).click();
     //   driver.get("http://localhost/library-master/member/dashboard.php");
       // driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(title);
       // driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys(author);
        //driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//button[@type='submit']")).click();


      //  driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//input[@id='inputEmail']")).sendKeys(title);
       // driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//input[@id='inputPassword']")).sendKeys(author);
        driver.findElement(By.cssSelector("div.modal.hide.fade.in:nth-child(12) div.modal-body form.form-horizontal div.control-group:nth-child(3) div.controls > button.btn.btn-success")).click();


        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[2]")).getText();
            String Temp2 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[4]")).getText();
            if(Temp1.toLowerCase().equals(title.toLowerCase()) || Temp2.toLowerCase().equals(author.toLowerCase()))///
                return false;

        }
        return true;
    }

}
