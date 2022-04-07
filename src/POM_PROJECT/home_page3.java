package POM_PROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page3 {
@FindBy (xpath ="//span[text()='THM944']" )WebElement UID;
	
	
home_page3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	
//	public void uncheck()
//	{
//		UID.click();
//		String act_id = UID.getText();
//		String exp="812073";
//		if(act_id.equals(exp))
//		{
//			System.out.println("Pass Case");
//		}
//		else
//		{
//			System.out.println("Failed Case");
//		}
//	}
    public String getuserid()
    {
    	String actual_user_id = UID.getText();
    	return actual_user_id;
    }
}
