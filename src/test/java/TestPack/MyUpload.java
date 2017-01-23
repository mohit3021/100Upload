package TestPack;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyUpload {
	
	String var1="MohitFileRoom54";
	
	
   WebDriver driver;
	@BeforeMethod
	public void mtBet() throws InterruptedException, MalformedURLException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohitkumar.sharma\\Desktop\\Selenium_Data\\Used_Software\\chromedriver.exe");
		 driver=new ChromeDriver();
		  
		 driver.manage().window().maximize();
		 */
		 DesiredCapabilities dc=DesiredCapabilities.firefox();
			dc.setCapability("version", "47.0");
			dc.setCapability("platform", "Windows 7");
			driver=new RemoteWebDriver(new URL("http://mohitkumarsharma1:a972ccf9-23e8-43e2-83a1-42c8f518dc92@ondemand.saucelabs.com:80/wd/hub"), dc);
			
			//driver=new RemoteWebDriver(new URL("http://mohitkumarsharma1:a972ccf9-23e8-43e2-83a1-42c8f518dc92@ondemand.saucelabs.com:80/wd/hub"), dc);
			
		 
		 System.out.println("****************Hitting URL on Browser***************");
		 driver.get("https://stage-web.core.merrillcorp.com");
		  
		 //Thread.sleep(4000);
		 
	}
	
	@Test
	public void applicationLogin() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.id("username"))));
		
		System.out.println("****************Login Application***************");
		driver.findElement(By.id("username")).sendKeys("sanity_janadmin19@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		
		
		//WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//span[text()='DOCUMENTS']"))));
		
		System.out.println("****************clicing on doucment***************");
		
		driver.findElement(By.xpath(".//span[text()='DOCUMENTS']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//*[@class='text-uppercase ng-binding']"))));
		//Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@class='text-uppercase ng-binding']")).click();
		
		System.out.println("****************Adding Fileroom***************");
		
		driver.findElement(By.xpath(".//*[@name='fileRoomName']")).sendKeys(var1);
		
		driver.findElement(By.xpath(".//*[text()='ADD']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//*[text()='"+var1+"']"))));
		
		//Thread.sleep(3000);
		
		System.out.println("****************Clicking on Fileroom***************");
		
		driver.findElement(By.xpath(".//*[text()='"+var1+"']")).click();
		
		System.out.println("****************Upload***************");
		
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//*[text()='UPLOAD']"))));
		
		driver.findElement(By.xpath(".//*[text()='UPLOAD']")).click();
		
		System.out.println("****************Browsing files from desktop***************");
		
		
		
       //Thread.sleep(3000);
       wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//*[text()='Browse']"))));
		driver.findElement(By.xpath(".//*[text()='Browse']")).click();
		
		Thread.sleep(3000);
		
		
		Runtime.getRuntime().exec("C:\\Users\\mohitkumar.sharma\\Desktop\\upload11.exe");
		
		System.out.println("****************Continue***************");
		
		//Thread.sleep(8000);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//*[text()='Continue']"))));
		driver.findElement(By.xpath(".//*[text()='Continue']")).click();
		Thread.sleep(3000);
		//driver.switchTo().activeElement();
		//System.out.println(driver.findElement(By.xpath(".//*[text()='Cancel']/button[1]")).getText());
		
		System.out.println("****************Upload***************");
		
		driver.findElement(By.xpath(".//*[text()='Upload']")).click();
		//Thread.sleep(9000);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//*[text()='Finish']"))));
		
		System.out.println("****************Finish***************");
		
		driver.findElement(By.xpath(".//*[text()='Finish']")).click();
		
		System.out.println("****************Processing time calculation***************");
		
		long startTime = System.currentTimeMillis();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

		
		
		
	
		
		
		
	}
	
	

}
