package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("qspiders");
        Thread.sleep(1000);
        
        //To get address of all suggestion
        List<WebElement> allSuggestion = driver.findElements(By.xpath(""));
        
        //To get size of all suggestions
        int count = allSuggestion.size();
        System.out.println(count);
        
        //to print all suggestions
        for(WebElement suggestion : allSuggestion)
        {
        	String text = suggestion.getText();
        	System.out.println(text);
        	}
       
        /*//To click on last suggestion
        WebElement s = allSuggestion.get(count-1);
        s.click();
        driver.close();*/
	}

}
