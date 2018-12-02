package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException
	{
		
		//To open the Firefox Browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP WORLD\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		
		//To enter the url
		driver.get("http://www.gmail.com");
		Thread.sleep(1000);
		
		//To navigate to other web page
		driver.navigate().to("http://www.google.com");
		Thread.sleep(1000);
		
		//To go to previous page
		driver.navigate().back();
		Thread.sleep(1000);
		
		//to go to next web page
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().to("file:///D:/HtmlLocators.html");
		
		//using id
		driver.findElement(By.id("link")).click();;
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using name
		driver.findElement(By.name("fb")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using className
		driver.findElement(By.className("ab")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using tagname
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using linkText
		driver.findElement(By.linkText("Forgot Password???")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//using partialLinkText
		driver.findElement(By.partialLinkText("Inbox")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.close();
	}

}
