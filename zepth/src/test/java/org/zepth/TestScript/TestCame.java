package org.zepth.TestScript;
import org.testng.annotations.Test;
import org.zepth.Assertions.Assert;
import org.zepth.Base.Base;
import org.zepth.Pages.LoginPage;
import org.zepth.Pages.PortFolioPage;
import org.zepth.utilities.ReportHandling;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.zepth.Pages.CommandCenterPage;

public class TestCame extends Base
{
	@Test
	public void Cotetest() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TestCame");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToProjectCosrControl();
		Assert.Assert1("https://uat.zepth.io/projects/project-summary/9", driver.getCurrentUrl(), test);
		
		driver.navigate().back();
		
		commandCenter.NavigateToSchedule();
		Assert.Assert1("https://uat.zepth.io/progress-report/dashboard/9", driver.getCurrentUrl(), test);
		
		driver.navigate().back();
		
		commandCenter.NavigateToInspections();
		Assert.Assert1("https://uat.zepth.io/inspectionsdashboard/9", driver.getCurrentUrl(), test);
		
		driver.navigate().back();
		
		commandCenter.NavigateToSnags();
		Assert.Assert1("https://uat.zepth.io/snaglists/home/9", driver.getCurrentUrl(), test);
		
		driver.navigate().back();
		
		commandCenter.NavigateToSafety();
		Assert.Assert1("https://uat.zepth.io/safety/dashboard/9", driver.getCurrentUrl(), test);
		
		driver.navigate().back();
		
		commandCenter.NavigateToRiskManagement();
		Assert.Assert1("https://uat.zepth.io/risk/dashboard/9", driver.getCurrentUrl(), test);
		
		driver.navigate().back();
		
		commandCenter.NavigateToSubmittals();
		Assert.Assert1("https://uat.zepth.io/submittal/index/9", driver.getCurrentUrl(), test);
		
		driver.navigate().back();
		
		commandCenter.NavigateToRFI();
		Assert.Assert1("https://uat.zepth.io/request-for-information/index/9", driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}	
}
