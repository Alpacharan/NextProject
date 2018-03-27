package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class NextHeaderPage extends Base {
    public void hoverToMegaNavElements(String to) {
        List<WebElement> megaNavLists = driver.findElements(By.cssSelector(".DepartmentText"));
        for (WebElement element : megaNavLists) {
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element));
            if (element.getText().equalsIgnoreCase(to)) {
                new Actions(driver).moveToElement(element).perform();
                break;
            }
        }
    }
    public void hoverToSubcat(String to) {
        List<WebElement> megaNavLists = driver.findElements(By.cssSelector(".subDepts>li"));
        for (WebElement element : megaNavLists) {
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element));
            if (element.getText().equalsIgnoreCase(to)) {
                new Actions(driver).moveToElement(element).perform();
                break;
            }
        }
    }
    public void category(String to) {
       /* List<WebElement> megaNavLists = driver.findElements(By.cssSelector(".ComponentContainer"));
        for (WebElement element : megaNavLists) {
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element));
            if (element.getText().equalsIgnoreCase(to)) {
                new Actions(driver).moveToElement(element).click().perform();
                break;
            }
        }*/
       driver.findElement(By.linkText(to)).click();
    }
    public void hoverToHeaderOption(String options) {
        List<WebElement> megaNavLists = driver.findElements(By.cssSelector("[class=QuickLinks]>ul>li>a"));
        for (WebElement element : megaNavLists) {
            if (element.getText().equalsIgnoreCase(options)) {
                new Actions(driver).moveToElement(element).click().perform();
                break;
            }
        }
    }
}
