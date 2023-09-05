package org.zepth.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PortFolioPage 
{
	ChromeDriver driver;
	Properties pr;
	public PortFolioPage(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void ModelClose() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement modelcloseButton = driver.findElement(By.xpath(pr.getProperty("ModelClose")));
		if(modelcloseButton.isDisplayed())
		{
			modelcloseButton.click();
			System.out.println("You Entered in EnterPrise Project");
		}
		else {
			System.out.println("It's a Lite Project");
		}
	}
	public void LogOut() throws InterruptedException
	{
		WebElement UserProfile = driver.findElement(By.xpath(pr.getProperty("UserProfile")));
		UserProfile.click();
		Thread.sleep(5000);
		WebElement LogoutButton = driver.findElement(By.xpath(pr.getProperty("logoutButton")));
		LogoutButton.click();
	}
	public void SelectCompany(String CompanyName)
	{
		WebElement account = driver.findElement(By.id(pr.getProperty("AccountsID")));
		account.click();
		List<WebElement> companyList = driver.findElements(By.xpath(pr.getProperty("companyList")));
		for (WebElement company:companyList)
		{
			if(company.getText().contains(CompanyName))
			{
				company.click();
				break;
			}
			else {
				System.out.println("The Company is not found.");
			}
		}
	}
	public void NavigateToProject(String ProjectName) throws InterruptedException
	{
		Thread.sleep(5000);
		List<WebElement> projectList = driver.findElements(By.xpath(pr.getProperty("projectList")));
		for (WebElement projects:projectList)
		{
			String Projectname = projects.getText();
			if(Projectname.contains(ProjectName))
			{
				projects.click();
				break;
			}
		}
	}
}
