package com.BriteErp.tests.CreateEventFunctionality.Tremaine.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_323 extends TestBase {

    @Test
    public void BRIT_323_test(){
         extentLogger = report.createTest("User can edit events BRIT_323 test");
        waitForPageToLoad(2);

         extentLogger.info("1.Precondition: Environment is ready.");
         driver.get(ConfigurationReader.getProperties("url"));
         driver.manage().window().maximize();

        extentLogger.info("2.Go to landing page.");
        extentLogger.info("Expected Result: User is taken to landing page");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Login as a User.");
        extentLogger.info("Expected Result: User enters correct credentials and is taken to homepage");
        pages.login().userLogin();

        extentLogger.info("4.User then clicks on Calendar tab");
        extentLogger.info("Expected Result: User is taken to the Calendar page.");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("5.User click on the Day button for main Calendar.");
        extentLogger.info("Expected Result: Calendar is refreshed to its Day format.");
        pages.calendar().dayButton.click();

        extentLogger.info("6.User clicks on All-Day box");
        extentLogger.info("Expected Result: User should be presented with a pop-up box");
        pages.calendar().sevenAmBox.click();

        extentLogger.info("7.User clicks on edit button");
        extentLogger.info("Expected Result: User should see more options for their event");
        pages.calendar().editButton.click();
        Assert.assertTrue(pages.calendar().editButton.isEnabled());


}
}
