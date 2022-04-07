package POM_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page1 {
	
	
	@FindBy(xpath = "//input[@type='text']") WebElement UN;
	@FindBy(xpath = "//input[@type='password']")private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LOGIN;
	
	Kite_Login_Page1(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void loginid(String log)
	{
		UN.sendKeys(log);
	}
	public void password(String pd)
	{
		PWD.sendKeys(pd);
	}
	public void login()
	{
		LOGIN.click();
	}

}
