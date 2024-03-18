package AssertionDemo;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginDemo {
    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

      /*  String expected = "https://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/


      /*  String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

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

        /*int a = 10;
        int b =10;

        a==b; */

        //expected.equals(actual)

       Assert.assertEquals(actual,expected,"This is not a dashboard");

    }

    @Test
    public void loginTest2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"wrong or no error message");


    }

    @Test
    public void loginTest3() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

      /*  String expected1 = "PLEASE ENTER A USERNAME";
        String expected2 = "PLEASE PROVIDE A PASSWORD";

        String[] expected = {expected1,expected2};*/
        String[] expected = {"PLEASE ENTER A USERNAME","PLEASE PROVIDE A PASSWORD"};
        String[] actual = new String[2];
try {
    String actual1 = driver.findElement(By.xpath("//label[@class='error' and @for='login-username']")).getText();
    //label[@class='error'][@for='login-username'] - you may use xpath this way as well
    String actual2 = driver.findElement(By.xpath("//label[@class='error' and @for='login-password']")).getText();
    actual[0] = actual1;
    actual[1] = actual2;
}
catch (Exception e)
{

}


       /* System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/

        Assert.assertEquals(actual,expected,"wrong or no error message");


    }

    @Test
    public void loginTest4() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

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
            String actual1 = driver.findElement(By.xpath("//label[@class='error' and @for='login-username']")).getText();
            //label[@class='error'][@for='login-username'] - you may use xpath this way as well
            String actual2 = driver.findElement(By.xpath("//label[@class='error' and @for='login-password']")).getText();
            actual.add(actual1);
            actual.add(actual2);
        }
        catch (Exception e)
        {

        }


       /* System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/

        Assert.assertEquals(actual,expected,"wrong or no error message");


    }

    @Test
    public void loginTest5() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

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

        Assert.assertEquals(actual,expected,"wrong or no error message");


    }
}
