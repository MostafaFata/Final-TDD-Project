package page;

import base.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Setup {

    public CreateAccountPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "email")
    public static WebElement Email;

    @FindBy(xpath = "//option[@value='Mr.']")
    public static WebElement Title;

    @FindBy(id = "firstName")
    public static WebElement Firstname;

    @FindBy(id = "lastName")
    public static WebElement Lastname;

    @FindBy(xpath = "//option[@value='MALE']")
    public static WebElement Gender;

    @FindBy(xpath = "//option[@value='MARRIED']")
    public static WebElement MaritalStatus;

    @FindBy(id = "employmentStatus")
    public static WebElement Employment;

    @FindBy(id = "dateOfBirth")
    public static WebElement DateOfBirth;

    @FindBy(xpath = "//button[contains(text(), 'Create Account')]")
    public static WebElement CreateAccountButton;

    @FindBy(xpath = "//h2[contains(text(), 'Sign up your account')]")
    public static WebElement SignUpHeading;






}
