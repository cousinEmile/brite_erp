package com.BriteErp.identifiers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface CalendarPageIdentifier {


    String CalendarMeetingSubjectBox            = "//input[@placeholder='e.g. Business Lunch']";
    String CalendarTestingPurposes              = "//h4[@class='modal-title']";
    String CalendarOptionsBoxEvents             = "//a[contains(text(),'Options')]";
    String CalendarRecurrentCheckBox             ="//div[@name='recurrency']//input[@type='checkbox']";
    String Calendar8AMBoxXpath                  ="//tr[@data-time='08:00:00']//td[@class='fc-widget-content']";
    String Calendar7AMBoxXpath                  ="//tr[@data-time='07:00:00']//td[@class='fc-widget-content']";
    String Calendar6AMBoxXpath                  = "//tr[@data-time='06:00:00']//td[@class='fc-widget-content']";
    String CalendarCreateEvent_buttonXpath      = "//div[@class='modal-footer']/button";
    String CalendarAllDayCheckBox               = "//div[@name='allday']";
    String CalendarChatCloseXpath               ="//div[@class='o_chat_header']/span/a[2]";
    String CalendarLastWeekButtonXpath          ="//div[@class='o_calendar_buttons']/button";
    String CalendarToday_ButtonXpath            ="//div[@class='o_calendar_buttons']/button[2]";
    String CalendarNextWeek_ButtonXpath         ="//div[@class='o_calendar_buttons']/button[3]";
    String CalendarViewDay_ButtonXpath          ="//div[@class='btn-group btn-group-sm']/button";
    String CalendarDayButtonXpath               ="//button[contains(text(),'Day')]";
    String CalendarViewWeek_ButtonXpath         ="//div[@class='o_calendar_buttons']//div//button[2]";
    String CalendarViewMonth_ButtonXpath        ="//div[@class='btn-group btn-group-sm']/button[3]";
    String CalendarMiniCalendarCloseXpath       ="//div[@class='o_calendar_sidebar_container hidden-xs']/i";
    String CalendarMiniCalendarOpenXpath        ="//div[@class='o_calendar_sidebar_container hidden-xs o_sidebar_hidden']/i";
    String CalendarMiniCalendarLastMonthXpath   ="//div[@class='o_calendar_sidebar']/div/div/div/a";
    String CalendarMiniCalendarNextMonthXpath   ="//div[@class='o_calendar_sidebar']/div/div/div/a[2]";
    String CalendarCalendarViewXpath            ="//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button";
    String CalendarListViewXpath                ="//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[2]";
    String CalendarSearchBoxXpath               ="//div[@class='o_cp_searchview']/div/input";
    String CalendarAdvancedSearch_ButtonXpath   ="//div[@class='o_searchview']/span";
    String Calendar_011618_AllDayXpath          ="(//table)[3]/tbody/tr/td[5]";
    String CalendarAllDayBoxXpath               ="//div[@class='fc-row fc-week fc-widget-content']//td[@class='fc-day fc-widget-content fc-fri fc-past']";
    String CalendarAddMeetingBox_PopOutXpath    ="//div[@class='modal-content']/div/div/input";
    String CalendarPopOutCreate_ButtonXpath     ="//div[@class='modal-footer']/button";
    String CalendarSummaryInputBoxXpath         ="//input[@class='o_input']";
    String CalendarEditButtonXpath              ="/html[1]/body[1]/div[6]/div[1]/div[1]/div[3]/button[2]";
    String CalendarMonthViewXpath               ="//div[@class='fc-view fc-month-view fc-basic-view']";
    String CalendarTheCurrentMonthTextXpath     ="(//li[@class='active'])[2]";
    String CalendarNextMonthXpath               ="//span[@class='fa fa-arrow-right']";
    String CalendarMAy15thXpath                 ="((//div[@class='fc-content-skeleton'])[3]/table/tbody/tr/td)[5]";
    String CalendarEventsXpath                  ="(//div[@class='o_field_name o_field_type_char'])";
    String CalendarAttendeesBox                 ="//input[@placeholder='Select attendees...']";
    String CalendarSaveButtonXpath              ="//div[@class='modal-footer']//button[1]/span";
    String CalendarNextDayButtonXpath           ="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[3]";
    String CalendarView_Table_WeeklyXpath       ="//div[@class='fc-view fc-agendaWeek-view fc-agenda-view']";
    String CalendarBack_WeekXpath               ="//button[@class='o_calendar_button_prev btn btn-sm btn-primary']//span";
    String CalendarForth_WeekXpath              ="//button[@class='o_calendar_button_next btn btn-sm btn-primary']//span";
    String CalendarEditDropDownXpath            ="//span[@class='o_dropdown_button'])[2]";
    String CalendarEditEventButtonXpath         ="/html[1]/body[1]/div[6]/div[1]/div[1]/div[3]/button[1]";
    String CalendarMeetingSubjectXpath          ="//input[@class='o_field_char o_field_widget o_input o_required_modifier']";
    String CalendarDeleteEventXpath             ="(//button[@class='btn btn-sm btn-default'])[1]";
    String CalendarSaveEditEventXpath           ="//button[@class='btn btn-sm btn-primary']";
    String CalendarClose_Mini_CalendarXpath     ="//div[@class='o_calendar_sidebar_container hidden-xs']/i";
    String CalendarOpenMiniCalendarXpath        ="//div[@class='o_calendar_sidebar_container hidden-xs o_sidebar_hidden']/i";
    String CalendarRemovingFilterXpath          ="//div[@class='o_calendar_filter']/div/div[5]/span[2]";
    String CalendarRemovingFilter2Xpath         ="(//div[@class='o_calendar_filter_item'])[4]";
    String CalendarOptionsEditButtonXpath       ="//a[.='Options']";
    String CalendarSelectClassID                ="(//select[@class='o_input o_field_widget'])[4]";
    String CalendarErrorMessageXpath            ="//*[@class='o_notification_manager']";
    String CalendarSelectClassManagerID         ="o_field_input_79";
    String CalendarAllMeetingsXpath             ="//div[@class='table-responsive']/table/tbody/tr";
    String CalendarActionDropDownButtonXpath    ="(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]";
    String CalendarSendSMSButtonXpath           ="((//ul[@class='dropdown-menu'])[5]/li)[3]";
    String CalendarPhoneNumberID                ="o_field_input_358";
    String CalendarSendButtonXpath              ="//button[@class='btn btn-sm oe_highlight']";
    String CalendarEnterTextID                  ="o_field_input_359";
    String CalendarPhoneNumberErrorXpath        ="//div[@class='o_dialog_warning modal-body']";
    String CalendarAttachmentButtonXpath        ="(//div[@class='btn-group o_dropdown'])[2]";
    String CalendarAddAttachmentButtonXpath     ="//input[@class='o_input_file']";
    String CalendarDuplicateButtonXpath         ="((//ul[@class='dropdown-menu'])[5]/li)[2]";
    String CalendarDuplicateInputXpath          ="//input[@class='o_field_char o_field_widget o_input o_required_modifier']";
    String CalendarSaveDuplicateButtonXpath     ="//button[@class='btn btn-primary btn-sm o_form_button_save']";
    String CalendarDuplicateMeetingNameXpath    ="//span[@class='o_field_char o_field_widget o_required_modifier']";
    String CalendarMeetingButtonXpath           ="(//a[.='Meetings'])[1]";
    String CalendarEverybodysCalendarButtonXpath="//div[@data-value='all']/div/input";
    String CalendarDaysOfWeekXpath              ="//div[@class='fc-row fc-widget-header']/table/thead/tr/th";
    String CalendarClick_Table_WeeklyXpath      ="//div[@class='fc-slats']//tr[21]//td[2]";

}

