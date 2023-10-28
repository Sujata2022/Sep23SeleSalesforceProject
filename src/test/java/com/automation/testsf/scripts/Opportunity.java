package com.automation.testsf.scripts;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Opportunity extends BaseTestSF{ 
	
	public static void main(String[] args) throws InterruptedException {
		
			setUpBeforeTestMethod("chrome");
			loginPage();			
			//viewOpty_16();	
			//optyPipeReport_17(); 
			viewOptyStuck_18();
}	
	//view Opportunity
	public static void viewOpty_16() throws InterruptedException {
		WebElement allTab= driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		clickElement(allTab,"All tab button");
		Thread.sleep(2000);			
		WebElement optyTab= driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		clickElement(optyTab,"opty link");
		Thread.sleep(2000);
		}
	//view Opportunity Pipeline link
		public static void optyPipeReport_17() throws InterruptedException {
			WebElement allTab= driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
			clickElement(allTab,"All tab button");
			Thread.sleep(2000);			
			WebElement optyTab= driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
			clickElement(optyTab,"opty link");
			Thread.sleep(2000);
			WebElement optyPipe= driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
			clickElement(optyPipe,"opty pipeline");
			Thread.sleep(2000);				
			
			}
		//view Stuck Opportunity link
			public static void viewOptyStuck_18() throws InterruptedException {
				WebElement allTab= driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
				clickElement(allTab,"All tab button");
				Thread.sleep(2000);			
				WebElement optyTab= driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
				clickElement(optyTab,"opty link");
				Thread.sleep(2000);
				WebElement optyStuck= driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
				clickElement(optyStuck,"opty stuck");
				Thread.sleep(2000);							
				}
		

}
