package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin_2_Page {
	
	
	@FindBy(xpath="//input[@minlength='6']")private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']")private WebElement CONTINUE;
	

	Kitelogin_2_Page(WebDriver browser)
	{
		PageFactory.initElements(browser, this);
	}
	public  void enterPIN(String pn)
	{
		PIN.sendKeys(pn);
	}
	public void contnue()
	{
		CONTINUE.click();
	}
}
