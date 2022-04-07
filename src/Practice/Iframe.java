package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	Thread.sleep(2000);
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(4000);
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	Thread.sleep(3000);
	Actions act =new Actions(driver);
	WebElement ori = driver.findElement(By.xpath("//span[@style='position:relative;top:-4px;left:2px;']"));
	act.moveToElement(ori).click().perform();
	
	
	
	
}
}
