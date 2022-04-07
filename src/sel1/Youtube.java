package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Arjit Singh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("https://i.ytimg.com/vi/HPkydJOXXNs/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCm2_sIojomutO9_kC_mKIsR-dS7Q")).click();
		 driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
		 Thread.sleep(7000);
		 //driver.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-skip-button-text']")).click();
		 
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-skip-button-text']")).click();
	}

}
