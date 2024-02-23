package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // click on the check-boxes which are already selected
        // un-tick all checkboxes

        WebElement java = driver.findElement(By.id("check0"));
        WebElement selenium = driver.findElement(By.id("check1"));
        WebElement cucumber = driver.findElement(By.id("check2"));

        Thread.sleep(4000);

        if (java.isSelected())
            java.click();

        if (selenium.isSelected())
            selenium.click();

        if (cucumber.isSelected())
            cucumber.click();


    }
}
