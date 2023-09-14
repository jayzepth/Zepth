package org.zepth.TestScript;
import java.io.IOException;

import org.apache.poi.hslf.usermodel.ObjectData;
import org.testng.annotations.*;
import org.zepth.Base.Base;
import org.zepth.Pages.LoginPage;
import org.zepth.Pages.PortFolioPage;
import org.zepth.utilities.ExcelFileHandling;

public class TC_1 extends Base
{
	@Test()
	public void LoginAndLogout() throws InterruptedException, IOException
	{
		LoginPage login = new LoginPage(driver, pr);
		login.Login(ExcelFileHandling.ReadCell(4, 2), ExcelFileHandling.ReadCell(4, 3));
		
		PortFolioPage portfolio = new PortFolioPage(driver, pr);
		portfolio.ModelClose();
		portfolio.LogOut();
	}
}
