package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack
{
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.id("Email")).sendKeys("prabhu@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Prabhu@123");
		
		driver.findElement(By.name("Login")).click();
		
		//driver.findElement(By.id("search")).sendKeys("iphone");
		
		//driver.findElement(By.xpath("//*[name()='svg'and@name='searchBtn']")).click();
		
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		
		
		
	}

}
