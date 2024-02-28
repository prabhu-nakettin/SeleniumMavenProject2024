package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="search")
	private WebElement searchBar;
	
	
	@FindBy(id="searchBtn")
	private WebElement searchBarClickButton;
	
	@FindBy(id="cartIcon")
	private WebElement cartButtonIcon;
	
	@FindBy(xpath ="//button[@aria-label='Account settings']")
	private WebElement accountsettingIcon;
	
	@FindBy(xpath ="//li[text()='Logout']")
	private WebElement logoutLink;
	
	
	@FindBy(xpath ="//span[contains(text(),'SAMSUNG Galaxy Z Flip4 ')]/ancestor::div[@class='featuredProducts_cardFooter__qL8vT']/descendant::button[@id='addToCart']")
	private WebElement addtoCartProduct;
	
	
	

	

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchBarClickButton() {
		return searchBarClickButton;
	}

	public WebElement getCartButtonIcon() {
		return cartButtonIcon;
	}

	public WebElement getAccountsettingIcon() {
		return accountsettingIcon;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getAddtoCartProduct() {
		return addtoCartProduct;
	}

	
	
	//operational method
	
	public void logoutFromShopperstack()
	{
		getAccountsettingIcon().click();
		getLogoutLink().click();
	}
	
	
	public void addtoCartProduct() throws InterruptedException
	{
		
		getAddtoCartProduct().click();
	}
	
	
	

	
	
}
