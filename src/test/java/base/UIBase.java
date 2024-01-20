package base;

import org.testng.annotations.*;
import page.HomePage;
import utility.SeleniumUtility;

public class UIBase extends SeleniumUtility {

    protected HomePage homePage;

    @BeforeMethod
    public void startTest(){
        openBrowser();
        navigateURL();
        this.homePage = new HomePage();
    }

    @AfterMethod
    public void endTest(){
        closeBrowser();
    }

}
