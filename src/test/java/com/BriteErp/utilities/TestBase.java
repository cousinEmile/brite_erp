package com.BriteErp.utilities;

import com.BriteErp.utilities.listeners.Retry;
import com.BriteErp.utilities.listeners.RetryListener;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase extends BrowserUtils implements ApplicationConstants{

    protected WebDriver driver;
    protected Pages pages;

    protected static ExtentReports report;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;

    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setupMethod(@Optional String browser) {
        driver = Driver.getDriver(browser);
        pages = new Pages();
        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get(ConfigurationReader.getProperties("url"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
        /* if any test fails, it can detect it, take a screen shot at that point and attach a report */
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotLocation = BrowserUtils.getScreenshot(result.getName());
            extentLogger.fail(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshotLocation);
            extentLogger.fail(result.getThrowable());

        }  else if (result.getStatus() == ITestResult.SKIP) {
            extentLogger.skip("Test Case Skipped - " + result.getName());
        }

//    Driver.closeDriver();
    }


    @BeforeTest(alwaysRun = true)
    public void setUpTest() {
        report = new ExtentReports();
        String filePath = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(filePath);

        report.attachReporter(htmlReporter);

        report.setSystemInfo("Environment", "Staging");
        report.setSystemInfo("Browser", ConfigurationReader.getProperties("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));
        htmlReporter.config().setDocumentTitle("BRITE - ERP Reports");
        htmlReporter.config().setReportName("BriteErp Automated Test Reports");
//        htmlReporter.config().setTheme(Theme.DARK);

    }

    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        report.flush();
    }









}
