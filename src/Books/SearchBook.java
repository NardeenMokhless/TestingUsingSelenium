package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SearchBook {

    public boolean testSearchForBookYear(WebDriver driver,String key)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("username");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(key);

        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[9]")).getText();
            if(!Temp.toLowerCase().equals(key))
                return false;
        }
        return true;
    }

    public boolean testSearchForBookTitle(WebDriver driver,String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);

        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[3]")).getText();
            if(!Temp.toLowerCase().equals(q.toLowerCase()))
                return  false;
        }
        return true;
    }

    public boolean testSearchForBookEdition(WebDriver driver,String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);
        //WebElement table = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]"));
        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[6]")).getText();
            if(!Temp.toLowerCase().equals(q.toLowerCase()))
                return  false;
        }
        return true;
    }

    public boolean testSearchForBookCategory(WebDriver driver,String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);
        WebElement table = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]"));
        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[3]")).getText();
            if(!Temp.toLowerCase().equals(q.toLowerCase()))
                return  false;
        }
        return true;
    }

    public boolean testSearchForBookAuthor(WebDriver driver,String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);
        WebElement table = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]"));
        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[4]")).getText();
            if(!Temp.toLowerCase().equals(q.toLowerCase()))
                return  false;
        }
        return true;
    }

    public boolean testSearchForBookPubName(WebDriver driver,String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);
        WebElement table = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]"));
        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[7]")).getText();
            if(!Temp.toLowerCase().equals(q.toLowerCase()))
                return  false;
        }
        return true;
    }

    public boolean testSearchForOldBooks(WebDriver driver,String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);
        //  WebElement table = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]"));
        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[11]")).getText();
            if(!Temp.toLowerCase().equals(q))
                return  false;
        }
        return true;
    }
}
