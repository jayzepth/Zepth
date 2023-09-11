package org.zepth.TestScript;

import org.testng.annotations.Test;
import org.zepth.Assertions.Assert;
import org.zepth.Base.Base;
import org.zepth.Pages.CommandCenterPage;
import org.zepth.Pages.LoginPage;
import org.zepth.Pages.PortFolioPage;
import org.zepth.utilities.ReportHandling;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CommenandCenterLinkVerification extends Base
{
	
	@Test
	public void TC_1_PCCLinkVerification() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TC_1_PCCLinkVerification");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToProjectCosrControl();
		
		Assert.Assert1(pr.getProperty("baseurl")+"/projects/project-summary/"+pr.getProperty("projectid"), driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}
	@Test
	public void TC_2_ScheduleLinkVerification() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TC_2_ScheduleLinkVerification");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToSchedule();
		
		Assert.Assert1(pr.getProperty("baseurl")+"/progress-report/dashboard/"+pr.getProperty("projectid"), driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}
	@Test
	public void TC_3_InspectionLinkVerification() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TC_3_InspectionLinkVerification");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToInspections();
		
		Assert.Assert1(pr.getProperty("baseurl")+"/inspectionsdashboard/"+pr.getProperty("projectid"), driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}
	@Test
	public void TC_4_SnaglistLinkVerification() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TC_4_SnaglistLinkVerification");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToSnags();;
		
		Assert.Assert1(pr.getProperty("baseurl")+"/snaglists/home/"+pr.getProperty("projectid"), driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}
	@Test
	public void TC_5_SafetyLinkVerification() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TC_5_SafetyLinkVerification");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToSafety();
		
		Assert.Assert1(pr.getProperty("baseurl")+"/safety/dashboard/"+pr.getProperty("projectid"), driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}
	@Test
	public void TC_6_RiskManagementVerification() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TC_6_RiskManagementVerification");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToRiskManagement();
		
		Assert.Assert1(pr.getProperty("baseurl")+"/risk/dashboard/"+pr.getProperty("projectid"), driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}
	@Test
	public void TC_7_SubmittalLinkVerification() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TC_7_SubmittalLinkVerification");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToSubmittals();
		
		Assert.Assert1(pr.getProperty("baseurl")+"/submittal/index/"+pr.getProperty("projectid"), driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}
	@Test
	public void TC_8_RFILinkVerification() throws InterruptedException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\Users\\Admin\\Desktop\\Report\\report.html");
		ExtentTest test = report.startTest("TC_8_RFILinkVerification");
		
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		CommandCenterPage commandCenter = new CommandCenterPage(driver, pr);
		commandCenter.NavigateToRFI();
		
		Assert.Assert1(pr.getProperty("baseurl")+"/request-for-information/index/"+pr.getProperty("projectid"), driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();
	}
	
	
}
