package StepDefination;

import Training.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddToCartSteps {
    NextHomePage nextHomePage=new NextHomePage();
    NextHeaderPage nextHeaderPage=new NextHeaderPage();
    NextProductPage nextProductPage=new NextProductPage();
    NextProductDescPage nextProductDescPage=new NextProductDescPage();
    BasketPage basketPage=new BasketPage();
    String s1,s,s2,s3;
    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        assertThat(nextHomePage.isOnHomePage(),is(true));
    }

    @When("^I hover on \"([^\"]*)\"$")
    public void i_hover_on(String to){
        nextHeaderPage.hoverToMegaNavElements(to);

        }

    @When("^I hover on subcategory \"([^\"]*)\"$")
    public void i_hover_on_subcategory(String to){
        nextHeaderPage.hoverToSubcat(to);
    }

    @When("^I select \"([^\"]*)\"$")
    public void i_select(String to) {
        nextHeaderPage.category(to);
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String filter) {
        nextProductPage.clickProduct(filter);
    }

    @When("^I click on add to bag$")
    public void i_click_on_add_to_bag() {
        s1=nextProductDescPage.getProductName();
        s=nextProductDescPage.getProductCode();
        nextProductDescPage.clickonAddToCart();
        }

    @When("^I hover on shopping bag and click on \"([^\"]*)\"$")
    public void i_hover_on_shopping_bag_and_click_on(String viewOrCheckout) {
        nextProductDescPage.shoppingBagHooverAndClick(viewOrCheckout);
    }

    @And("^I click on shopping bag$")
    public void iClickOnShoppingBag() {
        nextProductDescPage.clickOnShoppingBag();
    }

    @Then("^I should see respective product add in my cart with correct name$")
    public void iShouldSeeRespectiveProductAddInMyCartWithCorrectName() {
        s2=basketPage.getExpectedProductName();
        assertThat(s1,is(equalTo(s2)));
    }

    @And("^I should see respective product add in my cart with correct product code$")
    public void iShouldSeeRespectiveProductAddInMyCartWithCorrectProductCode() {
        s3=basketPage.getExpectedProductCode();
        assertThat(s, is(equalTo(s3)));
    }
}
