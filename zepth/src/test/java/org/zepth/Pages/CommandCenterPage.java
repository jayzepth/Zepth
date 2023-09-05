package org.zepth.Pages;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandCenterPage 
{
		ChromeDriver driver;
		Properties pr;
		public CommandCenterPage(ChromeDriver driver, Properties pr)
		{
			this.driver = driver;
			this.pr = pr;
		}
		public void NavigateToProjectCosrControl()
		{
			WebElement pccLink = driver.findElement(By.xpath(pr.getProperty("ProjectCostControl")));
			pccLink.click();
		}
		public void NavigateToSchedule()
		{
			WebElement Schedule = driver.findElement(By.xpath(pr.getProperty("Schedule")));
			Schedule.click();
		}
		public void NavigateToInspections()
		{
			WebElement inspectionLink = driver.findElement(By.xpath(pr.getProperty("Inspection")));
			inspectionLink.click();
		}
		public void NavigateToSnags()
		{
			WebElement SnagsLink = driver.findElement(By.xpath(pr.getProperty("Snags")));
			SnagsLink.click();
		}
		public void NavigateToSafety()
		{
			WebElement SafetyLink = driver.findElement(By.xpath(pr.getProperty("Safety")));
			SafetyLink.click();
		}
		public void NavigateToRiskManagement()
		{
			WebElement RiskManagementLink = driver.findElement(By.xpath(pr.getProperty("RiskManagement")));
			RiskManagementLink.click();
		}
		public void NavigateToSubmittals()
		{
			WebElement SubmittalsLink = driver.findElement(By.xpath(pr.getProperty("Submittals")));
			SubmittalsLink.click();
		}
		public void NavigateToRFI()
		{
			WebElement RFILink = driver.findElement(By.xpath(pr.getProperty("RFI")));
			RFILink.click();
		}
		
		

}
