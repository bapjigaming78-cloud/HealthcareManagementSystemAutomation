package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {

        File source = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);


        String destination =
                "./screenshots/" + testName + ".png";


        try {

            FileUtils.copyFile(
                    source,
                    new File(destination)
            );

            System.out.println(
                    "Screenshot saved: " + destination
            );

        } catch (IOException e) {

            e.printStackTrace();

        }


        return destination;
    }
}