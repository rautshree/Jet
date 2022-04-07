package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion_Practice {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Jubin Nautiyal");
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//div[@class='pcTkSc'])[3]")).click();
    driver.findElement(By.xpath("(//span[@class='bmaJhd iJddsb'])[2]")).click();
    Thread.sleep(3000);
   // driver.findElement(By.xpath("//h3[text()='O Aasman Wale (Official Video) Ft Jubin Nautiyal, Neha Khan']")).click();
    WebElement mv = driver.findElement(By.xpath("//h3[text()='Khushi Jab Bhi Teri Song |Jubin Nautiyal, Khushalii Kumar']"));
    Actions ac=new Actions(driver);
    ac.moveToElement(mv).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
}
}
