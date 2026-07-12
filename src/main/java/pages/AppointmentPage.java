package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AppointmentPage {


    WebDriver driver;
    WebDriverWait wait;


    public AppointmentPage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }



    By facility = By.id("combo_facility");

    By readmission = By.id("chk_hospotal_readmission");

    By medicaid = By.id("radio_program_medicaid");

    By visitDate = By.id("txt_visit_date");

    By comment = By.id("txt_comment");

    By bookButton = By.id("btn-book-appointment");




    public void selectFacility(String value){

        wait.until(
        ExpectedConditions.visibilityOfElementLocated(facility)
        );


        Select select =
        new Select(driver.findElement(facility));


        select.selectByVisibleText(value);

    }



    public void clickReadmission(){

        wait.until(
        ExpectedConditions.elementToBeClickable(readmission)
        );

        driver.findElement(readmission).click();

    }



    public void selectMedicaid(){

        driver.findElement(medicaid).click();

    }



    public void enterVisitDate(String date){

        driver.findElement(visitDate).click();

        driver.findElement(visitDate).clear();

        driver.findElement(visitDate).sendKeys(date);

    }



    public void enterComment(String text){

        driver.findElement(comment).sendKeys(text);

    }



    public void clickBookAppointment(){

        wait.until(
        ExpectedConditions.elementToBeClickable(bookButton)
        );

        driver.findElement(bookButton).click();

    }

}