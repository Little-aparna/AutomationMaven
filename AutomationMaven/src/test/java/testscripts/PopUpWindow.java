package testscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopUpWindow extends Base {
	public void windowPopUp()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement newWindow=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
	newWindow.click();
	String mainWindow=driver.getWindowHandle();
	Set <String> l1=driver.getWindowHandles();
	Iterator<String> iterator=l1.iterator();
	while(iterator.hasNext())
	{
		
		String childWindow=iterator.next();
		if(!mainWindow.equalsIgnoreCase(childWindow))
		{
			driver.switchTo().window(childWindow);
			WebElement emailButton=driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		driver.close();
		}
		driver.switchTo().window(mainWindow);
	}
	
	
	
	//WebElement passwordButton=driver.findElement(By.xpath("//input[@id=':rt:']"));
	
	//WebElement loginButton=driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1j85h84'])[4]"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PopUpWindow popupwindow=new PopUpWindow();
popupwindow.initializeBrowser();
popupwindow.windowPopUp();
popupwindow.driverQuit();
	}

}
