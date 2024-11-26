package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorSample extends Base {

	public void javaScriptSample()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("window.scrollBy(0,-350)", "");
		WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		js.executeScript("arguments[0].scrollIntoView();", getTotal);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public static void main(String[] args) {
		
JavaScriptExecutorSample javascriptsample =new JavaScriptExecutorSample();
javascriptsample.initializeBrowser();
javascriptsample.javaScriptSample();
javascriptsample.driverQuit();
	}

}
