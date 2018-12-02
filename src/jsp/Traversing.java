package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traversing {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP WORLD\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.xpath("//td[text()='Python']/../td[4]"));
		
	}
	

}
