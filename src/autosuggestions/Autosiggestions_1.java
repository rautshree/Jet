package autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosiggestions_1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Iphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@jsname='bw4e9b']//li)[4]")).click();
		
		
	}

}
