package Training;

import org.openqa.selenium.By;

public class BasketPage extends Base {
 static String expProductName;
  static String expProductCode;

    public String getExpectedProductName(){
        expProductName=driver.findElement(By.cssSelector(".itemName")).getText();
        return expProductName;
    }

    public String getExpectedProductCode(){
        expProductCode=driver.findElement(By.cssSelector(".itemNumber")).getText();
        return expProductCode;
    }
}

