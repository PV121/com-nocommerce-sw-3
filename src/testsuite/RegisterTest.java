package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.Random;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void openBrowserRegisterTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        clickOnElement(By.linkText("Register"));
        verifyText("Register Message: ", "Register", By.linkText("Register"));
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        clickOnElement(By.linkText("Register"));
        verifyText("Register Message: ", "Register", By.linkText("Register"));
        clickOnElement(By.id("gender-male"));
        sendTextToElement(By.name("FirstName"),"Pinakin");
        sendTextToElement(By.name("LastName"),"Valand");
        clickOnElement(By.name("DateOfBirthDay"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]/option[31]"));
        clickOnElement(By.name("DateOfBirthMonth"));
        clickOnElement(By.xpath("//option[contains(text(),'October')]"));
        clickOnElement(By.name("DateOfBirthYear"));
        clickOnElement(By.xpath("//option[contains(text(),'1995')]"));
        Random randomGenerator = new Random();// introducing random class and object
        int randomInt = randomGenerator.nextInt(1000);//save random num in to randomInt
        sendTextToElement(By.id("Email"),"vpinakin" + randomInt + "@gmail.com");
        sendTextToElement(By.name("Password"),"Pinakin5434@");
        sendTextToElement(By.name("ConfirmPassword"),"Pinakin5434@");
        clickOnElement(By.id("register-button"));
        verifyText("Successful Registration Message: ","Your registration completed",By.xpath("//div[contains(text(),'Your registration completed')]"));

    }

    @After
    public void closeBrowserRegisterTest() {
        //closeBrowser();
    }
}

