package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestions_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Iphone");
		Thread.sleep(1000);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		String ExpectedText = "iphone 13 pro max";
		for(WebElement actual:list1)
		{   String act = actual.getText();
			if(act.equals(ExpectedText))
			{
			 actual.click();
			 break;
			}
		}

	}

}
