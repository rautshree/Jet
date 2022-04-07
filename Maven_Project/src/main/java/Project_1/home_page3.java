package Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page3 {
@FindBy (xpath ="//span[text()='THM944']" )WebElement UID;
	
	
    public home_page3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    public String getuserid()
    {
    	String actual_user_id = UID.getText();
    	return actual_user_id;
    }
}
