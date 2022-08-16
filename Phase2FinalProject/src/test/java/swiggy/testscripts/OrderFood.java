package swiggy.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrderFood extends Driver {
	
	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));		
	}
	
	@When("user enters Bangalore, Karnatka, India in city field")
	public void user_enters_bangalore_karnatka_india_in_city_field() throws InterruptedException {
		landingPage.clickLocation();
	}
	
	@When("user clicks on Go")
	public void user_clicks_on_go() throws InterruptedException {
		landingPage.clickFindFood();
	}
	
	@When("selects the first restaurant available")
	public void selects_the_first_restaurant_available() throws InterruptedException {
		selectRestaurant.clickSelectRestaurant();
	}
	
	@When("user clicks Add on the first item of the restaurant page")
	public void user_clicks_add_on_the_first_item_of_the_restaurant_page(){
		addFood.clickAddFood();
		}
	
	@When("user clicks Checkout button on same page")
	public void user_clicks_checkout_button_on_same_page() throws InterruptedException {
		addFood.clickCheckOut();
	}
	
	@Then("user verifies they are on checkout page by validated text {string}")
	public void user_verifies_they_are_on_checkout_page_by_validated_text(String string) {
		String expectedMessage = "SECURE CHECKOUT";
		String actualMessage = addFood.getSecureMsg();	
		Assert.assertEquals(actualMessage,expectedMessage);
	}

}
