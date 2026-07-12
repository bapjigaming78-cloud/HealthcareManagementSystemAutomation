package test;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.ExcelUtils;
import base.BaseTest;
import pages.AppointmentPage;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DataProviderClass;


@Listeners(listeners.TestListener.class)
public class LoginTest extends BaseTest {

    // Logger class level par hoga
    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    
    @Test(dataProvider = "loginData", dataProviderClass = DataProviderClass.class)
    public void loginTest(String username, String password) throws InterruptedException { {

        ConfigReader config = new ConfigReader();

        logger.info("Opening Application");

        driver.get(config.getUrl());

        HomePage home = new HomePage(driver);

        logger.info("Clicking Make Appointment");

        home.clickMakeAppointment();

        LoginPage login = new LoginPage(driver);

        logger.info("Entering Username");
        login.enterUsername("John Doe");

        logger.info("Entering Password");
        login.enterPassword("ThisIsNotAPassword");

        logger.info("Clicking Login Button");
        login.clickLogin();

        Thread.sleep(3000);

        logger.info("Login Successful");

        AppointmentPage appointment = new AppointmentPage(driver);

        logger.info("Selecting Facility");
        appointment.selectFacility("Hongkong CURA Healthcare Center");

        appointment.clickReadmission();
        appointment.selectMedicaid();
        appointment.enterVisitDate("20/07/2026");
        appointment.enterComment("Automation Testing");

        logger.info("Booking Appointment");
        appointment.clickBookAppointment();

        Thread.sleep(3000);

        logger.info("Appointment Booked Successfully");

        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println(ExcelUtils.getCellData(1, 0));
        System.out.println(ExcelUtils.getCellData(1, 1));}
    //.testng.Assert.fail("Testing Retry Analyzer");
}}