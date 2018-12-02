package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class List3 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///H:/List2.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		driver.close();
				}

}
