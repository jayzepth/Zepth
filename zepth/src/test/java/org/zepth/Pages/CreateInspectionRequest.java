package org.zepth.Pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateInspectionRequest 
{
	ChromeDriver driver;
	Properties pr;
	public CreateInspectionRequest(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
}
