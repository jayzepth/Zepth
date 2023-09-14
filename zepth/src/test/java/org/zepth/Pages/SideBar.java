package org.zepth.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SideBar 
{
	ChromeDriver driver;
	Properties pr;
	public SideBar(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void OpensideMenu()
	{
		WebElement sideMenu = driver.findElement(By.xpath(pr.getProperty("SideMenu")));
		sideMenu.click();
	}
	public void NavigateToMeetings()
	{
		WebElement meetingsLink = driver.findElement(By.xpath(pr.getProperty("meetings")));
		meetingsLink.click();
	}
	public void NavigateTodoList()
	{
		WebElement todoList = driver.findElement(By.xpath(pr.getProperty("todoList")));
		todoList.click();
	}
	public void ClickJobsiteMenu()
	{
		WebElement jobsite = driver.findElement(By.xpath(pr.getProperty("jobsiteMenu")));
		jobsite.click();
	}
	public void NavigateToInspection()
	{
		WebElement inspectionLink = driver.findElement(By.xpath(pr.getProperty("inspection")));
		inspectionLink.click();
	}

}
