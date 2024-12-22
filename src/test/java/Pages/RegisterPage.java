package Pages;


import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public WebDriver driver;

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-telephone")
    private WebElement phone;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "input-confirm")
    private WebElement confirmPassword;

    @FindBy(name = "agree")
    private WebElement agreeButton;

    @FindBy(css = "input.btn.btn-primary")
    private WebElement continueButton;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstnameText) {
        firstName.sendKeys(firstnameText);
    }

    public void enterLastName(String lastnameText) {
        lastName.sendKeys(lastnameText);
    }

    public void enterEmail(String emailText) {
        email.sendKeys(emailText);
    }

    public void enterPhoneNumber(String phoneText) {
        phone.sendKeys(phoneText);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void enterConfirmPassword(String pass) {
        confirmPassword.sendKeys(pass);
    }

    public void checkAgreeRatioButton() {
        agreeButton.click();
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }

    public SuccessfullyRegisterPage directlyToSuccessfullyRegisterPage(String firstname, String lastname,
                                                                       String emailText, String phoneNumber, String passwordText, String confirmPasswordText) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        email.sendKeys(emailText);
        phone.sendKeys(phoneNumber);
        password.sendKeys(passwordText);
        confirmPassword.sendKeys(confirmPasswordText);
        agreeButton.click();
        continueButton.click();

        return new SuccessfullyRegisterPage(driver);
    }
}
