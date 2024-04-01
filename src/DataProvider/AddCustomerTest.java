package DataProvider;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class AddCustomerTest {
    WebDriver driver;
    @BeforeClass
    public void doLogin()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
    }

    @Test (dataProvider = "getData")
    public void addCustomerTest(String name,String address,String contact1,String contact2)
    {
        driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);
     //   driver.findElement(By.name("Submit")).click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        // 1. read the file
        FileInputStream fis = new FileInputStream("Data/MyData2.xlsx");

        // 2. convert this file object into a workbook object
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // 3. get the sheet
        XSSFSheet sheet = workbook.getSheet("Add customers");

        // 4. count the active rows
        int rowCount = sheet.getPhysicalNumberOfRows();

        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for (int i=0;i<rowCount-1;i++)
        {
            XSSFRow row = sheet.getRow(i+1);

            XSSFCell name = row.getCell(0);
            if (name == null)
                data[i][0]= "";
            else {
                name.setCellType(CellType.STRING);
                data[i][0] = name.toString();
            }

            XSSFCell address = row.getCell(1);
            if (address == null)
                data[i][1]= "";
            else {
                address.setCellType(CellType.STRING);
                data[i][1] = address.toString();
            }

            XSSFCell contact1 = row.getCell(2);
            if (contact1 == null)
                data[i][2]= "";
            else {
                contact1.setCellType(CellType.STRING);
                data[i][2] = contact1.toString();
            }

            XSSFCell contact2 = row.getCell(3);
            if (contact2 == null)
                data[i][3]= "";
            else {
                contact2.setCellType(CellType.STRING);
                data[i][3] = contact2.toString();
            }
        }

        return data;
    }

}
