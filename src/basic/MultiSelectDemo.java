package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the web element
        WebElement multiSelText = driver.findElement(By.id("multiSel"));

        // 2. Create the object of the Select Class
        Select selText = new Select(multiSelText);

        Thread.sleep(4000);

        // 3. Select the option / item
        selText.selectByIndex(2);
        selText.selectByVisibleText("text 1");
        selText.selectByIndex(3);

        Thread.sleep(2000);
        /*selText.deselectByIndex(2);

        Thread.sleep(2000);
        selText.deselectByVisibleText("text 1");

        Thread.sleep(2000);
        selText.deselectByIndex(3);*/

        selText.deselectAll();



    }
}
