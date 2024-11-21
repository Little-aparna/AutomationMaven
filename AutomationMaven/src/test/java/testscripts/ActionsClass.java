package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActionsClass extends Base{
public void dragItem()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement draggable=driver.findElement(By.xpath("(//span[@draggable='true'])[1]"));
	WebElement dragDrop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ActionsClass actionclass=new ActionsClass();
actionclass.initializeBrowser();
actionclass.dragItem();
actionclass.driverQuit();
		
		
	}

}
