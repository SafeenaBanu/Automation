package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("file:///H:/Page1.html");
    driver.findElement(By.id("fn")).sendKeys("Safeena");
    driver.switchTo().frame(0);
    driver.findElement(By.id("mn")).sendKeys("S");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("ln")).sendKeys("Banu");
    }
}
