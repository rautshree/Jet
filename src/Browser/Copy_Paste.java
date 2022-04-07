package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste {
	
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       WebElement fname = driver.findElement(By.xpath("//input[@type='text']"));
       Actions ac=new Actions(driver);
       ac.sendKeys(fname, "Bhagyashree");
       Thread.sleep(2000);
       ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
       ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
       WebElement psswrd = driver.findElement(By.xpath("//input[@type='password']"));
       psswrd.click();
       ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
       



}
}
