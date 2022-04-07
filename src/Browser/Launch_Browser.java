package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(4000);
	    driver.navigate().forward();
	    Thread.sleep(5000);
	    driver.navigate().to("https://www.instagram.com/");
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    String title = driver.getTitle();
	    System.out.println(title);
	    String exp = "Instagram";
	    if(title.equals(exp))
	    {
	    	System.out.println("On Correct Webpage");
	    }
	    Thread.sleep(3900);
	    driver.close();
	    
	    
	    
	    
	    
	}

}
