package base;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.*;
import page.CreateAccountPage;
import page.HomePage;
import utility.SeleniumUtility;

@Listeners({ExtentITestListenerClassAdapter.class})
public class UIBase extends SeleniumUtility {

    protected HomePage homePage;
    protected CreateAccountPage createAccountPage;

    @BeforeMethod
    public void startTest(){
        openBrowser();
        navigateURL();
        this.homePage = new HomePage();
        this.createAccountPage = new CreateAccountPage();
    }

    @AfterMethod
    public void endTest(){
        closeBrowser();
    }

}
