package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Internship 
{
	public static void main(String[] args) throws InterruptedException
	{
		//To open the Firefox browser
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//To get the url
		driver.get("https://radiusagent.com/");
		
		//To click on login 
		driver.findElement(By.xpath("//a[.='Log In']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("darshanmw21@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Darshan21");
		
		driver.findElement(By.xpath("//button[.='Login']")).click();
		
		driver.close();
		
	}

}
