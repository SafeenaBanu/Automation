package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("file:///H:/Checkbox.html");
        
        //To get address of all checkbox
         List<WebElement> allCb = driver.findElements(By.xpath("//input[@type='checkbox']"));
        
         //To count no. of checkbox
         int count = allCb.size();
         System.out.println(count);
         
         //To select all checkbox
         for(int i=0;i<count;i++)
         {
        	 WebElement cb=allCb.get(i);
        	 cb.click();
        	 Thread.sleep(1000);
         }
         
         Thread.sleep(1000);
         driver.close();
        
	}

}
