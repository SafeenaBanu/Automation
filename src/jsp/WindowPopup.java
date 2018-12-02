package jsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopup {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumhq.org/download/");
	driver.findElement(By.xpath("//a[.='3.141.59']")).click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_LEFT);
	r.keyRelease(KeyEvent.VK_LEFT);
	Thread.sleep(1000);
	/*r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);*/
     driver.close();
	}

}
