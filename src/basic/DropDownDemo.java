package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the web element
        WebElement drpSelText = driver.findElement(By.id("seltext"));

        // 2. Create the object of the Select Class
        Select selText = new Select(drpSelText);

        Thread.sleep(4000);

        // 3. Select the option / item
     //   selText.selectByVisibleText("text 2");
      //  selText.selectByIndex(3);
        selText.selectByValue("v13");



    }
}
