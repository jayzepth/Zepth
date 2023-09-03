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
		public void NavigateToProject(int projectId)
		{
			List<WebElement> projectWithId = driver.findElements(By.xpath("//tr[@class='odd' or @class='even']"));
			int totalProject = projectWithId.size();
			for (int i=0;i<totalProject;i++)
			{
				WebElement size = projectWithId.get(i);
				String projectName = driver.findElement(By.xpath("//a[@class='hlText']")).getText();
			}
		}

}
