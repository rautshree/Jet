package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Bhagyashree Raut");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//b[text()=' Bag Society, Pratibha Nagar, Dhankawadi, Pune, Maharashtra']")).click();
}
}
