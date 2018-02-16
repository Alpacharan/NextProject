package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NextProductDescPage extends Base {
    public String AcProductName;
    public String AcProductCode;

    public String getProductName() {
        AcProductName = driver.findElement(By.cssSelector(".Title>h1")).getText();
        return AcProductName;
    }

    public String getProductCode() {
        AcProductCode = driver.findElement(By.xpath("html/body/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/section[2]/article[1]/section[2]/div[3]/div[2]")).getText();
        return AcProductCode;
    }

    public void clickonAddToCart() {
        driver.findElement(By.xpath("html/body/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/section[2]/article[1]/section[2]/div[4]/div[7]/div/a[1]")).click();
    }

    public void clickOnShoppingBag() {
        driver.findElement(By.cssSelector(".BagSummary")).click();
    }

    public void shoppingBagHooverAndClick(String viewOrCheckout) {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (viewOrCheckout == "VIEW/EDIT BAG") {
            driver.findElement(By.cssSelector(".view_edit_bag")).click();
        } else if (viewOrCheckout == "CHECKOUT") {
            driver.findElement(By.cssSelector(".checkout")).click();
        }
    }
}
