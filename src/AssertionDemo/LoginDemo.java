package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDemo {
    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

      /*  String expected = "https://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/


      /*  String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected = "Dashboard";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        /*int a = 10;
        int b =10;

        a==b; */

        //expected.equals(actual)

       Assert.assertEquals(actual,expected,"This is not a dashboard");

    }

    @Test
    public void loginTest2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("sdsdds");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("dsdsd");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        String expected = "Wrong Username or Password";
    }
}
