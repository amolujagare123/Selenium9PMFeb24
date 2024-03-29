package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDemo {

    @Test (dataProvider = "getMyData")
    public void loginTest1(String username,String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
    }


    @DataProvider
    Object[][] getMyData()
    {
        Object[][] data = new Object[4][2];

        data[0][0]="admin";
        data[0][1]="admin";

        data[1][0]="invalid-1";
        data[1][1]="invalid-1";

        data[2][0]="invalid-2";
        data[2][1]="invalid-2";

        data[3][0]="invalid-3";
        data[3][1]="invalid-3";

        return data;
    }
}
