package jsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static void main(String[] args)
	{
		//To Open the firefox browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP WORLD\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	FirefoxDriver f = new FirefoxDriver();
	
	f.close();
	}
}
