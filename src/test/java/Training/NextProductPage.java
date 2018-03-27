package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class NextProductPage extends Base {
    public void clickProduct(String filter) {
        List<WebElement> allOptions = driver.findElements(By.cssSelector("#Mapg76606>area"));
        for (WebElement option : allOptions) {
            if (option.getAttribute("alt").startsWith(filter)) {
                option.click();
                break;
            }
        }
    }
}
