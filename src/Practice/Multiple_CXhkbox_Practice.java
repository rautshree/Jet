package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_CXhkbox_Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//input[@class='button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//b[text()='Admin']")).click();
        Thread.sleep(3000);
        List<WebElement> mult = driver.findElements(By.xpath("//input[@type='checkbox']"));
	   
        int i=1;
        for(WebElement chk:mult)
    	
        {   if(i%2==0)
    	{chk.click();}
	    	Thread.sleep(3000);
      	i++;
        }
        int value = mult.size();
        for(int j=value-1;j>=1;j--)
        {
         mult.get(j).click();
         System.out.println(  mult.get(j).getText());
        }
        
        
	}

}
