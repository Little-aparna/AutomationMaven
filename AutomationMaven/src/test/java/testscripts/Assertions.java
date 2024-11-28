package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends TestNgBase {
@Test
	public void assertSample()
	{
	//hardassert
		int a=5;
		int b=5;
		Assert.assertEquals(a,b,"a and b are not equal");
	//	assertEquals(a,b,"a and b are not equal");
		System.out.println("passed");
		WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isGetTotalIsDisplayed=getTotal.isDisplayed();
		assertTrue(isGetTotalIsDisplayed,"is get total button not available");
		boolean flag=false;
		assertFalse(flag,"expected value is falsebut it istrue" );
		String s=null;
		assertNull(s,"string is not null");
		String s1="ab";
		assertNotNull(s1,"string is  null");
	}
@Test
public void softAssert()
{
	int a=5;
	int b=5;
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(a,b,"a and b are not equal");
//	assertEquals(a,b,"a and b are not equal");
	System.out.println("passed");
	WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	boolean isGetTotalIsDisplayed=getTotal.isDisplayed();
	softassert.assertTrue(isGetTotalIsDisplayed,"is get total button not available");
	boolean flag=true;
	softassert.assertFalse(flag,"expected value is falsebut it istrue" );
	String s=null;
	softassert.assertNull(s,"string is not null");
	String s1="ab";
	softassert.assertNotNull(s1,"string is  null");	
softassert.assertAll();
}

	


@Test
public void twoInputField()
{
	int valueA=20;
	int valueB=10;
	int valueTotal=valueA+valueB;
	String s1=Integer.toString(valueA);
	String s2=Integer.toString(valueB);
	String expectedValue=Integer.toString(valueTotal);
	System.out.println(expectedValue);
    
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	WebElement enterValueA=driver.findElement(By.id("value-a"));
	enterValueA.sendKeys(s1);
	
	
	WebElement enterValueB=driver.findElement(By.id("value-b"));
	
	enterValueB.sendKeys(s2);
	WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	getTotal.click();
	WebElement totalAB=driver.findElement(By.xpath("//div[@id='message-two']"));
	
	String getTotalAB=totalAB.getText();
String getTotalValueAB=getTotalAB.substring(14);
System.out.println(getTotalValueAB);
Assert.assertEquals(expectedValue,getTotalValueAB,"expected total is "+expectedValue+ " butit is"+getTotalAB);



}

	
	
}
