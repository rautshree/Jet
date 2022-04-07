package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arjit_Songs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		//driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Arijit Singh");
		//Thread.sleep(2000);
		String exp = "arijit singh songs";
List<WebElement> s1 = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		
		
		for(WebElement t1:s1)
		{
			String act = t1.getText();
			if(act.equalsIgnoreCase(exp))
			{
				t1.click();
				break;
			}
				
		}
		Thread.sleep(2000);
//		List<WebElement> ss = driver.findElements(By.xpath("(//div[@class='MUFPAc']//span)[4]"));
//		for(WebElement s12:ss)
//		{
//			s12.click();
//			break;
//		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='yg51vc']//span)[4]")).click();

	}

}
