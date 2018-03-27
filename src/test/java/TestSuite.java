import Training.*;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestSuite {
    NextHeaderPage nextHeaderPage = new NextHeaderPage();
    NextProductPage nextProductPage = new NextProductPage();
    NextProductDescPage nextProductDescPage = new NextProductDescPage();
    BasketPage basketPage = new BasketPage();
    StoreLocationPage storeLocationPage=new StoreLocationPage();


    public void testSuite1() {
        nextHeaderPage.hoverToMegaNavElements("Home & Furniture");
        nextHeaderPage.hoverToSubcat("Kitchen & Dining");
        nextHeaderPage.category("Dining Room Furniture");
        nextProductPage.clickProduct("Hudson Dark Small Sideboard");
        String s1=nextProductDescPage.getProductName();
        System.out.println(s1);
        String s=nextProductDescPage.getProductCode();
        System.out.println(s);
        nextProductDescPage.clickonAddToCart();
        nextProductDescPage.clickOnShoppingBag();
        nextProductDescPage.shoppingBagHooverAndClick("VIEW/EDIT BAG");
        String s2=basketPage.getExpectedProductName();
        System.out.println(s2);
        String s3=basketPage.getExpectedProductCode();
        System.out.println(s3);
        assertThat(s1,is(equalTo(s2)));
        assertThat(s,is(equalTo(s3)));
    }

    public void testSuite2(){
    nextHeaderPage.hoverToHeaderOption("Store Locator");
    storeLocationPage.inputName("Ex Display Furniture");
    }
}
