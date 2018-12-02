package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class DownloadPage 
{
         @FindBy(xpath = "//a")
         private List<WebElement> allLinks;
         
         //Initialization
         public DownloadPage(WebDriver driver)
         {
        	 PageFactory.initElements(driver, this);
         }
         
         //Utilization
         public void getLinks()
         {
			int count = allLinks.size();
        	 System.out.println(count);
        	 
        	 for(WebElement link : allLinks)
        	 {
        		 System.out.println(link.getText());
        	 }
         }
}
