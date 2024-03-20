package ScreenshotDemo;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestNGDemo1 {

    @Test
    public void loginTest1() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");

        // 1. create the object reference of TakesScreenshot assign current driver to it
        // type cast the driver into TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using object reference of TakesScreenshot
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";


        // 3. copy the file object into a real image file
        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));



    }



}
