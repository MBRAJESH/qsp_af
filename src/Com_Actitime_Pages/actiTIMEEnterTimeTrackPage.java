package Com_Actitime_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_Actitime_Generic.BasePage;

public class actiTIMEEnterTimeTrackPage extends BasePage 
{
	@FindBy(id="logoutLink")
	private WebElement logoutBT;

	public actiTIMEEnterTimeTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnLogout()
	{
		logoutBT.click();
		
		
	}
}
