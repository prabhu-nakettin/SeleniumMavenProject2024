package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;
	
	
	@FindBy(xpath ="//input[@id='Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[@id='Login']")
	private WebElement loginButton;
	

	// operational Method	
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}



	public WebElement getPasswordTextField() {
		return passwordTextField;
	}






	public WebElement getLoginButton() {
		return loginButton;
	}






	public void loginShopperButtonLink(String email,String password) 
	{
		getEmailTextField().sendKeys(email);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
		
	}
	
	public void invalidShopperStackButtonLink(String invalidEmail,String invalidPassword) throws InterruptedException
	
	{
		getEmailTextField().sendKeys(invalidEmail);
		getPasswordTextField().sendKeys(invalidPassword);
		getLoginButton().click();
		Thread.sleep(2000);
		getEmailTextField().clear();
		
	}

}
