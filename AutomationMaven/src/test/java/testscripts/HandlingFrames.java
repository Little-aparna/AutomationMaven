package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public void Handling()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");

		int size=driver.findElements(By.tagName("iframe")).size();
		WebElement iFrame=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iFrame);
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("a077aa5e");
		WebElement image=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		image.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingFrames handlingframes=new HandlingFrames();
handlingframes.initializeBrowser();
handlingframes.Handling();
handlingframes.driverQuit();
	}

}
