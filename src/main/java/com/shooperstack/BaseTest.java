package com.shooperstack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {
	
	public static WebDriver sdriver;  // Static global Veritable  // it is used to Execute the script Parallel
	public WebDriver driver;		// it is a Non Static Variable
	
	@Parameters("Browser")
	@BeforeMethod(alwaysRun = true)
	public void setUp(@Optional("chrome")String Browser) throws IOException {
		Flib lib = new Flib();
		//String browser = lib.getPropertyData(PRO_PATH, "Browser");

		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("invalid browser");
		}
		String url = lib.getPropertyData(PRO_PATH, "url");
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}



	// Take Screenshot failed rest cases

		public void getScreenshootFailedMethod(String methodName)
		{
			TakesScreenshot ts=(TakesScreenshot) BaseTest.sdriver;
		
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 	File dest = new File("./Screenshot"+methodName+".png");
		 	
		 	try {
		 		Files.copy(src, dest);
				
			} 
		 	catch (Exception e) 		 	
		 	{
		 		e.printStackTrace();
			}
		}
		

	
		
		@AfterMethod(alwaysRun = true)
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
