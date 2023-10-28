package com.automation.testsf.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automation.testsf.utilities.PropertiesUtilitySF;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class UserMenuDropDown extends BaseTestSF {	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpBeforeTestMethod("chrome");
		loginPage();
		
		userProfile_5(); 		
		//logoutSuccess_9();
	}		
		//Test case 05 - clicking my profile			
	public static void userProfile_5() throws InterruptedException {			
	
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"userNav\"]")); 
		JavascriptExecutor executor1 = (JavascriptExecutor) driver; 
		executor1.executeScript("arguments[0].click();", profile);
		Thread.sleep(5000);
		
		WebElement myProfile= driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		clickElement(myProfile,"my profile");
		Thread.sleep(3000);
		
	}
		//Test case 06 - clicking edit profile	
		public static void editUser_6() throws Exception {
		WebElement setUser = driver.findElement(By.xpath("//*[@id=\"setupComponent\"]/div[2]/div/div[2]/section/div[2]/table/tbody/tr/td[1]/a"));
		setUser.click();
		Thread.sleep(2000);
		
		//driver.switchTo().frame("vfFrameId_1698139140141");
		//driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]")).click();
		}
		
		//test case 07 - History/Calendar
		
		
		//test case 08 - Developer Console 	in setup	
	public static void devConsole_8() throws InterruptedException{				
		
		WebElement setup = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/header[1]/div[2]/span[1]/div[2]/ul[1]/li[6]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/lightning-icon[1]/span[1]/lightning-primitive-icon[1]/svg[1]/g[1]/path[1]")); 
		JavascriptExecutor executor1 = (JavascriptExecutor) driver; 
		executor1.executeScript("arguments[0].click();", setup);
		Thread.sleep(5000);
		
		//WebElement devConsol = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/a[2]"));
		//devConsol.click();
		//Thread.sleep(2000);
			}	
	
		//Test case 09 - logout	
	public static void logoutSuccess_9() throws InterruptedException{				
			
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"userNav\"]")); 
		JavascriptExecutor executor1 = (JavascriptExecutor) driver; 
		executor1.executeScript("arguments[0].click();", profile);
		//waitForVisibility(profile,10,"profile link");
		Thread.sleep(3000);
	
		WebElement logoutUser = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		clickElement(logoutUser,"logout button");
		
			}	
	}