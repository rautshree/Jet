package BASE_UTILITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_1 {
	
	WebDriver d;
	
	public void initial()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver d=new EdgeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    d.get("https://kite.zerodha.com/");
	
	}

}
