package com.automation.testsf.scripts;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leads extends BaseTestSF{ 
	
	public static void main(String[] args) throws InterruptedException {
		
			setUpBeforeTestMethod("chrome");
			loginPage();		
			//checkLeads_20();
			
			//todayLeads_23();
			//createNewLead_24();
}	
	//check leads
	public static void checkLeads_20() throws InterruptedException {
		WebElement allTab= driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		clickElement(allTab,"All tab button");
		Thread.sleep(2000);			
		WebElement leadsTab= driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
		clickElement(leadsTab,"leads button");
		Thread.sleep(2000);

	}
	public static void goButtonVerify_22() throws InterruptedException {
		WebElement allTab= driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		clickElement(allTab,"All tab button");
		Thread.sleep(2000);			
		WebElement leadsTab= driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
		clickElement(leadsTab,"leads button");
		Thread.sleep(2000);

	}
	
	//view today's leads
		public static void todayLeads_23() throws InterruptedException {
			WebElement allTab= driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
			clickElement(allTab,"All tab button");
			Thread.sleep(2000);			
			WebElement leadsTab= driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
			clickElement(leadsTab,"leads button");
			Thread.sleep(2000);			
			WebElement viewLeads = driver.findElement(By.xpath("//select[@id='fcf']"));
			selectByValue(viewLeads,"00BHn00000EEgnK","todays leads");
			Thread.sleep(2000);
		}
		//create new Leads
		public static void createNewLead_24() throws InterruptedException {
			
			WebElement allTab= driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
			clickElement(allTab,"All tab button");
			Thread.sleep(2000);			
			WebElement leadsTab= driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
			clickElement(leadsTab,"leads button");
			Thread.sleep(2000);					
			WebElement createLeads= driver.findElement(By.xpath("//td[@class='pbButton']//input[@type='button']"));
			clickElement(createLeads,"create new view");
			Thread.sleep(2000);			
			WebElement lastName= driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
			enterText(lastName,"ABCD","last name textbox");	
			WebElement companyName= driver.findElement(By.xpath("//input[@id='lea3']"));
			enterText(companyName,"ABCD","company name textbox");				
			Thread.sleep(2000);	
			WebElement saveLead= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[3]/table/tbody/tr/td[2]/input[1]"));
			clickElement(saveLead,"save view");
			Thread.sleep(2000);	
		}
	
}
