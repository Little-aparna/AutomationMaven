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
}
public void radioButton()
{
	WebElement radioButton=driver.findElement(By.partialLinkText("Radio Buttons"));
     radioButton.click();
	//WebElement radioButtonElement=driver.findElement(By.tagName("Radio Button Demo"));
	WebElement radioButtonSelection=driver.findElement(By.id("inlineRadio1"));
	radioButtonSelection.click();
	WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
	showSelectedValue.click();
}

	public static void main(String[] args) {
		
CheckBoxAndRadioButton checkboxandradiobutton=new CheckBoxAndRadioButton();
checkboxandradiobutton.initializeBrowser();
checkboxandradiobutton.checkBox();
//checkboxandradiobutton.radioButton();
checkboxandradiobutton.driverQuit();
	}

}
