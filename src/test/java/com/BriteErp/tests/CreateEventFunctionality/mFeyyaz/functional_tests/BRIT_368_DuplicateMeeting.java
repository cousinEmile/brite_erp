package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_368_DuplicateMeeting extends TestBase {

    @Test
    public void AddAttachmentsTest() {

        extentLogger = report.createTest("SMSInvalidNumberTest Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
        pages.login().managerLogin();
        wait(2);

        extentLogger.info("5. Click Calendar ");
        pages.topNavigationBar().calendar_button.click();
        wait(2);
        extentLogger.info("6. Click list");
        pages.calendar().listView.click();
        wait(2);

        extentLogger.info("7. Click on the targeted event Edited test event May 2019");

        for (WebElement x : pages.calendar().allMeetings
        ) {
            if (x.getText().contains("DUPLICATED")) {
                x.click();
                break;
            }
        }

        extentLogger.info("8. Click on action dropdown button");
        wait(2);
        pages.calendar().actionDropdownButton.click();

        extentLogger.info("9. Click on Add button");
        pages.calendar().duplicateButton.click();
        wait(2);

        pages.calendar().duplicateInput.clear();
        extentLogger.info("10. Add text to the duplicated meeting name");
        pages.calendar().duplicateInput.sendKeys(" May 2019 DUPLICATED");
        wait(2);
        extentLogger.info("11. Click on Save");
        pages.calendar().saveDuplicateButton.click();

        extentLogger.info("12. Verify the name is updated");
        Assert.assertEquals(pages.calendar().duplicatedMeetingName.getText(), "May 2019 DUPLICATED");
        wait(1);
        extentLogger.info("13. Click on Meeting button");
        pages.calendar().meetingButton.click();
        wait(1);

        for (WebElement duplicated : pages.calendar().allMeetings) {

            if (duplicated.getText().contains("DUPLICATED"))
                wait(1);
            System.out.println("the duplicated meeting is listed: " + duplicated.getText());
            break;
        }


        extentLogger.pass("BRIT_368_DuplicateMeeting Pass");
    }



}



