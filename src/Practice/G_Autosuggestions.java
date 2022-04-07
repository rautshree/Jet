package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_Autosuggestions {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amitabh bachhan");
    Thread.sleep(3000);
	driver.findElement(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li[4]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='IC1Ck']//div)[6]")).click();
}

}
