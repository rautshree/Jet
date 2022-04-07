package Practice;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroling {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	JavascriptExecutor scrl = ((JavascriptExecutor)driver);
	
	WebElement cl = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	scrl.executeScript("arguments[0].value='arjit singh';", cl);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//ul[@jsname='bw4e9b']//li)[2]")).click();
	Thread.sleep(3000);
	
	//scrl.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(4000);
	WebElement songs = driver.findElement(By.xpath("//h3[text()='List of songs recorded by Arijit Singh - Wikipedia']"));
	//scrl.executeScript("window.scrollBy(0,-300)");
	Thread.sleep(4000);
	scrl.executeScript("arguments[0].scrollIntoView();", songs);
	Thread.sleep(4000);
	//click method
	scrl.executeScript("arguments[0].click();", songs);
	
    //driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-msel']")).click();
	
	
	
	
	
	
	
	
	
	

} 
}
