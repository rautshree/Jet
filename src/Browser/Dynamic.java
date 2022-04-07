package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
public static void main(String[] args) {
	
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//*[@class='_3704LK']")).sendKeys("Realme narzo");
		driver.findElement(By.xpath("//*[@class='L0Z3Pu']")).click();
		
	    String prize = driver.findElement(By.xpath("((//div[@class='_13oc-S'])[1]//div)[21]")).getText();
	   	
	    System.out.println(prize);
	
	    WebElement second = driver.findElement(By.xpath("((//div[@class='_13oc-S'])[2]//div)[21]"));
        System.out.println(second.getText());
	}

}

