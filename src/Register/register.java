package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class register {

    boolean registerStudent(WebDriver driver,String fn,String ln,
                     String address,String roln, String ctct,
                            String username, String password){
        driver.get("http://localhost/library-master/student_form.php");
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(fn);
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(ln);
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("roll")).clear();
        driver.findElement(By.name("roll")).sendKeys(roln);
        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys(ctct);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("submit")).click();

        return driver.getCurrentUrl().equals("http://localhost/library-master/success.php");
    }
    boolean registerStudent3(WebDriver driver,String fn,String ln,
                            String address,String roln, String ctct,
                            String username){
        driver.get("http://localhost/library-master/student_form.php");
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(fn);
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(ln);
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("roll")).clear();
        driver.findElement(By.name("roll")).sendKeys(roln);
        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys(ctct);
        //driver.findElement(By.name("password")).clear();
        //driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("submit")).click();

        return driver.getCurrentUrl().equals("http://localhost/library-master/student_form.php");
    }

    boolean registerStudent2(WebDriver driver,String ln,
                             String address,String roln, String ctct,
                             String username, String password){
        driver.get("http://localhost/library-master/student_form.php");
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
        // driver.findElement(By.name("firstname")).clear();
        //driver.findElement(By.name("firstname")).sendKeys(fn);
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(ln);
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("roll")).clear();
        driver.findElement(By.name("roll")).sendKeys(roln);
        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys(ctct);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("submit")).click();

        return driver.getCurrentUrl().equals("http://localhost/library-master/student_form.php");
    }

    boolean registerTeacher(WebDriver driver,String fn,String ln,
                            String address,String roln,
                            String ctct, String username, String password){
        driver.get("http://localhost/library-master/teacher_form.php");
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(fn);
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(ln);
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(address);
//        driver.findElement(By.name("roll")).clear();
//        driver.findElement(By.name("roll")).sendKeys(roln);
        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys(ctct);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("submit")).click();

        return driver.getCurrentUrl().equals("http://localhost/library-master/success.php");
    }
}
