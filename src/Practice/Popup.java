package Practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Set<String> w = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(w);
		driver.switchTo().window(al.get(1));
		Actions act =new Actions(driver);
		Set<String> gt = driver.getWindowHandles();
		driver.findElement(By.xpath("(//span[@class='menu-text'])[7]"));
		//act.
		//driver.findElement(By.xpath("(//span[@class='menu-text'])[18]")).click();
		WebElement m = driver.findElement(By.xpath("(//span[@class='menu-text'])[7]"));
	    act.moveToElement(m).perform();
	    Thread.sleep(2000);
	    act.sendKeys(Keys.ARROW_DOWN).perform();
	    Thread.sleep(0);
	    act.sendKeys(Keys.ARROW_DOWN).perform();
	    act.sendKeys(Keys.ARROW_DOWN).perform();
	    act.sendKeys(Keys.ARROW_DOWN).click().build().perform();
	    
	} 

}
