package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP WORLD\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	}
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://127.0.0.1/login.do;jsessionid=4d7ht43a6qm53");
	WebElement un = driver.findElement(By.name("username"));
	
	//To get size of an element
	Dimension s = un.getSize();
	int h = s.getHeight();
	int w = s.getWidth();
	System.out.println("Heigth:"+h);
	System.out.println("Width:"+w);
	
	//To get location of an element
	Point l = un.getLocation();
	int x = l.getX();
	int y = l.getY();
	System.out.println("X-axis:"+x);
	System.out.println("Y-axis:"+y);
	
	//To check whether the element is present or not
	if(un.isDisplayed())
	{
		System.out.println("element is present");
	}
	else
	{
		System.out.println("element is not present");
	}
	
	//To check whether the element is selected or not
	WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
	cb.click();
	if(cb.isSelected())
	{
		System.out.println("selected");
	}
	else
	{
		System.out.println("not selected");
	}
	driver.close();
}
}
