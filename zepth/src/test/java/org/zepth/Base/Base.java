package org.zepth.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void Browserlaunch() throws IOException
	{
		File file = new File("../zepth/src/test/java/object/properties/locator.properties");
		FileReader reader = new FileReader(file);
		pr = new Properties();
		pr.load(reader);
		//System.out.println(pr.getProperty("SigninButton"));
		
		driver = new ChromeDriver();
		driver.get("https://uat.zepth.io/");
		driver.manage().window().maximize();
		
	}
//	@AfterMethod
//	public void BrowserClose()
//	{
//		driver.close();
//	}

}
