package com.BriteErp.tests.SearchFunctionality.Albert.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_93 extends TestBase {

    /**http://jira.cybertekschool.com/browse/BRIT-93
     -Verify that User can refine Advanced Search queries of Calendar events/meetings by meetings they have created through filter titled 'My Meetings'

     STEPS:
     Step Five: User should click on the Calendar tab in the header, on the left side of the screen.

     Step Six: User should click on the Magnifying Glass icon in the Search Bar, on the far right side.

     Step Seven: User should click on the Advanced Search icon titled 'Filters.'

     Step Eight: User should select 'My Meetings' from the Filters drop down menu.


     EXPECTED RESULTS:
     Step Six: The user should see the icon in the Magnifying Glass change from a plus-sign ('+') to a minus-sign ('-'), also, three new icons should be revealed below the Search Bar, 'Filters', 'Group By', and 'Favorites'

     Step Seven: User's click should reveal a drop down menu extending from the 'Filters' icon.

     Step Eight: User should observe a new tag in the Search Bar labeled 'My Meetings'
    **/

    @Test
    public void AdvancedSearchFilters_MyMeetings(){
        extentLogger = report.createTest("Advanced Search Filter : MyMeetings");
        driver.manage().window().maximize();

        extentLogger.info("Step One: Pre-Condition Environment is up and running.");

        extentLogger.info("Step Two: Go to URL.");
        extentLogger.info("Expected Result: Home page is displayed");
        extentLogger.info("Verifying landing page title");
        driver.get(ConfigurationReader.getProperties("url"));
        Assert.assertEquals(Driver.getDriver().getTitle(),LANDING_PAGE_TITLE);

        extentLogger.info("Step Three: Select 'BriteErpDemo' from given database options.");
        extentLogger.info("Expected Results: User should be directed to Login page.");
        pages.landing().BriteErpDemo_button.click();
        extentLogger.info("Verifying login page title");
        Assert.assertEquals(Driver.getDriver().getTitle(), LOGIN_PAGE_TITLE);

        extentLogger.info("Step Four: input valid user credentials");
        extentLogger.info("Expected Result: user should be directed to the 'Inbox' page of the application. ");
        pages.login().userLogin();
        extentLogger.info("Verifying login successful");
        waitUntilTitleEquals(10, DISCUSS_PAGE_TITLE);
        Assert.assertEquals(Driver.getDriver().getTitle(),DISCUSS_PAGE_TITLE);

        extentLogger.info("Step Five: Click on the Calendar tab in the header, on the left side of the screen.");
        extentLogger.info("Expected Result: User should be directed to main Calendar page.");
        pages.topNavigationBar().calendar_button.click();
        waitUntilTitleEquals(10, CALENDAR_PAGE_TITLE);
        Assert.assertEquals(driver.getTitle(), CALENDAR_PAGE_TITLE);

        extentLogger.info("Step Six: Click on the Magnifying Glass icon in the Search Bar, on the far right side.");
        extentLogger.info("Expected Results: user should see the icon in the Magnifying Glass change from a plus-sign ('+') to a minus-sign ('-'), also, three new icons should be revealed below the Search Bar, 'Filters', 'Group By', and 'Favorites");
        pages.searchPage().MgniffierIcone.click();

        extentLogger.info("Step Seven: Click on the Advanced Search icon titled 'Filters.");
        extentLogger.info("Expected Results: User's click should reveal a drop down menu extending from the 'Filters' icon.");
        pages.searchPage().filters_button.click();

        extentLogger.info("select 'My Meetings' from the Filters drop down menu.");
        extentLogger.info("Expected Results: User should observe a new tag in the Search Bar labeled 'My Meetings'. ");
        pages.searchPage().MyMeetings_filter.click();
        Assert.assertTrue(pages.searchPage().MyMeetings_SearchBarIcon.isDisplayed());
        Assert.assertEquals(pages.searchPage().MyMeetings_Label_SearchBarIcon.getAttribute("innerText").trim(),MYMEETINGS_SEARCHBARICON_LABEL);

        extentLogger.pass("BRIT_93_AdvancedSearchFilter_MyMeetings Test PASS");
    }




     }
