package Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class transaction {
    public boolean testTransactionSearchForBorrower(WebDriver driver, String borrower)
    {
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(borrower);


        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[2]")).getText();
            if(!Temp1.toLowerCase().equals(borrower.toLowerCase()))
                return false;
        }
        return true;
    }

    public boolean testTransactionSearchForBookTitle(WebDriver driver, String borrower)
    {
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(borrower);


        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[1]")).getText();
            if(!Temp1.toLowerCase().equals(borrower.toLowerCase()))
                return false;
        }
        return true;
    }

    public boolean testTransactionSearchForYear(WebDriver driver, String borrower)
    {
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(borrower);


        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[3]")).getText();
            if(!Temp1.toLowerCase().equals(borrower.toLowerCase()))
                return false;
        }
        return true;
    }

    public boolean testTransactionSearchForEmail(WebDriver driver, String borrower)
    {
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(borrower);


        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[5]")).getText();
            if(!Temp1.toLowerCase().equals(borrower.toLowerCase()))
                return false;
        }
        return true;
    }

    public boolean testTransactionSearchForDateBorrow(WebDriver driver, String borrower)
    {
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(borrower);


        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[6]")).getText();
            if(!Temp1.toLowerCase().equals(borrower.toLowerCase()))
                return false;
        }
        return true;
    }

    public boolean testTransactionSearchForDueDate(WebDriver driver, String borrower)
    {
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(borrower);


        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[7]")).getText();
            if(!Temp1.toLowerCase().equals(borrower.toLowerCase()))
                return false;
        }
        return true;
    }
}
