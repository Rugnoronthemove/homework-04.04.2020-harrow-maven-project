package uk.gov.harrow.testsuite;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.LoginPage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    //TestCases
    @Test
    public void verifyClickOnLoginOrRegisterLink() {
        //click on login or register link
        homePage.clickOnLoginOrRegisterLink();
        //verify text on Login Page
        loginPage.verifyTextWelcomeGuest();
    }

    @Test
    public void verifyClickOnServicesBtn() {
        //click on services button
        homePage.clickOnServicesBtn();
    }

    @Test
    public void verifyElementsOnHarrowWebsiteHomePageAreDisplayed() {
        //verify service button is displayed
         homePage.isDisplayedServicesBtn();
    }

}
