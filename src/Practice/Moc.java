package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Moc
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("arijit");
		
		Thread.sleep(2000);
		
		String Expresult = "arijit singh songs";
		
		List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]"));
		
		for(WebElement s1:alloptions)
		{
			s1.click();
			break;
		}
		
		//driver.findElement(By.xpath("(//div[@class='yg51vc']//span)[2]")).click();	
	}
}


