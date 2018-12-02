package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascriptpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actiTIME.com/login.do");
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    driver.findElement(By.xpath("//div[contains(text(),'Help ')]")).click();
	    
	    
	    driver.close();
	}

}
