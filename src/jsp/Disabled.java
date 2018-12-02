package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disabled {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///H:/Disabled.html");
		WebElement usn = driver.findElement(By.tagName("input"));
		if(usn.isEnabled())
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("Disabled");
		}
		driver.close();
	}

}
