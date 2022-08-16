package swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPages {
	Actions actions;
	WebDriverWait wait; 
	
	@FindBy(xpath = "//input")
	private WebElement location;
	
	@FindBy(xpath = "//div[contains(@class, '_1oLDb')]/button/span[2]")
	private WebElement selectLocation;
	
	public LandingPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickLocation() throws InterruptedException {
		location.click();
		location.clear();
		location.sendKeys("Bangalore, Karnataka, India");
	}
	
	public void clickFindFood() {
		wait.until(ExpectedConditions.visibilityOf(selectLocation));
		selectLocation.click();
	}
}