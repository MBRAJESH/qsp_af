package Com_Actitime_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com_Actitime_Generic.BaseTest;
import Com_Actitime_Generic.ExcelData;
import Com_Actitime_Pages.actiTIME_LoginPage;

public class VerifyversionTest  extends BaseTest
{
	@Test(priority=3)
	public void Verifyversion()
	{
		String title = ExcelData.getdata(file_path, "TC01", 1, 2);
		String eversion = ExcelData.getdata(file_path, "TC03", 1, 0);
		
		actiTIME_LoginPage lp = new actiTIME_LoginPage(driver);
		lp.verifyTitle(title);
		String aversion = lp.verifyVersion();
		Assert.assertEquals(aversion, eversion);
		Reporter.log("version is matching "+aversion,true);
	}

}
