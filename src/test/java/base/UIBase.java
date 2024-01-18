package base;

import org.testng.annotations.*;
import utility.SeleniumUtility;

public class UIBase extends SeleniumUtility {

    @BeforeMethod
    public void startTest(){
        openBrowser();
    }

    @AfterMethod
    public void endTest(){
        closeBrowser();
    }

}
