package swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectRestaurant {
	WebDriverWait wait;
	
	@FindBy (xpath = ("(//div[contains(@class, '_3XX_A')]/a)[1]"))
	//Used the second restaurant on the page to test the Try/Catch in AddFood.java
	//@FindBy (xpath = ("(//div[contains(@class, '_3XX_A')][2]/a)[1]"))
	private WebElement selectRestaurant;
	
	public SelectRestaurant(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clickSelectRestaurant() {
		wait.until(ExpectedConditions.visibilityOf(selectRestaurant));
		selectRestaurant.click();
		}

}
