package com.BriteErp.tests.CreateEventFunctionality.Tremaine.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;



public class BRIT_322 extends TestBase {

    @Test
    public void BRIT_322test(){
        extentLogger = report.createTest("Add attendee's to event_BRIT_322 Test-User");
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

        extentLogger.info("6.User clicks on six am box");
        extentLogger.info("Expected Result: User should be presented with a pop-up box");
        wait(8);
        pages.calendar().eightAmBox.click();

        extentLogger.info("7.User then clicks on edit inside pop-up box");
        extentLogger.info("Expected Result: User is presented with more options for ");
        wait(10);
        pages.calendar().editButton.click();

        extentLogger.info("8.User then clicks on attendee's box  ");
        pages.calendar().attendeesBox.click();

        extentLogger.info("9.User clicks on clicks on save");
        extentLogger.info("Expected Result:User successfully added an event with attendee attached.");
        pages.calendar().saveButton.click();
    }


    }
