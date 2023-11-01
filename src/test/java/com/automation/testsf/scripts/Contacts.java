package com.automation.testsf.scripts;

import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.testsf.utilities.PropertiesUtilitySF;

public class Contacts extends BaseTestSF {

	public static void main(String[] args) throws InterruptedException {
		
					setUpBeforeTestMethod("chrome");
					loginPage();	
					homeContacts(); //BaseTestSF					
					//createView_26();
					//recentContacts_27();
					//myContacts_28();
					//viewContacts_29();
					//checkViewErrorMsg_30();
					//createViewCancel_31();
					newContact_32();
		}
	
		public static void createView_26() throws InterruptedException {		
		
			viewSettings(); //BaseTestSF
		
			WebElement createNewView= driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/ul/li[3]/a"));
			clickElement(createNewView,"view contacts");
			Thread.sleep(2000);
					
		    String handle = driver.getWindowHandles().toArray()[0].toString();
		    driver.switchTo().window(handle);
		    
		    driver.findElement(By.xpath("//*[@id=\"input-626\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-626\"]")).sendKeys("TestView22");
			Thread.sleep(2000);	
			//driver.findElement(By.id("input-628")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-628\"]")).sendKeys("");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
			//driver.findElement(By.name("__CONFIRM__")).click();
	
		Thread.sleep(2000);	
		}	
		
		public static void recentContacts_27() throws InterruptedException {		
		
		WebElement dropDownCont= driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[5]/lst-pipeline-inspector-common-list/lst-common-list/lst-common-list-internal/div/div/lst-primary-display-manager/div/lst-primary-display/lst-primary-display-grid/lst-customized-datatable/div[2]/div/div/table/tbody/tr[1]/th/lightning-primitive-cell-factory/span/div/lightning-primitive-custom-cell/runtime_pipeline_inspector-name-field/force-lookup/div/a"));
		
		//WebElement dropDownCont= driver.findElement(By.cssSelector("one-app-nav-bar-item-root.navItem:nth-child(7) > one-app-nav-bar-item-dropdown:nth-child(2) > div:nth-child(1) > one-app-nav-bar-menu-button:nth-child(1) > a:nth-child(1)"));
		
		clickElement(dropDownCont,"dropdown contacts");
		Thread.sleep(2000);
		
		WebElement recentCont = driver.findElement(By.xpath("/a[contains(@href,'/lightning/o/Contact/list?filterName=00BHn00000EEgo1MAD')]"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", recentCont);	
	    Thread.sleep(2000);
			
		}	
	
		public static void myContacts_28() throws InterruptedException {		
			
			WebElement myCont = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[7]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a"));
			clickElement(myCont,"my contacts");
			Thread.sleep(2000);
			}	
			//view contact
		public static void viewContacts_29() throws InterruptedException {
			
						
			WebElement dropDownCont= driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[5]/lst-pipeline-inspector-common-list/lst-common-list/lst-common-list-internal/div/div/lst-primary-display-manager/div/lst-primary-display/lst-primary-display-grid/lst-customized-datatable/div[2]/div/div/table/tbody/tr[1]/th/lightning-primitive-cell-factory/span/div/lightning-primitive-custom-cell/runtime_pipeline_inspector-name-field/force-lookup/div/a"));
			clickElement(dropDownCont,"dropdown contacts");
			Thread.sleep(2000);
			
		    WebElement myCont = driver.findElement(By.xpath("/a[contains(@href,'/lightning/o/Contact/list?filterName=00BHn00000EEgo1MAD')]"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", myCont);	
		    Thread.sleep(2000);
				
		}
		public static void checkViewErrorMsg_30() throws InterruptedException {		
			
			
			viewSettings();
		
			WebElement createNewView= driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/ul/li[3]/a"));
			clickElement(createNewView,"view contacts");
			Thread.sleep(2000);
					
		    String handle = driver.getWindowHandles().toArray()[0].toString();
		    driver.switchTo().window(handle);
		    
			driver.findElement(By.xpath("//*[@id=\"input-626\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-626\"]")).sendKeys("adsdssd");
			Thread.sleep(2000);	
			driver.findElement(By.id("input-628")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-628\"]")).sendKeys("EFGH");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

		}
		public static void createViewCancel_31() throws InterruptedException {		
			
		
			viewSettings(); //BaseTestSF
			Thread.sleep(2000);
			WebElement createNewView= driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/ul/li[3]/a"));
			clickElement(createNewView,"view contacts");
			Thread.sleep(4000);
					
		    String handle = driver.getWindowHandles().toArray()[0].toString();
		    driver.switchTo().window(handle);
		    
		    driver.findElement(By.xpath("//*[@id=\"input-626\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-626\"]")).sendKeys("ABCD");
			Thread.sleep(2000);	
			//driver.findElement(By.id("input-628")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-628\"]")).sendKeys("EFGH");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			//driver.findElement(By.name("__CONFIRM__")).click();

		}
		
public static void newContact_32() throws InterruptedException {		
		
	WebElement newContactLink= driver.findElement(By.xpath("//button[contains(text(),'New')]"));
	clickElement(newContactLink,"new contact link");
	Thread.sleep(2000);

	
		   /* String handle = driver.getWindowHandles().toArray()[0].toString();
		    driver.switchTo().window(handle);
		    
		    driver.findElement(By.xpath("//*[@id=\"input-626\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-626\"]")).sendKeys("ABCD");
			Thread.sleep(2000);	
			//driver.findElement(By.id("input-628")).clear();
			driver.findElement(By.xpath("//*[@id=\"input-628\"]")).sendKeys("EFGH");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			//driver.findElement(By.name("__CONFIRM__")).click();
*/
		}
	}
