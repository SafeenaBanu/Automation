package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest 
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
		driver.get("https://en-gb.facebook.com/");
		FacebookLoginPage fp = new FacebookLoginPage(driver);
		/*fp.email("safeebanu44@gmail.com");
		fp.password("Safeena@44");
		fp.loginbutton();*/
		fp.firstname("Safeena");
		fp.surname("Banu");
		fp.mobile("7353956269");
		fp.confirmpassword("Safeen@44");
		fp.date("4");
		fp.month("Jan");
		fp.year("1997");
		fp.radiobutton();
		//fp.signup();
		Thread.sleep(1000);
		//driver.close();

	}

}
