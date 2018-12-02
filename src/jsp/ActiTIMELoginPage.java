package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIMELoginPage 
{
	//Declaration
    @FindBy(id="username")
    private WebElement unTB;
    
    @FindBy(name="pwd")
    private WebElement pwTB;
    
    @FindBy(xpath="//div[.='Login ']")
    private WebElement loginBTN;
    
    //Initialization
    public ActiTIMELoginPage (WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //Utilization
    public void enterUserName(String un)
    {
    	unTB.sendKeys(un);
    }
    public void enterPassword(String pw)
    {
    	pwTB.sendKeys(pw);
    }
    public void clickOnLogin()
    {
    	loginBTN.click();
    }
}
