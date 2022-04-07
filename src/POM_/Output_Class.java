package POM_;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Output_Class {

	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver d=new EdgeDriver();
	    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    d.get("https://kite.zerodha.com/");
		
		Kite_Login1_Page log1=new Kite_Login1_Page(d);
		log1.login();
		log1.pass();
		log1.loginclick();
		//
		Thread.sleep(3000);
		Kite_Login2_Page log2=new Kite_Login2_Page(d);
		log2.pin();
		log2.cnt();
		Kite_Home_Page log3=new Kite_Home_Page(d);
		log3.UID();
		
			
		
	}
}


