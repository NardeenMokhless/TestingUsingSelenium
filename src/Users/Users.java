package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Users {
    public boolean testUsersSearchForYear(WebDriver driver, String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);

        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[8]")).getText();
            if(!Temp.toLowerCase().equals(q.toLowerCase()))
                return  false;
        }
        return true;
    }

    public boolean testUsersSearchForEmail(WebDriver driver, String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);

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

    public boolean testUsersSearchForContact(WebDriver driver, String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);

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

    public boolean testUsersSearchForRollNo(WebDriver driver, String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);

        int sz =  driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[\"+i+\"]")).size();
        if (sz == 1 && driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]")).getText().equals("No matching records found"))
            return true;

        for (int i =1;i<=sz;i++)
        {
            String Temp = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td[5]")).getText();
            if(!Temp.toLowerCase().equals(q.toLowerCase()))
                return  false;
        }
        return true;
    }

    public boolean testUsersSearchForAddress(WebDriver driver, String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(q);

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

    public boolean testUsersSearchForGender(WebDriver driver, String q)
    {
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();

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
}
