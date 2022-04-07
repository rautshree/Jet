package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_listbox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.in/");
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Flipkart");
	    Actions act=new Actions(driver);
	    //act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();
	    //act.sendKeys(Keys.ARROW_DOWN);
	    //act.sendKeys(Keys.ENTER);
	    Thread.sleep(4000);
		driver.findElement(By.xpath("(//ul[@class='erkvQe']//div)[37]")).click();
		
		
		
	}

}
