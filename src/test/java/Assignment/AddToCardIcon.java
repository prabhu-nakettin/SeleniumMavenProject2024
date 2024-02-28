package Assignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.shooperstack.BaseTest;

import PomPage.HomePage;

public class AddToCardIcon extends BaseTest
{
	
	@Test(groups = "Smoke")
	public void addToCart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ValidLogin validLoginClass=new ValidLogin(); // this object for valid login class 
		
		validLoginClass.validLogin();
		
		HomePage hp = new HomePage(driver);
		hp.addtoCartProduct();
		
		hp.logoutFromShopperstack();
		
	}
	
	
	
	
	
}
