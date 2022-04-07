package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/BHAGYASHREE%20RAUT/Desktop/checkbox.html");
	//WebElement chk = (WebElement) driver.findElements(By.xpath());
	List<WebElement> chk = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement c1:chk)
	{
		c1.click(); 
		
		Thread.sleep(2000);
	}
	
    for(int i=chk.size()-1;i>=0;i--)
    {
    	
    }
	
}
}

