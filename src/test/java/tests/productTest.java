package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;


public class productTest extends TestBase {
	HomePage pageobject;
	ProductPage productobject;
	@Test
	
	public void viewProducts()
	{
		pageobject=new HomePage(driver);
		pageobject.clickShopItem();
		productobject = new ProductPage(driver);
		productobject.selectProduct();
		productobject.quantityItem();
		productobject.addCart();
		productobject.viewCart();
		productobject.checkout();
		
		
		
		
	}
	
	

}
