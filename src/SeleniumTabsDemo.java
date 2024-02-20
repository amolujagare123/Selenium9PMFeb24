import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SeleniumTabsDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://facebook.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://naukri.com");

        Thread.sleep(2000);

        List<String> windows = new ArrayList(driver.getWindowHandles());

       // System.out.println(windows);

        driver.switchTo().window(windows.get(1));

        System.out.println(driver.getTitle());


    }
}
