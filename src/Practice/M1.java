package Practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
//	Thread.sleep(3000);
//	String w = driver.getWindowHandle();
//	Thread.sleep(3000);
//  driver.switchTo().window(w);
	
	driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
	Thread.sleep(3000);
	
	Set<String> ss = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(ss);
	driver.switchTo().window(al.get(1));
	driver.findElement(By.xpath("(//a[@data-level='1'])[10]")).click();
	Thread.sleep(3000);
	driver.switchTo().window(al.get(0));
	
	
	
	
	
}
}
