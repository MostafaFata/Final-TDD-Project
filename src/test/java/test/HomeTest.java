package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.UIBase;
import page.HomePage;

public class HomeTest extends UIBase{

    @Test
    public void verifyHeading(){
        String actualHeading = getElementText(homePage.Heading);
        Assert.assertEquals(actualHeading, "TEK Insurance App", "verify heading is TEK Insurance App");
    }

    @Test
    public void verifyCreatePrimaryAccountButton(){
        String actualButtonText = getElementText(homePage.CreateAccountButton);
        Assert.assertEquals(actualButtonText, "Create Primary Account");
    }

    @Test
    public void verifyCreatePrimaryAccountFormHeading(){
        clickElement(homePage.CreateAccountButton);
        String actualFormHeading = getElementTextWait(homePage.CreateAccountFormHeading);
        Assert.assertEquals(actualFormHeading, "Create Primary Account Holder");
    }



}
