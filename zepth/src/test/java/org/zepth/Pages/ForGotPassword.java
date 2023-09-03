package org.zepth.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForGotPassword 
{
	ChromeDriver driver;
	Properties pr;
	public ForGotPassword(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void navigateToForgotPassword()
	{
		WebElement forgotLink = driver.findElement(By.xpath(pr.getProperty("ForgotPassword")));
		forgotLink.click();
	}
	public void ForGotPassWord(String UserEmail)
	{
		WebElement emailField = driver.findElement(By.name(pr.getProperty("userName")));
		emailField.sendKeys(UserEmail);
		WebElement SendResetButton = driver.findElement(By.xpath(pr.getProperty("loginButton")));
		SendResetButton.click();
	}
	public void ReturnToLoginPage()
	{
		WebElement returnLogin = driver.findElement(By.xpath(pr.getProperty("ReturnToLogin")));
		returnLogin.click();
	}
}
