package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class LoginPage extends Utility {

    //list of elements and their locations
    By welcomeText = By.xpath("//li[@class='navbar-text myprofile_salutation']");

    //methods performing actions on elements
    public void verifyTextWelcomeGuest() {
        verifyTextAssertMethod(welcomeText,"Welcome Guest!");
    }

}
