package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {
    @Before
    public void openBrowserTopMenuTest() {
        openBrowser("https://demo.nopcommerce.com/");
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.linkText("Computers"));
        verifyText("Message: ", "Computers", By.xpath("//h1[contains(text(),'Computers')]"));

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        clickOnElement(By.linkText("Electronics"));
        verifyText("", "Electronics", By.xpath("//h1[contains(text(),'Electronics')]"));
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        clickOnElement(By.linkText("Apparel"));
        verifyText("", "Apparel", By.xpath("//h1[contains(text(),'Apparel')]"));
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
       clickOnElement(By.linkText("Digital downloads"));
       verifyText("","Digital downloads",By.xpath("//h1[contains(text(),'Digital downloads')]"));
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        clickOnElement(By.linkText("Books"));
        verifyText("","Books",By.xpath("//h1[contains(text(),'Books')]"));
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        clickOnElement(By.linkText("Jewelry"));
        verifyText("","Jewelry",By.xpath("//h1[contains(text(),'Jewelry')]"));
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        clickOnElement(By.linkText("Gift Cards"));
        verifyText("","Gift Cards",By.xpath("//h1[contains(text(),'Gift Cards')]"));
    }


    @After
    public void closeBrowserTopMenuTest() {
        closeBrowser();
    }
}
