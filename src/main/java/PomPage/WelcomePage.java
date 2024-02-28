package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{ 
	

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath ="//button[text()='Login']")
	private WebElement loginButton;
	
	
	
	@FindBy(xpath = "//a[@id='men']")
		private WebElement menLink;
	
	@FindBy(xpath = "(//button[@name='addToCart'])[1]")
	private WebElement addtoToChart;
	
	
	
	
	

	public WebElement getMenLink() {
		return menLink;
	}


	public WebElement getAddtoToChart() {
		return addtoToChart;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	// operational Method
	
	
	
	
	public void loginButton() throws InterruptedException
	{
	
		getLoginButton().click();	
		
	}
	// apply explicitly wait for check button
	
	


	

}
