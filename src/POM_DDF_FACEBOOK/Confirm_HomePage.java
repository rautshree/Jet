package POM_DDF_FACEBOOK;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class Confirm_HomePage {

	@FindBy(xpath = "//img[@class='_97vu img']") private WebElement Home;
	
	
	
	Confirm_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void home(String s)
//	{
//		Home.click();
//	String act = Home.getText();
//	String Ext="Facebook";
//		if(act.equals(Ext))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
//		
//		System.out.println("2ND CRITERIA");
	  public String getactualstring()
	{     
		  String act = Home.getText();
		  return act;
	}
		
	}
	

