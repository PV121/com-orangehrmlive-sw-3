package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl= "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void openBrowserLoginTest(){
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        sendTextToElement(By.id("txtUsername"),"Admin");

        sendTextToElement(By.id("txtPassword"),"admin123");

        clickOnElement(By.id("btnLogin"));

        String expectedMessage = "Welcome";

        String actualMessage =getTextFromElement(By.id("welcome")).substring(0,7);

        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @After
    public void closeBrowserLoginTest(){
        closeBrowser();
    }
}
