package sel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Elements{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("one plus");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("(//div[@class='_3pLy-c row'][1]//span)[6]")).click();
	String str = driver.findElement(By.xpath("(//div[@class='_3pLy-c row'][1]//span)[6]")).getText();
	
	System.out.println(str);
	
}
}
