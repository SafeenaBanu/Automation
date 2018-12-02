package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP WORLD\\eclipse-workspace\\Automation\\src\\jsp\\Chromedemo.java");
		WebDriver d= new ChromeDriver();
		d.close();
	}

}
