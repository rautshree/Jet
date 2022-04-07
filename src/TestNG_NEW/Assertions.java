package TestNG_NEW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertions {
	
	

	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(4000);
	    String acturl = driver.getCurrentUrl();
	    String exp = "facebook";
		Assert.assertNotEquals(acturl.contains(exp), true);}
	@Test
	public void dashboard()
	{
	 Assert.assertNotEquals(false, false);
	}
	@Test
	public  void Test2()
	{   String a=null;
		Assert.assertNull(a);
	}
	@Test
	public void Test3()
	{
	Assert.assertTrue(true, "Pass");	
	}
	@Test
	public void TEST4()
	{
		Assert.assertFalse(false, "PASS");
	}
	

}
