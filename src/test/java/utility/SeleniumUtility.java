package utility;

import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility extends Setup {

    public String getElementText(WebElement element){
        return element.getText();
    }

    public void clickElement(WebElement element){
        element.click();
    }

    

}
