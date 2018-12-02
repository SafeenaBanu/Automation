package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///H:/DropDown.html");
        WebElement hotel = driver.findElement(By.id("maarya"));
        Select sel = new Select(hotel);
        Thread.sleep(1000);
        
        //Select by index
        sel.selectByIndex(1);
        Thread.sleep(1000);
        
        //Select by value
        sel.selectByValue("p");
        Thread.sleep(1000);
        
        //Select by text
        sel.selectByVisibleText("Fish");
        
        //deselect  by index
        sel.deselectByIndex(1);
        Thread.sleep(1000);
        
      //deselect by value
        sel.deselectByValue("p");
        Thread.sleep(1000);
        
        //Deselect by text
        sel.deselectByVisibleText("Fish");
        
        
        driver.close();
	}

}
