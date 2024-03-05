package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

      // driver.findElement(By.tagName("input")).sendKeys("amol");

        List<WebElement> wbList = driver.findElements(By.tagName("input"));

        System.out.println("size="+wbList.size());

        wbList.get(0).sendKeys("admin");
        wbList.get(1).sendKeys("admin");
        wbList.get(2).click();

        driver.findElement(By.linkText("Add Customer")).click();



    }
}
