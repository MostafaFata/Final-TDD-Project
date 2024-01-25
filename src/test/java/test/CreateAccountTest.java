package test;

import base.UIBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends UIBase {

    @Test
    public void createAccountFormSubmission(){
        clickElement(homePage.CreateAccountButton);
        String actualFormHeading = getElementTextWait(homePage.CreateAccountFormHeading);
        Assert.assertEquals(actualFormHeading, "Create Primary Account Holder");

        setElementData(createAccountPage.Email, "abcd@company.com");
        clickElement(createAccountPage.Title);
        setElementData(createAccountPage.Firstname, "Alex");
        setElementData(createAccountPage.Lastname, "Jones");
        clickElement(createAccountPage.Gender);
        clickElement(createAccountPage.MaritalStatus);
        setElementData(createAccountPage.Employment, "Employed");
        setElementData(createAccountPage.DateOfBirth, "02/14/1990");
        clickElement(createAccountPage.DateOfBirth);
        clickElement(createAccountPage.CreateAccountButton);

        String actualSignUpHeading = getElementTextWait(createAccountPage.SignUpHeading);
        Assert.assertEquals(actualSignUpHeading, "Sign up your account");

    }


}
