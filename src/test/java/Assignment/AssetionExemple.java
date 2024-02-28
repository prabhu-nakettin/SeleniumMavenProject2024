package Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssetionExemple 
{
	
	WebDriver driver;
	@Test
	public void assertionLearining()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		System.out.println("the title of Application is:"+actualTitle);
		
		//Assert.assertEquals(actualTitle,expectedTitle);  //hard Assert
		
//		if(actualTitle.equals(expectedTitle))
//		{
//			System.out.println("Tittle is verified");
//		}
//		else
//		{
//			System.out.println("Tittle is not Verified");
//		}
		
		
		// SoftAssetion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expectedTitle,actualTitle);
		sa.assertAll();
		
		driver.quit();
		
		
	
		
		
	}
}



