package xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DataTableDemo1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://editor.datatables.net/examples/simple/inTableControls.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String custName = "Ashton Cox";
      //  driver.findElement(By.xpath("//tr[td[text()='Cara Stevens']]//i[contains(@class,'pencil')]")).click();
        driver.findElement(By.xpath("//tr[td[text()='"+ custName+"']]//i[contains(@class,'pencil')]")).click();


    }
}
