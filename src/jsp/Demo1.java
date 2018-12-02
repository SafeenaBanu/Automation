package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("file:///H:/Demo1.html");
		Thread.sleep(1000);
		//driver.findElement(By.id("fb")).click();
		//driver.findElement(By.name("link")).click();
		//driver.findElement(By.className("facebook")).click();
		//driver.findElement(By.tagName("a")).click();
		
		//driver.findElement(By.linkText("Inbox(50)")).click();
		
		//driver.findElement(By.partialLinkText("Inbox")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Safeena");
		Thread.sleep(1000);
		driver.close();
	}

}
