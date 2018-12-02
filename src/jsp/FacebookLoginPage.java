package jsp;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage
{
       //Initialization
	   /*@FindBy(id="email")  private WebElement em;
	   
	   @FindBy(id="pass")  private WebElement pswd;
	   
	 @FindBy(id="loginbutton")  private WebElement lgnBTN;*/
	   
	  // @FindBy(xpath="//a[.='Forgotten account?']") private WebElement fpswd;
	   
	   @FindBy(name="firstname")   private WebElement fn;
	   
	   @FindBy(name="lastname")   private WebElement sn;
	   
	   @FindBy(name="reg_email__")  private WebElement mbl;
	   
	   @FindBy(name="reg_passwd__")  private WebElement pwd;
	   
	   @FindBy(id="day") private WebElement dt;
	   
	   @FindBy(xpath="//option[.='Jan']") private WebElement mnt;
	   
	   @FindBy(name="birthday_year") private WebElement yr;
	   
	   @FindBy(name="sex") private WebElement btn;
	   
	   @FindBy(xpath="//button[.='Sign Up']") private WebElement sgn;
	   
	   //Initialization
	   public FacebookLoginPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   
	   //Utilization
	   
	   //LOgin the facebook
	  /* public void email(String eml)
	   {
		   em.sendKeys(eml);
	   }
	   
	   public void password(String pw)
	   {
		   pswd.sendKeys(pw);
	   }
	   public void loginbutton()
	   {
		   lgnBTN.click();
	   }*/
	   
	   //SignUp to facebook
	   public void firstname(String fun)
	   {
		   fn.sendKeys(fun);
	   }
	   public void surname(String sun)
	   {
		   sn.sendKeys(sun);
	   }
	   public void mobile(String mob)
	   {
		   mbl.sendKeys(mob);
	   }
	   public void confirmpassword(String cpd)
	   {
		   pwd.sendKeys(cpd);
	   }
	   public void date(String dat)
	   {
		   dt.sendKeys(dat);
	   }
	   public void month(String mt)
	   {
		   mnt.sendKeys(mt);
	   }
	   public void year(String yer)
	   {
		   yr.sendKeys(yer);
	   }
	   public void radiobutton()
	   {
		   btn.click();
	   }
	 /*  public void signup()
	   {
		   sgn.click();
	   }*/
	  
	   
}
