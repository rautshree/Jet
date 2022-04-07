package sel1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator.Implicit;

public class AutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	driver.get("https://www.google.com");

	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
	Thread.sleep(2000);
	String expected = "redmi note 10";

	List<WebElement> ff = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	for(WebElement n1:ff)
	{   String act = n1.getText();
		if(act.equals(expected))
		{
			n1.click();
			break;
		}
	}
	
}
}
