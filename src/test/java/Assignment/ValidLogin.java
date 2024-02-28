package Assignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shooperstack.BaseTest;
import com.shooperstack.CustomerListnur;
import com.shooperstack.Flib;

import PomPage.LoginPage;
import PomPage.WelcomePage;

@Listeners(CustomerListnur.class)

class ValidLogin extends BaseTest {
	@Test(groups  = "Smoke")
	public void validLogin() throws EncryptedDocumentException, IOException, InterruptedException {

		// click on login pageś

		WelcomePage wp = new WelcomePage(driver);
		wp.loginButton();

		String username = readDataFromExcelSheet(EXCEL_PATH, VALID_DATA, 1, 0);
		String password = readDataFromExcelSheet(EXCEL_PATH, VALID_DATA, 1, 1);

		LoginPage lp = new LoginPage(driver);
		lp.loginShopperButtonLink(username, password);
	}
	
	

	@Test(groups ="Smoke")
	public void invalidTestData() throws InterruptedException, EncryptedDocumentException, IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.loginButton();

		Flib lib = new Flib();

		int rc = lib.getLastrowCount(EXCEL_PATH, INVALID_DATA);

		System.out.println(rc);

		for (int i = 1; i <= rc; i++) {
			String username = lib.readDataFromExcelSheet(EXCEL_PATH, INVALID_DATA, i, 0);
			String password = lib.readDataFromExcelSheet(EXCEL_PATH, INVALID_DATA, i, 1);

			LoginPage page = new LoginPage(driver);
			page.invalidShopperStackButtonLink(username, password);
		}
	}
}
