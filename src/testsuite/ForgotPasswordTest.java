package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void openBrowserForgotPassTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        clickOnElement(By.linkText("Forgot your password?"));

        String expectedMessage = "Forgot Your Password?";

        String actualMessage =getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));

        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void closeBrowserForgotPassTest() {
        closeBrowser();
    }
}
