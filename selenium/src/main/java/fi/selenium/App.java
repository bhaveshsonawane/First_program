package fi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.cdac.in/");
		//driver.get("https://www.amazon.in/ref=nav_logo");
	}
	
	public void searchProduct()throws InterruptedException
	{
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	public void navigate()
	{
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("This is the title of the website"+driver.getTitle());
		//driver.navigate().back();
	}
	
	public void opengmail()
	{
		driver.findElement(By.id("identierId")).sendKeys("maheshlanghe1998@gmail.com");
		//driver.close();
		driver.findElement(By.id("pass")).sendKeys("1234556");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		App ob = new App();
		ob.launchBrowser();
		//ob.searchProduct();
		//ob.navigate();
		//ob.opengmail();
	}
}