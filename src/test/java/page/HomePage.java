package page;

import base.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Setup {

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//h2[contains(text(), 'TEK Insurance App')]")
    public static WebElement Heading;

    @FindBy(xpath = "//a[@href='/add-primary-account']")
    public static WebElement CreateAccountButton;

    @FindBy(xpath = "//h2[contains(text(), 'Create Primary Account Holder')]")
    public static WebElement CreateAccountFormHeading;

}
