package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_HandlingofDropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    Thread.sleep(2000);
    WebElement log=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
    Actions act=new Actions(driver);
    act.moveToElement(log).perform();
    Thread.sleep(3000);
    act.moveToElement(log).perform();
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[3]")).click();
    
}
}
