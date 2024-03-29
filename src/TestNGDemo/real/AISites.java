package TestNGDemo.real;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites extends Base{



    @Test
    public void openai() {
        driver.get("https://www.openai.com");

        Assert.assertEquals(driver.getTitle(),"my tensorflow" ,
                "this is not our page");
    }

  /*  @Test
    public void tensorflow() {
        driver.get("https://www.tensorflow.org");

        Assert.assertEquals(driver.getTitle(),"my tensorflow" ,
                "this is not our page");
    }*/

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




