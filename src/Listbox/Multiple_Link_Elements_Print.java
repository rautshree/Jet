package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Link_Elements_Print {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("https://www.facebook.com/");
    List<WebElement> links = driver.findElements(By.xpath("//a"));
    for(WebElement lnk:links)
    	
    {   Dimension size = lnk.getSize();
        
    	System.out.println(lnk.getText());
    	
    }
    //System.out.println("Size Is");
    int size = links.size();
    System.out.println("The Link Size Is" +size);
     
}
}
