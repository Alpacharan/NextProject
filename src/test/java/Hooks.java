import Training.Base;
import Training.Utils;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    Base base = new Base();
    Utils utils = new Utils();
    WebDriver driver;



    @cucumber.api.java.Before
    public void setUp() {
        base.openBrowser();
        base.maximiseBrowser();
        base.navigateTo("http://www.next.co.uk");
        base.applyImpWaits();
    }

    @cucumber.api.java.After
    public void quitDriver() {
         Scenario scenario;
       // if (scenario.isFailed()) {
        //    utils.capScreenshot(scenario.getName());
        }

        //base.closeBrowser();
    }

