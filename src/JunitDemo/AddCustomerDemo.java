package JunitDemo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomerDemo {
    static WebDriver driver;
    @BeforeClass
    public static void doLogin()
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
    public void addCustomerTest()
    {

        driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.name("name")).sendKeys("Swetha");
        driver.findElement(By.name("address")).sendKeys("Bangalore");
        driver.findElement(By.name("contact1")).sendKeys("7987878");
        driver.findElement(By.name("contact2")).sendKeys("7767677");
        driver.findElement(By.name("Submit")).click();
    }

    @Test
    public void viewCustomer()
    {

        driver.findElement(By.xpath("//a[contains(@href,'d_customer')]")).click();
        driver.findElement(By.xpath("//a[text()='View Customers']")).click();

        String name = "kalyani";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//a[contains(@class,'edit')]")).click();

        String myXpath = "//tr[td[text()='"+name+"']]//a[contains(@class,'edit')]";
    }
}
