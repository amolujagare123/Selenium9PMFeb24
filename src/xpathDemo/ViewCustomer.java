package xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewCustomer {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        driver.findElement(By.xpath("//a[contains(@href,'d_customer')]")).click();
        driver.findElement(By.xpath("//a[text()='View Customers']")).click();

        String name = "Apoorva";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//a[contains(@class,'edit')]")).click();

        String myXpath = "//tr[td[text()='"+name+"']]//a[contains(@class,'edit')]";



    }
}
