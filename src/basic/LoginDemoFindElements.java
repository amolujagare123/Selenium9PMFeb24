package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDemoFindElements {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");

        List<WebElement> wbList = driver.findElements(By.className("form-control")); // 1st element

        System.out.println("size="+wbList.size());

        wbList.get(0).sendKeys("demo");
        wbList.get(1).sendKeys("demo");

    }
}
