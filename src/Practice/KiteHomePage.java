package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath="//span[@class='user-id']")private WebElement UID;
	
	KiteHomePage(WebDriver browser)
	{
		PageFactory.initElements(browser, this);
	}
	public void getUID()
	{
		String actualuid = UID.getText();
		String expecteuid = "THM944";
		if(actualuid.equals(expecteuid))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
