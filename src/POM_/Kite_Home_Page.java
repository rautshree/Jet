package POM_;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM CLASS 3
public class Kite_Home_Page {
  
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	
	Kite_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void UID()
	{
		String actual = UserID.getText();
		String expected = "TMH944";
		if(actual.equals(expected))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
	}
}
