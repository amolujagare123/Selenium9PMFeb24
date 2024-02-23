package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
       // driver.manage().window().maximize();
        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://facebook.com");

        Thread.sleep(4000);
     //   driver.close(); // closes the current window only
        driver.quit(); // closes all the windows opened by the driver



    }
}
