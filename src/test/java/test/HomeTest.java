package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.UIBase;
import page.HomePage;

public class HomeTest extends UIBase{

    @Test
    public void verifyHeading(){
        navigateURL();
        HomePage homePage = new HomePage();
        String actualHeading = homePage.Heading.getText();
        Assert.assertEquals(actualHeading, "TEK Insurance App", "verify heading is TEK Insurance App");
    }

}
