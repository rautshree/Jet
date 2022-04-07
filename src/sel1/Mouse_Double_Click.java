package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Double_Click {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	WebElement dbl = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
    Actions act= new Actions(driver);
    WebElement m = driver.findElement(By.xpath("(//span[@class='menu-text'])[7]"));
    act.moveToElement(m).perform();

}
}
