package Com_Actitime_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com_Actitime_Generic.BaseTest;
import Com_Actitime_Generic.ExcelData;
import Com_Actitime_Pages.actiTIME_LoginPage;

public class InvalidLoginTest extends BaseTest 
{
	@Test(priority=2)
	public void InvalidLogin() throws InterruptedException
	{
		String title = ExcelData.getdata(file_path, "TC01", 1, 2);
		String eerrormsg = ExcelData.getdata(file_path, "TC02", 1, 2);
		actiTIME_LoginPage lp = new actiTIME_LoginPage(driver);
		lp.verifyTitle(title);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		for(int i=1; i<=rc; i++)
		{
			String un = ExcelData.getdata(file_path, "TC02", i, 0);
			String pw = ExcelData.getdata(file_path, "TC02", i, 1);
			Reporter.log("user name "+un,true);
			lp.enterUsername(un);
			Reporter.log("Password "+pw,true);
			lp.enterPassword(pw);
			lp.clickOnLogin();
			String aerrormsg = lp.verifyErrorMSG();
			Assert.assertEquals(aerrormsg, eerrormsg);
			Reporter.log("=============================================",true);
			Thread.sleep(2000);
		}
	}
}
