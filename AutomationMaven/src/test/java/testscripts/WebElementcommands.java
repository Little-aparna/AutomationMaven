package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WebElementcommands extends Base {
public void webElementCommand() 
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

//Or Xpath
WebElement orXpath=driver.findElement(By.xpath("//button[@id='button-one' or @id='button-o']"));
WebElement orXpath1=driver.findElement(By.xpath("//button[@id='button-two'or @id=\"value-b\"]"));
//identifyparent
WebElement parentXpath=driver.findElement(By.xpath("//button[@id='button-one']/.."));
WebElement parentXpath1=driver.findElement(By.xpath("//button[@id='button-two']/.."));
//parent located from child
WebElement parentChildxpath=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
WebElement parentChildXpath1=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
//child located fromParent
WebElement childParentXpath=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
WebElement childParentXpath1=driver.findElement(By.xpath("//section[@class='clearfix']//child::ul"));
//following Xpath
WebElement followingXpath=driver.findElement(By.xpath("//button[@id='button-one']//following::button[@class='btn btn-primary']"));
WebElement followingXpath1=driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));
//precedingXpath
WebElement precedingXpath=driver.findElement(By.xpath("//button[@id='button-two']//preceding::button[@class='btn btn-primary']"));

//ancestorXpath
WebElement precedingDivXpath=driver.findElement(By.xpath("//div[@id='message-one']//preceding::div"));
WebElement ancestorDivXpath=driver.findElement(By.xpath("//div[@id='message-one']//ancestor::div"));
WebElement siblingDivXpath=driver.findElement(By.xpath("//button[@data-target='#collapsibleNavbar']//following-sibling::div"));

//css selector
WebElement cssPath=driver.findElement(By.cssSelector("button#button-one"));//locate id using css selector
WebElement cssClass=driver.findElement(By.cssSelector("section.clearfix"));//locate class using css selector


}
public void webTest()
{	driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
	WebElement cartTextSample=driver.findElement(By.id("page_wrapper"));
	WebElement classTextSample=driver.findElement(By.className("bm-menu-wrap"));
	WebElement tagTextSample=driver.findElement(By.tagName("footer"));
	WebElement sauceLampText=driver.findElement(By.linkText("Sauce Labs Bike Light"));
	WebElement partialSaucetext=driver.findElement(By.partialLinkText("Sauce Labs Bike "));
	
}

	
	public static void main(String[] args) {
	
	WebElementcommands webelementcommands=new WebElementcommands();
webelementcommands.initializeBrowser();
webelementcommands.webElementCommand();
//webelementcommands.webTest();
webelementcommands.driverQuit();

	}

}
