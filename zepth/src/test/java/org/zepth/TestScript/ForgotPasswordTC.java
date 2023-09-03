package org.zepth.TestScript;
import org.testng.annotations.Test;
import org.zepth.Base.Base;
import org.zepth.Pages.ForGotPassword;

public class ForgotPasswordTC extends Base
{
	@Test
	public void Forgot()
	{
		ForGotPassword fgp = new ForGotPassword(driver, pr);
		fgp.navigateToForgotPassword();
		fgp.ReturnToLoginPage();
	}
	
	

}
