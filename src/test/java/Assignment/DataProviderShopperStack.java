package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderShopperStack  // when more serching applicaton is present that time we need to use @dataproviderannotation
{
	@DataProvider(name="TestData")
	
	public Object[][] LoginShopperStack()
	{
		Object [][]td=new Object[4][2];
		
		td[0][0]="Prabhu@gmail.com";
		td[0][1]="Prabhu@123";
		
		td[1][0]="gmail@prabhu";
		td[1][1]="123@pra";
		
		td[2][0]="prabhu@gmail.com";
		td[2][1]="Prabhu@122";
		
		td[3][0]="Prabhu@122";
		td[3][1]="Prabhu@122";
		
		return td;
	}
	@Test(dataProvider ="TestData")
	public void LoginOperationString(String username,String password)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		driver.quit();
		
		
		
	}
	
	
	
}
