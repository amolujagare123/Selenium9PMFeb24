package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddCustomerDemo {
    WebDriver driver;
    @BeforeClass
    public void doLogin()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
    }
    @Test
    public void addCustomerDemo1()
    {
        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        String expected = "PLEASE ENTER A CUSTOMER NAME";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong or no error message");
    }

    @Test
    public void addCustomerDemo2()
    {
        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();

        String customerName = "Mithilesh123";
        driver.findElement(By.name("name")).sendKeys(customerName);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("434343");
        driver.findElement(By.name("contact2")).sendKeys("43434");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        String expected = "[ "+customerName+" ] Customer Details Added !";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong or no message");
    }

    @Test
    public void addCustomerDemo3()
    {
        driver.findElement(By.xpath("//a[normalize-space()='Add Customer']")).click();

        String customerName = "Mithilesh123";
        driver.findElement(By.name("name")).sendKeys(customerName);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("434343");
        driver.findElement(By.name("contact2")).sendKeys("43434");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        String expected = "Customer Details Added";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        boolean result = actual.contains(expected);

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertTrue(result,"wrong or no message");
    }
}
