package Com_Actitime_Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{
	/***
	 * 
	 * @param driver
	 * @param name
	 * @author APM-SYSTEM
	 */
	public static  void getScreenShot(WebDriver driver,String name)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShot/"+name+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
		}
	}
	
	public static void selectByIndexs(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public static void selectByvalues(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectByVisibleText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

}
