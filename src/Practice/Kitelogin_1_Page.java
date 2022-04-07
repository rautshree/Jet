package Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin_1_Page {
	
	@FindBy(xpath="//input[@type='text']") WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PSW;
	@FindBy(xpath="//button[@type='submit']")private WebElement LOGIN;
	
	Kitelogin_1_Page(WebDriver browser)
	{
		PageFactory.initElements(browser, this);
	}

	
	public void enterusername(String un)
	{
	UN.sendKeys(un);
	}
	public void enterpassword(String ps)
	{
		PSW.sendKeys(ps);
	}
	
    public void click()
    {
    	LOGIN.click();
    }
	}

	
	
	
	 

