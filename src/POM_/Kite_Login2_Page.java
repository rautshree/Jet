package POM_;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM CLASS 2
     public class Kite_Login2_Page {
	 @FindBy(xpath = "//input[@minlength='6']")private WebElement PIN;
	 @FindBy(xpath = "//button[@type='submit']")private WebElement Continu;
  
	 Kite_Login2_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
     public void pin()
     {
    	 PIN.sendKeys("812073");
     }
     public void cnt()
     {
    	 Continu.click(); 
     }
}
