package jsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseOnlyChildBrowser
{
      public static void main(String[] args) throws InterruptedException
      {
    	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
  		WebDriver driver = new FirefoxDriver();
  		driver.manage().window().maximize();
  		driver.get("https://www.naukri.com/");
  		String pwh = driver.getWindowHandle();
  		Set<String> allwh = driver.getWindowHandles();
  		allwh.remove(pwh);
  		for(String wh: allwh)
  		{
  			driver.switchTo().window(wh);
  			driver.close();
  			Thread.sleep(1000);
  		}
  		driver.switchTo().window(pwh);
  		Thread.sleep(1000);
  		driver.close();
      }
}
