package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public WebDriver driver;

    @FindBy(linkText = "My Account")
    private WebElement myAccountDropdown;

    @FindBy(linkText = "Register")
    private WebElement registerButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnMyAccountDropdown() {
        myAccountDropdown.click();
    }
    public void clickOnRegisterOption() {
        registerButton.click();
    }

    public RegisterPage clickOnMyAccountAndClickOnRegister() {
        myAccountDropdown.click();
        registerButton.click();
        return new RegisterPage(driver);
    }
}
