package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
   
public class annotations_practice {
	@BeforeClass
	public void bhagyashree()
	{
		Reporter.log("I LOVE YOU BHAGYASHREE");
	}
	@AfterClass
	public void Raut()
	{
		Reporter.log("I LOVE YOU RAUT");
	}
	@Test
public void autosuggestions() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Bhagyashree Raut");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//b[text()=' Bag Society, Pratibha Nagar, Dhankawadi, Pune, Maharashtra']")).click();
    Thread.sleep(4000);
    Reporter.log("test case is passed");
    driver.close();
}
	@BeforeMethod
	public void Screenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.co.in/");
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String name = null;
		//String di1 = System.getProperty("user.dir")+"\\S1"+".jpg";
		String path = System.getProperty("user.dir")+"//S1"+name+".png";
		//File f= new File("C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Sel");
		File dest=new File(path);
		FileHandler.copy(scr, dest);
	
	}
	
  @AfterMethod
   public void ss() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	Thread.sleep(2000);
	
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(4000);
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	Thread.sleep(3000);
	Actions act =new Actions(driver);
	WebElement ori = driver.findElement(By.xpath("//span[@style='position:relative;top:-4px;left:2px;']"));
	act.moveToElement(ori).click().perform();
	
}
	
	
}
