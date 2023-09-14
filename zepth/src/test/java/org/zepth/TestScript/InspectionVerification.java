package org.zepth.TestScript;

import org.testng.annotations.Test;
import org.zepth.Base.Base;
import org.zepth.Pages.CommandCenterPage;
import org.zepth.Pages.InspectionDashboard;
import org.zepth.Pages.LoginPage;
import org.zepth.Pages.PortFolioPage;
import org.zepth.Pages.SideBar;

public class InspectionVerification extends Base
{
	@Test
	public void NavigationToInspectionDashboard() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver, pr);
		login.Login("general_contractor@zepth.com", "user@123");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		portfolio.NavigateToProject("Ocean House");
		
		SideBar menu = new SideBar(driver, pr);
		menu.OpensideMenu();
		menu.ClickJobsiteMenu();
		menu.NavigateToInspection();
		
//		InspectionDashboard dashboard = new InspectionDashboard(driver, pr);
//		dashboard.NavigateToInspectioIndexPage();
		

	}
}
