package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        driver.findElement(By.xpath("//button[text()='Try it']")).click();


        Alert alert =  driver.switchTo().alert();

        Thread.sleep(4000);
        System.out.println(alert.getText());
        //alert.accept();
        alert.dismiss();

    }
}
