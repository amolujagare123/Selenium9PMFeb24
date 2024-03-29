import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addCustomer {

     WebDriver driver;

    @Before //Method written below this annotation will run before every test method of the class
    public void doLogin() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement username = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        username.click();
        username.sendKeys("admin");

        WebElement Password = driver.findElement(By.xpath("//input[@id='login-password']"));
        Password.click();
        Password.sendKeys("admin");

        WebElement Loginbuttn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        Loginbuttn.click();
    }


    @Test
    public void addCustomer1() throws InterruptedException {



        driver.findElement(By.xpath("//*[text()=\"Add Customer\"]")).click();

       WebElement Name = driver.findElement(By.xpath("//input[@name=\"name\"]"));
       Name.sendKeys("Mia");

       //Address

        driver.findElement(By.xpath("//textarea[@name=\"address\"]")).sendKeys("ABC");
        driver.findElement(By.xpath("//input[@name=\"contact1\"]")).sendKeys("DEF");

        driver.findElement(By.xpath("//input[@name=\"contact2\"]")).sendKeys("875125487");

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }

    @Test
    public void addCustomer2()
     {

         // Find the element using XPath with normalization and click it

         driver.findElement(By.xpath("//*[text()=\"Add Customer\"]")).click();

         WebElement Name = driver.findElement(By.xpath("//input[@name=\"name\"]"));
         Name.sendKeys("Sunny");

         //Address
         driver.findElement(By.xpath("//textarea[@name=\"address\"]")).sendKeys("ABC");
         driver.findElement(By.xpath("//input[@name=\"contact1\"]")).sendKeys("DEF");

         //Contact
         driver.findElement(By.xpath("//input[@name=\"contact2\"]")).sendKeys("875125487");

         //Click on Submmit buttn
         driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

     }


}



