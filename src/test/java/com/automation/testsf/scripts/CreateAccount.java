package com.automation.testsf.scripts;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BaseTestSF{ 
	
	public static void main(String[] args) throws InterruptedException {
		
			setUpBeforeTestMethod("chrome");
			loginPage();			
			createAccount_10();
			//createView_11();
			//editView_12();			
}	
	//create New Account
	public static void createAccount_10() throws InterruptedException {
		allTabs();		
		WebElement accountTab= driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
		clickElement(accountTab,"account button");
		Thread.sleep(2000);			
		WebElement createAcct= driver.findElement(By.xpath("//td[@class='pbButton']//input[@type='button']"));
		clickElement(createAcct,"create new button");
		Thread.sleep(2000);			
		WebElement accountName = driver.findElement(By.xpath("//input[@id='acc2']"));
		enterText(accountName,"Mike","account name textbox");
		Thread.sleep(2000);			
		WebElement type = driver.findElement(By.xpath("//select[@id='acc6']"));
		selectByValue(type, "Technology Partner","type");
		Thread.sleep(2000);
		WebElement cusPrority = driver.findElement(By.xpath("//select[@id='00NHn00000Gcr5Z']"));
		selectByValue(cusPrority, "High","customer priority");
		Thread.sleep(2000);
		WebElement saveNew= driver.findElement(By.cssSelector("#bottomButtonRow > input:nth-child(2)"));
		clickElement(saveNew,"save and create new button");
		Thread.sleep(2000);
	}
	
	//create new View
		public static void createView_11() throws InterruptedException {
			
			allTabs();			
			WebElement accountTab= driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
			clickElement(accountTab,"account button");
			Thread.sleep(2000);			
			WebElement createView= driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			clickElement(createView,"create new view");
			Thread.sleep(2000);	
			WebElement viewName= driver.findElement(By.xpath("//input[@id='fname']"));
			enterText(viewName,"Mike123","account name textbox");			
			//WebElement uniqueName= driver.findElement(By.xpath("//input[@id='devname']"));			
			WebElement saveView= driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[3]/table/tbody/tr/td[2]/input[1]"));
			clickElement(saveView,"save view");
			Thread.sleep(2000);	
		}
	
		//edit View
		public static void editView_12() throws InterruptedException {
			
			allTabs();			
			WebElement accountTab= driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
			clickElement(accountTab,"account button");
			Thread.sleep(2000);
			WebElement selView = driver.findElement(By.xpath("//select[@id='fcf']"));
			selectByValue(selView, "00BHn00000EGsTY","customer view");  //Mike value
			Thread.sleep(2000);			
			WebElement editView = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[1]"));
			clickElement(editView,"edit view");
			Thread.sleep(2000);
			
			WebElement viewName= driver.findElement(By.xpath("//input[@id='fname']"));
			enterText(viewName,"Rahul","account name textbox");	
			
			WebElement field = driver.findElement(By.xpath("//select[@id='fcol1']"));
			selectByValue(field, "ACCOUNT.NAME","account name");  
			Thread.sleep(2000);	
			WebElement operator = driver.findElement(By.xpath("//select[@id='fop1']"));
			selectByValue(operator, "c","operator");
			Thread.sleep(2000);	
			WebElement valueView = driver.findElement(By.xpath("//input[@id='fval1']"));
			enterText(valueView,"a","value a");	
			WebElement saveView= driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[3]/table/tbody/tr/td[2]/input[1]"));
			clickElement(saveView,"save view");
			Thread.sleep(2000);	
			
		}
		
		//merge_accounts()
		//account_reports()	
}
