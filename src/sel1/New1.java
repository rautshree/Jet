package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	   
	   driver.findElement(By.xpath("//input[@name='confirmation']")).click();
	   Thread.sleep(2000);
	   String st = driver.switchTo().alert().getText();
	   
	   System.out.println(st);
	   driver.switchTo().alert().accept();
	   
}
}
