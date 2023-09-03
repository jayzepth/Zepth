package org.zepth.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage 
{
	ChromeDriver driver;
	Properties pr;
	public LoginPage(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void Login(String UserName, String Password) throws InterruptedException
	{
		WebElement UsrnameField = driver.findElement(By.id(pr.getProperty("userName")));
		UsrnameField.sendKeys(UserName);
		WebElement PasswordField = driver.findElement(By.id(pr.getProperty("password")));
		PasswordField.sendKeys(Password);
		WebElement LoginButton = driver.findElement(By.xpath(pr.getProperty("loginButton")));
		LoginButton.click();
	}

}
