package jsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchContolToSpecifiedWindow
{
    public static void main(String[] args)
    {
    	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	
    	driver.get("https://www.naukri.com/");
    	Set<String> allWH = driver.getWindowHandles();
    	for(String wh : allWH)
    	{
    		driver.switchTo().window(wh);
    		String title = driver.getTitle();
    		if(title.equals("ICON Clinical Research"))
    		{
    			break;
    		}
    		driver.manage().window().maximize();
    	}
    }
}
