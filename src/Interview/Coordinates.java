package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement email = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        Dimension siz = email.getSize();
        System.out.println(siz.getHeight());
        System.out.println(siz.getWidth());
        Rectangle dim = email.getRect();
        System.out.println(dim.getX());
        System.out.println(dim.getY());
	}
}
