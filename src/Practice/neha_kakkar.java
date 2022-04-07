package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class neha_kakkar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("neha kakkar");
		Thread.sleep(4000);
		driver.findElement(By.xpath("((//ul[@jsname='bw4e9b'])[1]//li)[8]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='IC1Ck']//div)[8]")).click();
	
	    List<WebElement> all_links = driver.findElements(By.xpath("//a"));
	    for(WebElement link:all_links)
	    {
	    //	System.out.println(link.getText());
	    	System.out.println(link.getSize());
	    }
	
	}
}
