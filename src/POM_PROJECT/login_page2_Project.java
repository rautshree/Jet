package POM_PROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page2_Project {

	@FindBy(xpath = "//input[@type='password']") WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")WebElement cnt;
	
	login_page2_Project(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
