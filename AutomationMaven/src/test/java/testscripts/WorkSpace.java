package testscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkSpace extends Base {
public void multiplePop()
{
	driver.navigate().to("https://selenium.qabible.in/window-popup.php");
	
	
	WebElement multiPop=driver.findElement(By.xpath("//a[@id='windowMulti']"));
	multiPop.click();
	String mainwindow=driver.getWindowHandle();
Set<String>	l1=driver.getWindowHandles();
Iterator<String>iterator=l1.iterator();
while(iterator.hasNext())
{
	String childWindow=iterator.next();
	if(!mainwindow.equalsIgnoreCase(childWindow))
	{
		driver.switchTo().window(childWindow);
		driver.close();
	}
	driver.switchTo().window(mainwindow)	;
	
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WorkSpace workspace=new WorkSpace();
workspace.initializeBrowser();
workspace.multiplePop();
workspace.driverQuit();
	}

}
