package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\HP WORLD\\\\eclipse-workspace\\\\Automation\\\\drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//To enter the url
				driver.get("http://www.seleniumhq.org");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@id='q']")).sendKeys("safeebanu44@gmail.com");
				Thread.sleep(1000);
		    
		        
		      //To enter the url
				driver.navigate().to("http://www.facebook.com");
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("input[type='email']")).sendKeys("safeebanu44@gmail.com");
				Thread.sleep(1000);
		        driver.close();
	}

}
