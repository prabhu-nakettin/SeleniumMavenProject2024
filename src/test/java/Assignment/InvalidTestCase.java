package Assignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.shooperstack.BaseTest;
import com.shooperstack.Flib;

import PomPage.LoginPage;
import PomPage.WelcomePage;

public class InvalidTestCase extends BaseTest
{
	@Test(groups  = "Regression")
	public void invalidTestData() throws InterruptedException, EncryptedDocumentException, IOException
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.loginButton();
		
		Flib lib = new Flib();
		
		int rc = lib.getLastrowCount(EXCEL_PATH, INVALID_DATA);
		
		System.out.println(rc);
		
		for(int i=1;i<=rc;i++)
		{
			String username = lib.readDataFromExcelSheet(EXCEL_PATH, INVALID_DATA, i, 0);
			String password = lib.readDataFromExcelSheet(EXCEL_PATH, INVALID_DATA, i, 1);
			
			LoginPage page = new LoginPage(driver);
			page.invalidShopperStackButtonLink(username, password);
		}
		
	
		
		
		
	}


	
}
