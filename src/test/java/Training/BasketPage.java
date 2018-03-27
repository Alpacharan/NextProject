package Training;

import org.openqa.selenium.By;
public class BasketPage extends Base {
public String expProductName;
public String expProductCode;

    public String getExpectedProductName(){
        expProductName=driver.findElement(By.cssSelector(".itemName")).getText();
        return expProductName;
    }

    public String getExpectedProductCode(){
        expProductCode=driver.findElement(By.cssSelector(".itemNumber")).getText();
        return expProductCode;
    }
}

