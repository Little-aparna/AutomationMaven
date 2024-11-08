package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WebElementcommands extends Base {
public void webElementCommand() 
{
	

	WebElement showMessageButton=driver.findElement(By.id("button-one"));
	WebElement singleInputfield=driver.findElement(By.id("single-input-field")) ;
	WebElement yourMessageButton=driver.findElement(By.id("message-one"));
	WebElement twoInputField=driver.findElement(By.id("message-two"));
	WebElement ajaxFormSubmit=driver.findElement(By.id("button-two"));
	
	

	WebElement className=driver.findElement(By.className("clearfix"));
	WebElement className1=driver.findElement(By.className("top-logo"));
	WebElement className2=driver.findElement(By.className("copyright"));
	WebElement className3=driver.findElement(By.className("mb-sec"));
	
	
WebElement nameVariable=driver.findElement(By.name("viewport"));
WebElement nameVariable1=driver.findElement(By.name("author"));
WebElement nameVariable2=driver.findElement(By.name("description"));
WebElement nameVariable3=driver.findElement(By.name("keywords"));

WebElement tagNameSample=driver.findElement(By.tagName("header"));
WebElement tagNameSample1=driver.findElement(By.tagName("section"));

WebElement linkTextSample=driver.findElement(By.linkText("Checkbox Demo"));

WebElement enterMessage=driver.findElement(By.linkText("Simple Form Demo"));
WebElement linkTextSample1=driver.findElement(By.linkText("Select Input"));
WebElement linkTextSample2=driver.findElement(By.linkText("Ajax Form Submit"));


WebElement partialTextSample=driver.findElement(By.partialLinkText("Checkbox"));
WebElement partialTextSample1=driver.findElement(By.partialLinkText("Radio Buttons"));
WebElement partialTextSample2=driver.findElement(By.partialLinkText("Simple Form "));




}

	
	public static void main(String[] args) {
	
	WebElementcommands webelementcommands=new WebElementcommands();
webelementcommands.initializeBrowser();
webelementcommands.webElementCommand();
webelementcommands.driverQuit();
	}

}
