package testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadsendKeys()
	{
	driver.navigate().to("https://demo.guru99.com/test/upload/");	
	WebElement file=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	file.sendKeys("C:\\Users\\droju\\Downloads\\EXAMPLES.pdf");
	
	}
	public void fileUploadingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upLoad=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		upLoad.click();
		StringSelection s = new StringSelection("C:\\Users\\droju\\Downloads\\EXAMPLES.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); 
		
		

		Robot robot = new Robot();
        robot.delay(500);
		 

	      //releasing enter

	    

	      robot.keyPress(KeyEvent.VK_CONTROL);

	      robot.keyPress(KeyEvent.VK_V);//two
	      
	      robot.delay(500);
	      
	      robot.keyRelease(KeyEvent.VK_CONTROL);//release command

	      
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.delay(300);

	      robot.keyPress(KeyEvent.VK_ENTER);

	      

	    
	      robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.delay(90);


	}

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
FileUpload fileupload=new FileUpload();
fileupload.initializeBrowser();
//fileupload.fileUploadsendKeys();
try {
	fileupload.fileUploadingRobotClass();
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

fileupload.driverQuit();
	}

}
