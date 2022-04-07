package POM_DDF_FACEBOOK;

import org.antlr.v4.runtime.tree.xpath.XPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
 @FindBy(xpath ="//input[@type='text']" ) WebElement username;
 @FindBy(xpath ="//input[@type='password']" )private WebElement password;
 @FindBy(xpath ="//button[@name='login']" )private WebElement login;
 
	
	
 Loginpage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
	
	
	public void usrname(String s)
	{
		username.sendKeys(s);
	}
	public void pswrd(String g)
	{
		password.sendKeys(g);
	}
	public void login()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
}
