package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By makeAppointment = By.id("btn-make-appointment");

    public void clickMakeAppointment() {

        wait.until(
            ExpectedConditions.elementToBeClickable(makeAppointment)
        );

        driver.findElement(makeAppointment).click();
    }
}