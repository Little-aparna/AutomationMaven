package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertSample extends Base {

	public void alertSample()
	{

		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");	
	WebElement alert1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	alert1.click();
	driver.switchTo().alert().accept();
	WebElement alert2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	alert2.click();
	String text=driver.switchTo().alert().getText();
	driver.switchTo().alert().dismiss();
	WebElement promptBox=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
	promptBox.click();
	driver.switchTo().alert().sendKeys("Aparna");
	driver.switchTo().alert().accept();
	}
	public void windowPopUp()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement newWindow=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
	newWindow.click();
	
	WebElement emailButton=driver.findElement(By.xpath("//input[@id=':rq:']"));
	
	WebElement passwordButton=driver.findElement(By.xpath("//input[@id=':rt:']"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AlertSample alert=new AlertSample();
alert.initializeBrowser();
alert.alertSample();
alert.windowPopUp();
alert.driverQuit();
//driver.switch.
	}

}
