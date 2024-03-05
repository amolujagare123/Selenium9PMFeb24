package JunitDemo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo3 {
    static WebDriver driver;

    @BeforeClass // method written below this annotation will run before first test method of the class
    public static void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass // method written below this annotation will run before last test method of the class
    public static void closeBrowser()
    {
        driver.close();
    }

    @Test // annotation
    public void loginTest1() throws InterruptedException {

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        Thread.sleep(4000);
        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
      //  btnLogin.click();
    }

    @Test
    public void loginTest2() throws InterruptedException {

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("dsds");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("dsdsd");
        Thread.sleep(4000);
        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
    //    btnLogin.click();
    }

    @Test
    public void loginTest3() throws InterruptedException {

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("");

        Thread.sleep(4000);
        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
      //  btnLogin.click();
    }

}
