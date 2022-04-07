package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Actions act=new Actions(driver);
	driver.manage().window().maximize();
	WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	act.dragAndDrop(src, dest).perform();
}
	
	
}
