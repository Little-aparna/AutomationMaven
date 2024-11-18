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
public void table()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> tableOptions=driver.findElements(By.xpath("//table[@id='dtBasicExample']//following::th[@class='th-sm sorting_disabled']"));
for(WebElement option:tableOptions)
{
	String headerText =option.getText();
	System.out.println(headerText);
	if(headerText.equals("Salary"))
			{
		break;
			}
}
	//tableOptions.
	List<WebElement> nameOptions=driver.findElements(By.xpath("//tr[@class='odd']//following-sibling::tr"));
	for(WebElement option:nameOptions)
{
	String text=option.getText();
	String newText=text.substring(0, 10);
	System.out.println(newText);
	if(newText.equals("Ashton Cox"))
			{
		System.out.println("is there");
		break;
			}
}
	
	
	
}
public void seleniumDiv()
{
	driver.navigate().to("https://www.selenium.dev/");
	WebElement englishDropDown=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//parent::div"));
	//Select english=new Select(englishDropDown);
	englishDropDown.click();
	//english.click();
//	WebElement english=driver.findElement(null)
	List<WebElement> languageOptions=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//a"));
	for(WebElement option:languageOptions)
	{
		String text = option.getText();
		if (text.equals("Português (Brasileiro)"))
		{
			option.click();
			break;
		}
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DropDown dropdowm=new DropDown();
dropdowm.initializeBrowser();
dropdowm.dropDownSample();
dropdowm.table();
dropdowm.seleniumDiv();
dropdowm.driverQuit();
	}

}
