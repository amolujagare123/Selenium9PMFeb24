package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

    WebDriver driver;

    @BeforeClass
    public  void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public  void closeBrowser()
    {
        driver.close();
    }

    @Test (priority = 5)
    public void facebook() {
        driver.get("https://www.facebook.com");
    }

    @Test  (priority = 4)
    public void instagram() {
        driver.get("https://www.instagram.com");
    }

    @Test (priority = 3)
    public void twitter() {
        driver.get("https://www.twitter.com");
    }

    @Test (priority = 2)
    public void linkedIn() {
        driver.get("https://www.linkedin.com");
    }

    @Test (priority = 1)
    public void pinterest() {
        driver.get("https://www.pinterest.com");
    }

}
