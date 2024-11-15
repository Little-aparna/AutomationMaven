package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base{
public void dropDownSample()
{

	driver.navigate().to("https://selenium.qabible.in/select-input.php");
WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
Select select=new Select(dropDown);
select.selectByIndex(1);
select.selectByValue("Yellow");
select.selectByVisibleText("Green");
WebElement multipleDrop=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
Select selectMultiple=new Select(multipleDrop);
boolean isMultipleSelect=selectMultiple.isMultiple();
selectMultiple.selectByIndex(0);
selectMultiple.selectByIndex(2);
selectMultiple.selectByIndex(1);
List<WebElement> list=selectMultiple.getOptions();
}
public void seleniumDiv()
{
	driver.navigate().to("https://www.selenium.dev/");
	WebElement englishDropDown=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//parent::div"));
	//Select english=new Select(englishDropDown);
	englishDropDown.click();
	//english.click();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DropDown dropdowm=new DropDown();
dropdowm.initializeBrowser();
dropdowm.dropDownSample();
dropdowm.seleniumDiv();
dropdowm.driverQuit();
	}

}
