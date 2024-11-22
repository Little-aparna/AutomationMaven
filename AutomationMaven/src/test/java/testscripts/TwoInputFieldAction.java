package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TwoInputFieldAction extends Base {
	public void twoInputAction()
	{
		int int_1=12;
		int int_2=10;
		String s1=Integer.toString(int_1);
		String s2=Integer.toString(int_2);

		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement enterValueA=driver.findElement(By.id("value-a"));
		
		Actions action=new Actions(driver);
		action.sendKeys(enterValueA,s1).perform();
		
		
		WebElement enterValueB=driver.findElement(By.id("value-b"));
		Actions action2=new Actions(driver);
		action2.sendKeys(enterValueB,s2).perform();
		WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal.click();
		WebElement messageshown=driver.findElement(By.xpath("//div[@id='message-two']"));
		String answer=messageshown.getText();
	String finalAns=answer.substring(13);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TwoInputFieldAction twoinputfieldaction=new TwoInputFieldAction();
twoinputfieldaction.initializeBrowser();
twoinputfieldaction.twoInputAction();
twoinputfieldaction.driverQuit();
		
		
	}

}
