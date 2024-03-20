package TestNGDemo.real;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSite {
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

    @Test
    public void w3schools() {
        driver.get("https://www.w3schools.com");
    }

    @Test
    public void tutorialspoint() {
        driver.get("https://www.tutorialspoint.com");
    }

    @Test
    public void udemy() {
        driver.get("https://www.udemy.com");
    }

    @Test
    public void codecademy() {
        driver.get("https://www.codecademy.com");
    }

    @Test
    public void javatpoint() {
        driver.get("https://www.javatpoint.com");
    }
}
