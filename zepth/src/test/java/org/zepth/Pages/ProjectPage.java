package org.zepth.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectPage 
{
		ChromeDriver driver;
		Properties pr;
		public ProjectPage(ChromeDriver driver, Properties pr)
		{
			this.driver = driver;
			this.pr = pr;
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
