package POM_;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM CLASS 1  
    public class Kite_Login1_Page {
	
	//DECLARATION
    	@FindBy(xpath = "//input[@type='text']")private WebElement UN;
    	@FindBy(xpath = "//input[@type='password']")private WebElement pwd;
    	@FindBy(xpath = "//button[@type='submit']")private WebElement Login;
    	
    	public Kite_Login1_Page(WebDriver driver)
    	{
         PageFactory.initElements(driver, this);
    	}
    	
    	public void login()
    	{
    		UN.sendKeys("THM944");
    	}
    	public void pass()
    	{
    		pwd.sendKeys("Bisen@7566");
    	}
    	public void loginclick()
    	{
    		Login.click();
    	}
    	
}
  