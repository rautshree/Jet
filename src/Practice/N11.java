package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class N11 {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Desktop\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://cocalc.com/settings");
	    Actions act=new Actions(driver);
	    WebElement ms = driver.findElement(By.xpath("//span[text()='Sign in']"));
	    act.moveToElement(ms).click().build().perform();
	    
}
}
