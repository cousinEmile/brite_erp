package com.BriteErp.tests.SingularFunctionalities.ActionFunctionality.Turkan.smoke_tests;


import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import com.mongodb.DBRef;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_2659_UnarchiveUserTest extends TestBase {

    @Test
    public void BRIT_2659(){
        extentLogger = report.createTest("BRIT_2659 Unarchive Test");

        extentLogger.info("preconditions");
        pages.login().open();
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("login to the application with valid credentials");
        extentLogger.info("Should be able to login.");
        pages.login().userLogin();

        extentLogger.info("click the calendar tab");
        extentLogger.info("should be able to see the calendar page");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("click the list view");
        extentLogger.info("should be able to see the list");
        pages.calendarListViewPage().list.click();

        extentLogger.info("click the subject check box");
        extentLogger.info("all subjects should be selected");
        pages.calendarListViewPage().subjectCheckbox.click();

        extentLogger.info("select unarchive from the actions drop down");
        extentLogger.info("The requested operation cannot be completed due to security restrictions");
        pages.calendarListViewPage().action.click();
        pages.calendarListViewPage().unarchive.click();
        System.out.println(pages.calendarListViewPage().unarchive.getText());
        Assert.assertTrue(pages.calendarListViewPage().warning.isDisplayed());
        pages.calendarListViewPage().warning.click();


}



}
