import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");

        WebElement txtUsername = driver.findElement(By.id("input-username"));
        txtUsername.sendKeys("demo");

        WebElement txtPassword = driver.findElement(By.id("input-password"));
        txtPassword.sendKeys("demo");

        WebElement btnLogin = driver.findElement(By.tagName("button"));
        btnLogin.click();

    }
}
