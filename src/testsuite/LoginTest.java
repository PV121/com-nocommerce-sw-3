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
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));
        verifyText("Sign In Message: ","Welcome, Please Sign In!",By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
       clickOnElement(By.linkText("Log in"));
       sendTextToElement(By.id("Email"),"vpinakin656@gmail.com");
       sendTextToElement(By.name("Password"),"Pinakin5434@");
       clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
       verifyText("Log out Message: ", "Log out",By.xpath("//a[contains(text(),'Log out')]"));

    }

    @Test
    public void verifyTheErrorMessage() {
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.xpath("//input[@id='Email']"),"vpinakin@gmail.com");
        sendTextToElement(By.xpath("//input[@id='Password']"),"12345678");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        verifyText("Unsuccessful Login Message: ","Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found",By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
    }

    @After
    public void closedown() {
        closeBrowser();
    }
}
