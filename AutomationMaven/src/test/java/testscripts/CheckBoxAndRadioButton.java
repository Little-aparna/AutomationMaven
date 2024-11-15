package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxAndRadioButton extends Base {
public void checkBox()
{
	WebElement checkBoxElement=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
	checkBoxElement.click();
	//WebElement clickOnThisCheckBox=driver.findElement(By.xpath("//label[@class='form-check-label']//preceding::input[@id='gridCheck']"));
	
	WebElement clickONThisCheckBox=driver.findElement(By.id("gridCheck"));
	clickONThisCheckBox.click();
	boolean checkBoxSelected=clickONThisCheckBox.isSelected();
	WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
	checkBoxOne.click();
	WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
	checkBoxTwo.click();
	WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
	checkBoxThree.click();
	WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
	checkBoxFour.click();
	
	
	
}
public void radioButton()
{
	WebElement radioButton=driver.findElement(By.partialLinkText("Radio Buttons"));
     radioButton.click();
	//WebElement radioButtonElement=driver.findElement(By.tagName("Radio Button Demo"));
	WebElement maleButton=driver.findElement(By.id("inlineRadio1"));
	maleButton.click();
	//WebElement femaleButton=driver.findElement(By.id("inlineRadio2"));
	//femaleButton.click();
	
	WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
	showSelectedValue.click();
}

	public static void main(String[] args) {
		
CheckBoxAndRadioButton checkboxandradiobutton=new CheckBoxAndRadioButton();
checkboxandradiobutton.initializeBrowser();
checkboxandradiobutton.checkBox();
checkboxandradiobutton.radioButton();
checkboxandradiobutton.driverQuit();
	}

}
