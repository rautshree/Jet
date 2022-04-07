package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class lst {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement s1 = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	    Select s=new Select(s1);
	   // s.selectByIndex(0);
	   // s.selectByValue("Feb");
	   // s.selectByVisibleText("Mar");
	   // Thread.sleep(2000);
	   // s.deselectAll();
	   // s.deselectByIndex(3);
	   //List<WebElement> month = s.getOptions();
//	   for(WebElement m1:month)
//	   {
//		   System.out.println(m1);
//	   }
//	    
//	    
	   List<WebElement> ssss = s.getOptions();
	 
	   
	   
	   
   for(WebElement st:ssss)
   {      
		   String ss1 = st.getText();
		   ArrayList<String> sq=new ArrayList<String>();
		   sq.add(ss1);
		   //System.out.println(sq);
		   Collections.sort(sq);
		   for(String sor:sq)
		   {
			   System.out.println(sor);
		   }
   }
	    
		}
 	
}

