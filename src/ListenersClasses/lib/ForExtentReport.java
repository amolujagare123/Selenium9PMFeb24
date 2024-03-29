package ListenersClasses.lib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {

    public static ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("ReportListener/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression Testing");
        reporter.config().setDocumentTitle("Stock management System");

        extent.setSystemInfo("Project Name","Stock management System");
        extent.setSystemInfo("Developers Name","Vedashree");
        extent.setSystemInfo("Tester Name","Shubham");
        extent.setSystemInfo("Project Start Date","2 jan 2024");
        extent.setSystemInfo("Project Dead line","29 April 2024");
        extent.setSystemInfo("Executed By","Sanjeev");

        return extent;

    }

    public static String getExtentReportScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot assign current driver to it
        // type cast the driver into TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using object reference of TakesScreenshot
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";


        // 3. copy the file object into a real image file
        FileUtils.copyFile(srcFile,new File("ReportListener\\screenshots\\"+fileName));

        return fileName;
    }
}
