package Browser;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chkbox {
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
        Thread.sleep(2000);
        List<WebElement> table = driver.findElements(By.xpath("//input[@type='checkbox']"));
        
//        int i=1;
//        for(WebElement t:table)
//      {   
//        	if(i%2==0)
//        	{t.click();}
//        	Thread.sleep(1000);
//        	i++;
//        }
//        Thread.sleep(2000);
//        for(int j=table.size()-1;j>=0;j--)
//        { 
//         if(j%3==0)	
//         {table.get(i).click();}
//         
//        }
        for(int i=0;i<=table.size()-1;i++)
        {
        	
        	table.get(i).click();
        	
        }
        Thread.sleep(3000);

	}
  }

