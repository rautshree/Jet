package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_Dynamic_X_path {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Iphone13");
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    String price = driver.findElement(By.xpath("((//a[@class='_1fQZEK'])[1]//div)[19]")).getText();
	    System.out.println(price);
	}

}
