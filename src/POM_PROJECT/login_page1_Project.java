package POM_PROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page1_Project {

	
	
	@FindBy(xpath = "//input[@type='text']") WebElement UN;
	@FindBy(xpath = "//input[@type='password']")private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LOGIN;
	
	
	login_page1_Project(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
