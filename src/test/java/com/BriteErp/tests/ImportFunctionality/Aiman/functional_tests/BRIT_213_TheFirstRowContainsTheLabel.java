package com.BriteErp.tests.ImportFunctionality.Aiman.functional_tests;
import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BRIT_213_TheFirstRowContainsTheLabel extends TestBase {

    @Test
    public void TheFirstRowContainsTheLabel() {
        extentLogger = report.createTest("The First Row Contains The Label");
        driver.manage().window().maximize();

        extentLogger.info("1.Go to the URL");
        driver.get(ConfigurationReader.getProperties("url"));
        extentLogger.info("Expected Result: System should display the website");

        extentLogger.info("2.Click on BriteErpDemo");
        pages.landing().BriteErpDemo_button.click();
        extentLogger.info("Expected Result: System should navigate to login page.");

        extentLogger.info("3.Enter email and password for Inventory User 4 and click Log in");
        pages.login().userLogin();
        extentLogger.info("Expected Result: System should accept username and password and navigate to home page");

        waitForPageToLoad(2);
        extentLogger.info("4.Click on Calendar tab on the top");
        pages.topNavigationBar().calendar_button.click();
        extentLogger.info("Expected Result: Calendar opens");

        extentLogger.info("5.Click on List button on the right, at the top of the mini-Calendar");
        pages.calendar().listView.click();
        extentLogger.info("Expected Result: List opens.");

        extentLogger.info("6.Click on Import icon");
        pages.calendarListViewPage().import_button.click();
        extentLogger.info("Expected Result: Import opens");

        extentLogger.info("7.Click on Load File and select a CSV or Excel file to import");
        WebElement chooseFile = pages.importPage().loadFile;
        String file = "/Users/aimangainedenova/Downloads/Utility.xlsx";
        chooseFile.sendKeys(file);
        extentLogger.info("Expected Result: The file should be printed and displayed on the screen");

        wait(2);
        extentLogger.info("8. Verify Checkbox 'The first row contains the label of the column' is selected by default");
        Assert.assertTrue(pages.importPage().theFirstRowLabel.isSelected());
        extentLogger.info("Expected Result: Selected");

        extentLogger.info("9. Click on Checkbox 'The first row contains the label of the column' ");
        pages.importPage().theFirstRowLabel.click();
        extentLogger.info("Expected Result: Unselected");

        extentLogger.pass("The First Row Contains The Label");


    }
}
