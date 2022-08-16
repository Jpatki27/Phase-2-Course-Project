package swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddFood {
	
	WebDriverWait wait;
	Actions actions;
	
	@FindBy (xpath = ("(//div[contains(@class, '_3L1X9 F8dpS')])[1]"))
	private WebElement addFood;
	
	@FindBy (xpath = ("//div[contains(@class, '_3coNr')]"))
	private WebElement confirmFood;
	
	@FindBy (xpath = ("//button[contains(text(), 'Checkout')]"))
	private WebElement checkout;
	
	@FindBy (xpath = ("//span[contains(@class,'_2EQ3T')]"))
	private WebElement secureMsg;
	
	public AddFood(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clickAddFood() {
		wait.until(ExpectedConditions.visibilityOf(addFood));
		addFood.click();
	}
	
	public void clickCheckOut() {
	//Needed to use Try/Catch because some restaurants have a pop-up to add additional options before adding to cart
	//while other restaurants would send directly to the cart
		try {
			confirmFood.isDisplayed();
			actions.moveToElement(confirmFood).click().build().perform();;
			wait.until(ExpectedConditions.visibilityOf(checkout));
			checkout.click();
			
			}
			catch (NoSuchElementException e) {
				wait.until(ExpectedConditions.visibilityOf(checkout));
				checkout.click();}
	}
	
	public String getSecureMsg() {
		wait.until(ExpectedConditions.visibilityOf(secureMsg));
		String msg = secureMsg.getText();
		return msg;
	}
	
	

}
