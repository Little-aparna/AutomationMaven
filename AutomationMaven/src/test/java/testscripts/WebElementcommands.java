package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.SinglePass;


public class WebElementcommands extends Base {
	String textValue;
	String expectedText;
	 String outvalue;
	
	
public void commands() 
{
	

	WebElement showMessageButton=driver.findElement(By.id("button-one"));
	WebElement singleInputfield=driver.findElement(By.id("single-input-field")) ;
	WebElement yourMessageButton=driver.findElement(By.id("message-one"));
	WebElement twoInputField=driver.findElement(By.id("message-two"));
	WebElement ajaxFormSubmit=driver.findElement(By.id("button-two"));
	
	

	WebElement className=driver.findElement(By.className("clearfix"));
	WebElement listBox=driver.findElement(By.className("nav-link"));
	WebElement className1=driver.findElement(By.className("top-logo"));
	WebElement className2=driver.findElement(By.className("copyright"));
	WebElement className3=driver.findElement(By.className("mb-sec"));
	
	
WebElement nameVariable=driver.findElement(By.name("viewport"));
WebElement nameVariable1=driver.findElement(By.name("author"));
WebElement nameVariable2=driver.findElement(By.name("description"));
WebElement nameVariable3=driver.findElement(By.name("keywords"));

WebElement tagNameSample=driver.findElement(By.tagName("header"));
WebElement tagNameSample1=driver.findElement(By.tagName("section"));

WebElement linkTextSample=driver.findElement(By.linkText("Checkbox Demo"));

WebElement enterMessage=driver.findElement(By.linkText("Simple Form Demo"));
WebElement linkTextSample1=driver.findElement(By.linkText("Select Input"));
WebElement linkTextSample2=driver.findElement(By.linkText("Ajax Form Submit"));
WebElement simpleFormDemo=driver.findElement(By.linkText("Simple Form Demo"));


WebElement partialTextSample=driver.findElement(By.partialLinkText("Checkbox"));
WebElement partialTextSample1=driver.findElement(By.partialLinkText("Radio Buttons"));
WebElement partialTextSample2=driver.findElement(By.partialLinkText("Simple Form "));
WebElement simpleFormPartial=driver.findElement(By.partialLinkText("Simple Form "));


//button[@id='button-one']
WebElement xPathSample=driver.findElement(By.xpath("//button[@id='button-one']"));
WebElement xPathExample=driver.findElement(By.xpath("//button[@id='button-two']"));
WebElement xpathSample1=driver.findElement(By.xpath("//a[@id='progress-bars']"));
WebElement xpathSample2=driver.findElement(By.xpath("//a[@id=\'alert-modal\']"));
WebElement xPathSample3=driver.findElement(By.xpath("//a[@href=\'radio-button-demo.php\']"));

WebElement xPathContains=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
WebElement xPathContains1=driver.findElement(By.xpath("//a[contains(@href,'check-box-demo.php')]"));
WebElement xPathContains2=driver.findElement(By.xpath("//a[contains(@href,'select-input.php')]"));
WebElement xPathContains3=driver.findElement(By.xpath("//a[contains(@id,'alert-modal')]"));

WebElement xpathStarts=driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));
WebElement xPathStart1=driver.findElement(By.xpath("//a[starts-with(@href,'ajax-form-submit.php')]"));
WebElement xPathStart2=driver.findElement(By.xpath("//a[starts-with(@href,'radio-button-demo.php')]"));
WebElement xpathStart3=driver.findElement(By.xpath("//a[starts-with(@href,'check-box-demo.php')]"));
//WebElement xpathFull=driver.findElement(By.xpath("))
WebElement containsText=driver.findElement(By.xpath("//button[text()='Show Message']"));
WebElement containText1=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
WebElement containText2=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
WebElement containtext3=driver.findElement(By.xpath("//a[text()='Form Submit']"));
WebElement containText4=driver.findElement(By.xpath("//a[text()='Select Input']"));
//WebElement 
WebElement absolutePath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
WebElement absolutePath1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[1]"));
WebElement absolutepathCheck=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[2]/a"));

//and Xpath using
WebElement andXpath=driver.findElement(By.xpath("//button[@id='button-one'and@type='button']"));
WebElement andXpath1=driver.findElement(By.xpath("//button[@id='button-two' and @type=\"button\"]"));
WebElement andXPath2=driver.findElement(By.xpath("//div[@id='message-one' and @ class=\"my-2\"]"));

//Or Xpath
WebElement orXpath=driver.findElement(By.xpath("//button[@id='button-one' or @id='button-o']"));
WebElement orXpath1=driver.findElement(By.xpath("//button[@id='button-two'or @id=\"value-b\"]"));
WebElement orXpath2=driver.findElement(By.xpath("//input[@id='value-a' or @class='card-body'] "));


