package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="comp-iy4cwgmq1label")
	WebElement Shop;
	
	public void clickShopItem()
	{
		Shop.click();
		 
	}
	

}
