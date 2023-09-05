package org.zepth.utilities;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture 
{
	public static void takeScreenShot(ChromeDriver driver, String FilePath) throws IOException
	//public static void takeScreenShot(FirefoxDriver driver, String FilePath) throws IOException
	{
		File file = driver.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File(FilePath));
	}

}
