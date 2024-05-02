package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo3 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

        driver.switchTo().frame("iframeResult");

        driver.findElement(By.xpath("//button[text()='Try it']")).click();


       Alert alert =  driver.switchTo().alert();

        alert.sendKeys("Mithilesh");

        Thread.sleep(4000);
        alert.accept();


    }
}
