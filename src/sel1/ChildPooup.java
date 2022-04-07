package sel1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPooup {
	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   
	   driver.get("https://skpatro.github.io/demo/links");
	   //click on new tab//
	   driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	 
	   Set<String> ids = driver.getWindowHandles();
	   ArrayList<String> al=new ArrayList<String>(ids);
	   String child = al.get(1);
	   
	   driver.switchTo().window(child);
	 
	   //click on cypress
	   
	   driver.findElement(By.xpath("(//a[@role='menuitem'])[18]")).click();
	   String parent = al.get(0);
	   Thread.sleep(3000);
	   driver.switchTo().window(parent);
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	}

}
