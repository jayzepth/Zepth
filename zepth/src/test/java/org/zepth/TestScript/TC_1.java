package org.zepth.TestScript;
import org.testng.annotations.*;
import org.zepth.Base.Base;
import org.zepth.Pages.LoginPage;
import org.zepth.Pages.PortFolioPage;

public class TC_1 extends Base
{
	@Test
	public void LoginAndLogout() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver, pr);
		login.Login("jay+singh@zepth.com", "user@123");
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		portfolio.LogOut();
	}
}
