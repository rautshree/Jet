package sel1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		  WebElement fn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		  
		 Actions act=new Actions(driver);
		 act.sendKeys(fn,"Bhagyashree").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 
		   
	}

}
