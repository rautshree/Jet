package POM_DDF_TESTNG_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page2 {
	
	
	
	@FindBy(xpath = "//input[@type='password']") WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")WebElement cnt;
	
	Kite_Login_Page2(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
    public void Pin(String pn)
    {
    	PIN.sendKeys(pn);
    
    }
    public void contin()
    {
    	cnt.click();
    }
}
