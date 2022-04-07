package sel1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Elements
{
	public static void main(String[] args) throws SecurityException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("file:///C:/Users/BHAGYASHREE%20RAUT/Desktop/checkbox.html");
        List<WebElement> chk = driver.findElements(By.xpath("//input[@type='checkbox']"));
        
//        int sizeofchkboxes = chk.size();
//        System.out.println(sizeofchkboxes);
//        
//        
//        System.out.println();
//        
            for(WebElement chk1:chk)
        {
        	//chk1.getText();
        	System.out.println(chk1.getText());
        	//Thread.sleep(2000);
        }
        
        //deselect by descending.
//        for(int i=chk.size()-1;i>=0;i--)
//        {
//        	chk.get(i).click();
//        	Thread.sleep(2000);
//        }
        
        //deselect by ascending order
        
//        for(int i=0;i<=chk.size()-1;i++)
//        {
//        	chk.get(i).click();
//        	Thread.sleep(1000);
//      }
//        
	}

}
