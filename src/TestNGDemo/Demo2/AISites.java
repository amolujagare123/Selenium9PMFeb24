package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AISites {

    private WebDriver driver;

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
    public void openai() {
        driver.get("https://www.openai.com");
    }

    @Test
    public void tensorflow() {
        driver.get("https://www.tensorflow.org");
    }

    @Test
    public void pytorch() {
        driver.get("https://pytorch.org");
    }

    @Test
    public void kaggle() {
        driver.get("https://www.kaggle.com");
    }

    @Test
    public void machinelearningmastery() {
        driver.get("https://machinelearningmastery.com");
    }
}




