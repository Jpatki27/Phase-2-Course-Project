package swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import swiggy.pages.LandingPages;
import swiggy.pages.AddFood;
import swiggy.pages.FindFood;
import swiggy.pages.SelectRestaurant;

public class Driver extends Tools{
	
	protected static LandingPages landingPage;
	protected static FindFood findFood;
	protected static SelectRestaurant selectRestaurant;
	protected static AddFood addFood;
	
	
	public static void init() {
		
		driver = new ChromeDriver();
		landingPage = new LandingPages(driver);
		findFood = new FindFood(driver);
		selectRestaurant = new SelectRestaurant(driver);
		addFood = new AddFood(driver);
	}

}
