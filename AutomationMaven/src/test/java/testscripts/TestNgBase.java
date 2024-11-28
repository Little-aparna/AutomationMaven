package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNgBase {
         public WebDriver driver;
         @BeforeMethod
	public void initializeBrowser()
	{
		 driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		}
	@AfterMethod
	public void driverQuit()
	{
		driver.quit();
		
		}
	
	
		
		
	}


