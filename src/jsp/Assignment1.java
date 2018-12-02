package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		//To check whether the radio button is selected or not
		WebElement rb = driver.findElement(By.name("sex"));
		rb.click();
		if(rb.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println(" not selected");
		}
		driver.close();
	}

}
