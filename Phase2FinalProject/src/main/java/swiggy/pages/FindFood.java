package swiggy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class FindFood {
	
	@FindBy (linkText = "FIND FOOD")
	private WebElement findFoodBtn;
	
	public FindFood(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickContinueBtn() {
		findFoodBtn.click();
		}

}
