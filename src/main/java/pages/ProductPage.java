package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class ProductPage extends PageBase {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='TPASection_j4ci4xl4']/div/div/div/div/section/div/ul/li[4]/div/a/div[1]/div/img")
	WebElement productFour;
    @FindBy(xpath="//*[@id='TPAMultiSection_j4ci4xqb']/div/div/article/div[1]/div/article/section[2]/div[7]/div[1]/div/div[1]/section/div[2]/div/div/ul/li[2]/label/input")
	WebElement colorPicked;
	
	@FindBy(xpath="//*[@id='TPAMultiSection_j4ci4xqb']/div/div/article/div[1]/div/article/section[2]/div[7]/div[1]/div/div[2]/div/div/div/div/div/input")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id='TPAMultiSection_j4ci4xqb']/div/div/article/div[1]/div/article/section[2]/div[7]/div[2]/button/span")
	WebElement AddCart;
	
	@FindBy(id="widget-view-cart-button")
	WebElement ViewCart;
	
	@FindBy(xpath="//*[@id='root']/div/div/div/div[1]/div[2]/section/div[2]/div/div/button")
	 WebElement checkoutBtn;
	
	 @FindBy(id="total-sum")
	 WebElement Total;
	
	public void selectProduct()
	{
		productFour.click();
		//Actions actions = new Actions(driver);

		//actions.moveToElement(colorPicked).click().perform();
		colorPicked.click();

	}
	public void quantityItem() 
	{
		for(int i=1;i<=3;i++)
		{
			quantity.sendKeys(Keys.ARROW_UP);
		}

	}
	
	public void addCart()
	{
		clickButton(AddCart);
	}
	public void viewCart()
	{
		clickButton(ViewCart);
	}
	public void checkout()
	 {
		 clickButton(checkoutBtn);
		 Assert.assertEquals(Total, "C$75");

	 }

}
