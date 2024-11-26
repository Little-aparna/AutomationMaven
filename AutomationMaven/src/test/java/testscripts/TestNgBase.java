package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNgBase {
         public WebDriver driver;
	public void initializeBrowser()
	{
		 driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		}
	public void driverQuit()
	{
		driver.quit();
		//driver.close();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestNgBase testngbase=new TestNgBase();
		testngbase.initializeBrowser();
		testngbase.driverQuit();
		
		
	}

}
