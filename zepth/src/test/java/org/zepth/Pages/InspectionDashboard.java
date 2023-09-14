package org.zepth.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectionDashboard 
{
	ChromeDriver driver;
	Properties pr;
	public InspectionDashboard(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void NavigateToInspectioIndexPage() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement inspectionlink = driver.findElement(By.xpath(pr.getProperty("inspectionIndexLink")));
		inspectionlink.click();
	}
	public void InspectionView(String RefrenceNumber)
	{
		WebElement viewinspection = driver.findElement(By.xpath("//a[@title='"+RefrenceNumber+"']"));
		viewinspection.click();
	}
	
}
