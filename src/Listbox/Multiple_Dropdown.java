package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("file:///C:/Users/BHAGYASHREE%20RAUT/Desktop/checkbox.html");
    List<WebElement> chk = driver.findElements(By.xpath("//input[@type='checkbox']"));
    
//    for(WebElement s1:chk)
//    {
//    	s1.click();
//    	Thread.sleep(4000);
//    }
    int size = chk.size();
    for(int i=size-1;i>=0;i--)
    {
    chk.get(i).click();
    String text = chk.get(i).getText();
    Thread.sleep(2000);
    System.out.println(text);
    }
}
}