//WebElement orXPath2=driver.findElement(By.xpath("))
//identifyparent
WebElement parentXpath=driver.findElement(By.xpath("//button[@id='button-one']/.."));
WebElement parentXpath1=driver.findElement(By.xpath("//button[@id='button-two']/.."));
WebElement parentXpath2=driver.findElement(By.xpath("//div[@id='message-one']/.."));
//parent located from child
WebElement parentChildxpath=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
WebElement parentChildXpath1=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
WebElement parentChildXpath2=driver.findElement(By.xpath("//div[@id='message-one']//parent::form"));


//child located fromParent
WebElement childParentXpath=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
WebElement childParentXpath1=driver.findElement(By.xpath("//section[@class='clearfix']//child::ul"));
WebElement childParentXpath2=driver.findElement(By.xpath("//div[@class='container page']//child::ul"));

//following Xpath
WebElement followingXpath=driver.findElement(By.xpath("//button[@id='button-one']//following::button[@class='btn btn-primary']"));
WebElement followingXpath1=driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));
WebElement followingXpath2=driver.findElement(By.xpath("//div[@class='card-header']//following::div[@id='message-two']"));

//precedingXpath
WebElement precedingXpath=driver.findElement(By.xpath("//button[@id='button-two']//preceding::button[@class='btn btn-primary']"));
WebElement precedingXpath1=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
WebElement precedingXpath2=driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@class=\"btn btn-primary\"]"));



//ancestorXpath
WebElement precedingDivXpath=driver.findElement(By.xpath("//div[@id='message-one']//preceding::div"));
WebElement ancestorDivXpath=driver.findElement(By.xpath("//div[@id='message-one']//ancestor::div"));
WebElement siblingDivXpath=driver.findElement(By.xpath("//button[@data-target='#collapsibleNavbar']//following-sibling::div"));
WebElement siblingDivXpath1=driver.findElement(By.xpath("//button[@id='button-two']//following-sibling::div"));
//css selector id
WebElement cssPath=driver.findElement(By.cssSelector("button#button-one"));//locate id using css selector
WebElement cssId1=driver.findElement(By.cssSelector("input#single-input-field"));
WebElement cssId2=driver.findElement(By.cssSelector("input#value-a"));

//css selector class
WebElement cssClass=driver.findElement(By.cssSelector("section.clearfix"));//locate class using css selector
WebElement cssClass1=driver.findElement(By.cssSelector("a.navbar-brand"));
WebElement cssClass2=driver.findElement(By.cssSelector("ul.navbar-nav"));


}

public void webTest()
{	driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
	WebElement cartTextSample=driver.findElement(By.id("page_wrapper"));
	WebElement classTextSample=driver.findElement(By.className("bm-menu-wrap"));
	WebElement tagTextSample=driver.findElement(By.tagName("footer"));
	WebElement sauceLampText=driver.findElement(By.linkText("Sauce Labs Bike Light"));
	WebElement partialSaucetext=driver.findElement(By.partialLinkText("Sauce Labs Bike "));
	//WebElement partial Sauce=driver.findElement(By.p)
	
}
public void webElementCommand() 
{
	//this.textValue=textValue;
	//this.outvalue=outvalue;
	String textValue="ABC";
	this.textValue=textValue;
	System.out.println(textValue);
	
	WebElement singleInputText=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	singleInputText.sendKeys(textValue);
	String expectedText=singleInputText.getText();
	
//singleInputText.sendKeys("ABC");
//String expectedText=singleInputText.getText();

WebElement showMessageButton=driver.findElement(By.id("button-one"));
showMessageButton.click();
WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
String yourMessageText=yourMessage.getText();
System.out.println(yourMessageText);
String outvalue=yourMessageText.substring(15,18);
this.outvalue=outvalue;

System.out.println(outvalue);

singleInputText.clear();
String backGroundColor=showMessageButton.getCssValue("background-color");
String fontWeight=showMessageButton.getCssValue("font-weight");
boolean isShowMessageButtonDisplayed=showMessageButton.isDisplayed();
boolean showMessageButtonenabled=showMessageButton.isEnabled();
//String expButtonColor=(Color.fromString(hex).asRgba());
}
public void singleInputField()
{
	//this.outvalue=outvalue;
	System.out.println(outvalue);
	boolean ans=textValue.equals(outvalue);
	if(textValue.equals(outvalue))
	{
		System.out.println("matching");
	}	
	else
	{
		System.out.println("not matching");
	}
}

	
	public static void main(String[] args) {
	
	WebElementcommands webelementcommands=new WebElementcommands();
webelementcommands.initializeBrowser();
webelementcommands.webElementCommand();
webelementcommands.commands();
webelementcommands.singleInputField();
//webelementcommands.webTest();
webelementcommands.driverQuit();

	}

}
