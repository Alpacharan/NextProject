package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StoreLocationPage extends Base {
    public void inputName(String option) {
        driver.switchTo().frame("iframeID");
        driver.findElement(By.id("search-input")).sendKeys("cv67pl");
        Select drpCountry = new Select(driver.findElement(By.name("search-type")));
        drpCountry.selectByValue(option);
        }
}
