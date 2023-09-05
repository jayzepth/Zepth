package org.zepth.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.zepth.Assertions.Assert;
import org.zepth.Base.Base;
import org.zepth.Pages.LoginPage;

public class TC_2 extends Base
{
	@Test
	public void LoginWithInvalidCredential() throws InterruptedException
	{
		
			LoginPage login = new LoginPage(driver, pr);
			login.Login("jay@zepth.com", "jay@12345");
			Thread.sleep(1000);
			//Assert.Assert1(driver.findElement(By.xpath("//span[@class='red space_filed']")).getText(), "The email or password is not correct. Did you forget your password? click here");
	}
}
