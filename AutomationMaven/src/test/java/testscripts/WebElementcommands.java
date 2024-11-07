package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementcommands extends Base {
public void webElementCommand()
{
	
	WebElement showMessageButton=driver.findElement(By.id("button-one"));
	}
	
	public static void main(String[] args) {
	
	WebElementcommands webelementcommands=new WebElementcommands();
webelementcommands.initializeBrowser();
webelementcommands.webElementCommand();
webelementcommands.driverQuit();
	}

}
