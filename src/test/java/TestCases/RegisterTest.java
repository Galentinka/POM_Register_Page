package TestCases;

import Pages.LandingPage;
import Pages.RegisterPage;
import Pages.SuccessfullyRegisterPage;
import TestBase.TestBase;
import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    public WebDriver driver;
    public LandingPage landingPage;
    public RegisterPage registerPage;
    public SuccessfullyRegisterPage successfullyRegisterPage;

    public RegisterTest() throws Exception {
        super();
    }

    @BeforeClass
    public void setup() {
        driver = initializeBrowser();
        landingPage = new LandingPage(driver);
        registerPage = landingPage.clickOnMyAccountAndClickOnRegister();
    }

    @Test
    public void verifyRegisterWithValidCredentials() {

        successfullyRegisterPage = registerPage.directlyToSuccessfullyRegisterPage(properties.getProperty("firstName"), properties.getProperty("lastName"), Utils.emailWithDateStamp(), properties.getProperty("phone"), properties.getProperty("password"), properties.getProperty("confirmPassword"));
        Assert.assertTrue(successfullyRegisterPage.successfullyRegistered());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
