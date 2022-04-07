package Practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class mock1 {
	@org.testng.annotations.Parameters("browsername")
	@Test
	
	public void TC1(String browsername) 
	
	
		{   
		WebDriver driver=null;
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		else if(browsername.equals("edge"))
		{  
			System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		    
		}
		else
		{
			System.out.println("Fail");
		}
		driver.get("https://www.google.com/");
	  
	    System.out.println("Edge is Running");
		}	
		
	}
		
	
