package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    // Locators

    By username = By.id("txt-username");

    By password = By.id("txt-password");

    By loginButton = By.id("btn-login");



    // Actions

    public void enterUsername(String user){

        driver.findElement(username).clear();

        driver.findElement(username).sendKeys(user);

    }


    public void enterPassword(String pass){

        driver.findElement(password).clear();

        driver.findElement(password).sendKeys(pass);

    }


    public void clickLogin(){

        driver.findElement(loginButton).click();

    }

}