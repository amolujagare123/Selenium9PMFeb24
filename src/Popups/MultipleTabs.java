package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class MultipleTabs {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://instagram.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://facebook.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://gmail.com");

        Thread.sleep(2000);

        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(0));

        System.out.println(driver.getTitle());


    }
}
