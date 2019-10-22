package Com_Actitime_Test;

import org.testng.annotations.Test;

import Com_Actitime_Generic.BaseTest;
import Com_Actitime_Generic.ExcelData;
import Com_Actitime_Pages.actiTIMEEnterTimeTrackPage;
import Com_Actitime_Pages.actiTIME_LoginPage;

public class ValidLoginLogoutTest extends BaseTest 
{
	@Test(priority=1)
	public void ValidLoginLogout()
	{
		String un = ExcelData.getdata(file_path, "TC01", 1, 0);
		String pw = ExcelData.getdata(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getdata(file_path, "TC01", 1, 2);
		String hpTitle = ExcelData.getdata(file_path, "TC01", 1, 3);
		
		actiTIME_LoginPage lp = new actiTIME_LoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		lp.verifyTitle(lgTitle);
		lp.enterUsername(un);
		lp.enterPassword(pw);
		lp.clickOnLogin();
		lp.verifyTitle(hpTitle);
		hp.clickOnLogout();
		lp.verifyTitle(lgTitle);
		
	}

}
