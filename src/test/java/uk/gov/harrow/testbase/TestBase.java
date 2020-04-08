package uk.gov.harrow.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.harrow.basepage.BasePage;
import uk.gov.harrow.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    //object creation
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.harrow.gov.uk/";

    //open browser
    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    //close browser
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
