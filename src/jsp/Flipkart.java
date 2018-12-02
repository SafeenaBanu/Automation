package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart
{

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.name("q")).sendKeys("iphone");
    Thread.sleep(1000);
    
    //To get address of all suggestions
    List<WebElement> allSuggestions = driver.findElements(By.xpath("//a[@class='_2ja22P']"));
    
    //To get size of all suggestion
    int count = allSuggestions.size();
    System.out.println(count);
    
    //To print all suggestions
    for(WebElement suggestion : allSuggestions)
    {
    	String text = suggestion.getText();
    	System.out.println(text);
    }
    
    //To click on last suggestion
    WebElement s = allSuggestions.get(count - 1);
    s.click();
    Thread.sleep(2000);
    driver.close();
	}

}
