package jsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseSpecifiedBrowser
{
	public static void main(String[] args) throws InterruptedException
    {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	Set<String> allwh = driver.getWindowHandles();
	for(String wh : allwh)
	{
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		if(title.equals("Fullerton"))
		{
			driver.close();
		}
	}
}
}
