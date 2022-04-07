package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Clicking {
	
	static void left_click() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    Actions act=new Actions(driver);
	    WebElement log = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	    Thread.sleep(3000);
	    act.click(log).perform();
		
	}
	
	
	
	
	
	
	
public static void main(String[] args) throws InterruptedException {
	left_click();
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//    driver.get("https://www.flipkart.com/");
//    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//    Thread.sleep(2000);
//    Actions act= new Actions(driver);
//    WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
//    act.contextClick(more).perform();
//    
}
}
