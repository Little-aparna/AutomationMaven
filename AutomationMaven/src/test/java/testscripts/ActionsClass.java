package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base{
public void dragItem()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement draggable=driver.findElement(By.xpath("(//span[@draggable='true'])[1]"));
	
	WebElement dragDrop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	Actions actions=new Actions(driver);
//actions.moveToElement(dragDrop).build().perform();//for mouse hover
	//actions.doubleClick(dragDrop).perform();//for double click
	//actions.contextClick(dragDrop).build().perform();//for right click
	actions.dragAndDrop(draggable, dragDrop).build().perform();//for drag and drop
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	//actions.sendKeys(singleInputTextField,"hello").perform();
	actions.keyDown(singleInputTextField,Keys.SHIFT).sendKeys("hello").build().perform();//type text to capital letters
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ActionsClass actionclass=new ActionsClass();
actionclass.initializeBrowser();
actionclass.dragItem();
//actionclass.twoInputField();
actionclass.driverQuit();
		
		
	}

}
