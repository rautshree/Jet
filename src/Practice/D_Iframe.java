package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    Thread.sleep(4000);
	    driver.switchTo().frame("iframeResult");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@title='Change Orientaton']")).click();
	
	
	
	
	}

}
