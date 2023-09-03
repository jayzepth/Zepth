package org.zepth.TestScript;
import org.testng.annotations.Test;
import org.zepth.Base.Base;
import org.zepth.Pages.LoginPage;
import org.zepth.Pages.PortFolioPage;
import org.zepth.Pages.ProjectPage;

public class TestCame extends Base
{
	@Test
	public void Cotetest() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay@zepth.com", "jay@1234");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		
		portfolio.SelectCompany("Zepth Technologies");
		
		ProjectPage pp = new ProjectPage(driver, pr);
		pp.NavigateToProject(0);
	}	
}
