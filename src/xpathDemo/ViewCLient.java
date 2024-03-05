package xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewCLient {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.invoiceplane.com/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("admin@invoiceplane.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtPassword.sendKeys("demopassword");

        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();

        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();

        String name = "Allen Tan";

        driver.findElement(By.xpath("//tr[td/a[text()='" + name + "']]//div")).click();
        //driver.findElement(By.xpath("//tr[td/a[text()='Bean']]//li[2]")).click();
        driver.findElement(By.xpath("//tr[td/a[text()='" + name + "']]//i[contains(@class,'edit')]")).click();






    }
}
