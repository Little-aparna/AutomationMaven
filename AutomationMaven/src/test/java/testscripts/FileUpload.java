package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadsendKeys()
	{
	driver.navigate().to("https://demo.guru99.com/test/upload/");	
	WebElement file=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	file.sendKeys("C:\\Users\\droju\\Downloads\\EXAMPLES.pdf");
	
	}
	public void fileUploadingRobotClass()
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upLoad=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		upLoad.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileUpload fileupload=new FileUpload();
fileupload.initializeBrowser();
fileupload.fileUploadsendKeys();
fileupload.fileUploadingRobotClass();

fileupload.driverQuit();
	}

}
