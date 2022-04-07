package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestuiions_byAction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    WebElement sn = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
    String tt = sn.getAttribute("title");
    System.out.println(tt);
    Thread.sleep(2000);
    Actions ac=new Actions(driver);
    ac.sendKeys(Keys.ARROW_DOWN).click().sendKeys(Keys.ENTER).perform();
    
}
}
