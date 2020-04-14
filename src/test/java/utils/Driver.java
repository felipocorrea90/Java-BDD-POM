package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/felipecorrea/Personal Projects/Java-BDD-POM/src/test/resources/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return wd;
    }
}
