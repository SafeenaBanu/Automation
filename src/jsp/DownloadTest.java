package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadTest
{
     static
     {
    	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
    	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     }
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.seleniumhq.org/");
        DownloadPage dp = new  DownloadPage(driver);
        dp.getLinks();
        Thread.sleep(1000);
        driver.close();
	}

}
