import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Darren\\IdeaProjects\\NextProject\\src\\test\\Resources\\nextAddToCart.feature",plugin = "json:target/cucumber.json",tags = "@Regression")


public class Run {
}

