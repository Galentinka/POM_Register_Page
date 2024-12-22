package TestBase;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;
    public Properties properties;
    public FileInputStream inputStream;

    public TestBase() throws IOException {
        properties = new Properties();
        inputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\POM_RegistrationPage\\src\\test\\java\\Properties\\testData");
        properties.load(inputStream);
    }

    public WebDriver initializeBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
        driver.get("https://tutorialsninja.com/demo/");

        return driver;

    }
}
