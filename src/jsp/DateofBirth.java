package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DateofBirth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/r.php");
        Thread.sleep(1000);
        
        //To get a date
        WebElement Day = driver.findElement(By.id("day"));
        Select d = new Select(Day);
        Thread.sleep(1000);
        d.selectByValue("4");
        Thread.sleep(1000);
        
        //To get a month
        WebElement Month = driver.findElement(By.id("month"));
        Select m = new Select(Month);
        Thread.sleep(1000);
        m.selectByVisibleText("Jan");
        Thread.sleep(1000);
        
        //To get a Year
        WebElement Year = driver.findElement(By.id("year"));
        Select y = new Select(Year);
        Thread.sleep(1000);
        y.selectByVisibleText("1997");
        Thread.sleep(1000);
        
        driver.close();
	}

}
