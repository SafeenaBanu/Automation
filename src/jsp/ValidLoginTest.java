package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLoginTest
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
    	  driver.get("https://demo.actitime.com/login.do");
    	  ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
    	  
    	  lp.enterUserName("admin");
    	  lp.enterPassword("manager");
    	  lp.clickOnLogin();
    	  
    	  driver.close();
    	  
     }
}
