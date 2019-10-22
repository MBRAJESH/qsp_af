package Com_Actitime_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_Actitime_Generic.BasePage;

public class actiTIME_LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgBT;
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement errormsg;
	@FindBy(xpath="//nobr[.='actiTIME 2019.2 Pro']")
	private WebElement version;

	public actiTIME_LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		lgBT.click();
	}
	public String verifyErrorMSG()
	{
		verifyElement(errormsg);
		String aerrormsg = errormsg.getText();
		return aerrormsg;
	}
	public String verifyVersion()
	{
		verifyElement(version);
		String aversion= version.getText();
		return aversion;
	}
	
	
	
	
	
}
