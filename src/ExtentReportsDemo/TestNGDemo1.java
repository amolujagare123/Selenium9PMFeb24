package ExtentReportsDemo;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static ExtentReportsDemo.util.Screenshot.getMyScreenshot;

public class TestNGDemo1 {

    ExtentReports extent;
    @BeforeClass
    public void initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression Testing");
        reporter.config().setDocumentTitle("Stock management System");

        extent.setSystemInfo("Project Name","Stock management System");
        extent.setSystemInfo("Developers Name","Vedashree");
        extent.setSystemInfo("Tester Name","Shubham");
        extent.setSystemInfo("Project Start Date","2 jan 2024");
        extent.setSystemInfo("Project Dead line","29 April 2024");
        extent.setSystemInfo("Executed By","Sanjeev");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }

    @Test
    public void loginTest1() throws IOException {

        ExtentTest test = extent.createTest("valid Login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("https://stock.scriptinglogic.org/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");
        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");
        test.info("Password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
        test.info("Login button is clicked");

        String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail("This test is failed since: "+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }


    }

    @Test
    public void loginTest2() throws IOException {

        ExtentTest test = extent.createTest("invalid Login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("https://stock.scriptinglogic.org/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");
        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");
        test.info("Password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
        test.info("Login button is clicked");

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        try {
            Assert.assertEquals(actual,expected,"wrong or no error message");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail("This test is failed since: "+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }

    }

    @Test
    public void loginTest3() throws IOException {

        ExtentTest test = extent.createTest("blank Login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("https://stock.scriptinglogic.org/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("ddsdsd");
        test.info("Username is kept blank");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("");
        test.info("Password is kept blank");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
        test.info("Login button is clicked");

        String expected1 = "PLEASE ENTER A USERNAME";
        String expected2 = "PLEASE PROVIDE A PASSWORD";

        ArrayList<String> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);

        /*ArrayList<String> expected = new ArrayList<>();
        expected.add("PLEASE ENTER A USERNAME");
        expected.add("PLEASE PROVIDE A PASSWORD");*/



        ArrayList<String> actual = new ArrayList<>();

        try {
            List<WebElement> wbList = driver.findElements(By.xpath("//label[@class='error']"));
            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());
        }
        catch (Exception e)
        {

        }


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);



        try {
            Assert.assertEquals(actual,expected,"wrong or no error message");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail("This test is failed since: "+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getMyScreenshot(driver));
        }

    }

  /*  @Test
    public void loginTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("dsds");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("dsdsd");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
    }

    @Test
    public void loginTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
    }*/

}
