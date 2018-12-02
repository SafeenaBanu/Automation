package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://desktop-ka4o3uo/user/submit_tt.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	String eTitle = "actiTIME - Enter Time-Track";
WebDriverWait wait = new WebDriverWait(driver, 10);
try
{
	wait.until(ExpectedConditions.titleIs(eTitle));
	System.out.println("passs.......");
}
catch(Exception e)
{
	System.out.println("fail......");
}
driver.close();
}
}
