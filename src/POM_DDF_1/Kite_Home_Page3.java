package POM_DDF_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page3
{
	@FindBy (xpath ="//span[@class='user-id']" )WebElement UID;
	
	
	Kite_Home_Page3(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void uncheck()
	{
		UID.click();
		String act_id = UID.getText();
		String exp="812073";
		if(act_id.equals(exp))
		{
			System.out.println("Pass Case");
		}
		else
		{
			System.out.println("Failed Case");
		}
	}
	
	
	
}
