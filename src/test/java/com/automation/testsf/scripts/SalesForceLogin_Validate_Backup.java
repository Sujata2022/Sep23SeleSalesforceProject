package com.automation.testsf.scripts;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automation.testsf.utilities.PropertiesUtilitySF;

public class SalesForceLogin_Validate_Backup extends BaseTestSF{	

	public static void valid_login_sfdc() throws InterruptedException {
		//log4j: log
		//extent report
		System.out.println("******login_to_salesforce automation script started***********");
		
		String expected="Login | Salesforce";
		PropertiesUtilitySF pro=new PropertiesUtilitySF();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");		
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		WebElement pageTitle= driver.findElement(By.xpath("/html/head/title"));
		waitForVisibility(pageTitle, 5, "Page Title text");
		String actual=getTextFromElement(pageTitle,"Page Title text");	
	}

	public static void invalid_login_sfdc1() throws InterruptedException {
		System.out.println("******invalid_login_to_firebase1 automation script started***********");
		PropertiesUtilitySF pro=new PropertiesUtilitySF();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.invalid.userid");
		String password=appProp.getProperty("login.invalid.password");
		
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		enterText(usernameEle,username,"username textbox");
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		//clearElement(usernameEle, "username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		//clearElement(passwordEle, "password textbox");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");

	}

	public static void invalid_login_sfdc2() throws InterruptedException {
		
		System.out.println("******invalid_login_to_firebase2 automation script started***********");
		String expected="Error : The password is invalid or the user does not have a password.";
		System.out.println("expected data to be validates is=="+expected);
				
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,"sujyot@eclerx.apm","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
		clearElement(passwordEle,"password textbox");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		//waitForAlertPresent(5);
		//Alert loginerrorAlert= switchToAlert();
		//String actual= getAlertText(loginerrorAlert,"login error alert box");
		//AcceptAlert(loginerrorAlert);

		}
	
	public static void forgot_password() throws InterruptedException{	
		System.out.println("******invalid_login_to_firebase2 automation script started***********");
		String expected="Forgot password";
		System.out.println("expected data to be validates is=="+expected);
		
		WebElement forgetPass = driver.findElement(By.id("forgot_password_link"));	
		clickElement(forgetPass,"Forget button");
		WebElement userName = driver.findElement(By.id("un"));
		waitForVisibility(userName, 5, 2, "username textbox");
		enterText(userName,"sujyot@eclerx.apm","username textbox");
		WebElement buttonEle=driver.findElement(By.id("continue"));
		//clickElement(buttonEle,"continue button");	
		waitForVisibility(buttonEle,5,"Continue");
		closeBrowser();
	}
	
	//5th -After login, logout successfully without remember me option
	public static void logout_success() throws InterruptedException{
		
		PropertiesUtilitySF pro=new PropertiesUtilitySF();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");		
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"userNav\"]")); 
		JavascriptExecutor executor1 = (JavascriptExecutor) driver; 
		executor1.executeScript("arguments[0].click();", profile);
		waitForVisibility(profile,10,"profile link");
	
		WebElement logoutUser = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		clickElement(logoutUser,"logout button");
		waitForVisibility(logoutUser,10,"logout");
			}	
	
	//6th - logout using "Remember me" option		
		public static void remember_me() throws InterruptedException{			
		
			PropertiesUtilitySF pro=new PropertiesUtilitySF();
			Properties appProp= pro.loadFile("applicationDataProperties");
			String username=appProp.getProperty("login.valid.userid");
			String password=appProp.getProperty("login.valid.password");		
			
			WebElement usernameEle = driver.findElement(By.id("username"));
			waitForVisibility(usernameEle, 5, 2, "username textbox");
			enterText(usernameEle,username,"username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
			enterText(passwordEle,password,"password textbox");
			WebElement buttonEle=driver.findElement(By.id("Login"));
			clickElement(buttonEle,"login button");
			
			
			WebElement rememberOption = driver.findElement(By.cssSelector("label[for ='rememberUn']"));
			if (!rememberOption.isSelected()) {
				clickElement(rememberOption,"remember button");
			}					
			waitForVisibility(rememberOption,6,"remember link");
			
			WebElement buttonEle1=driver.findElement(By.id("Login"));
			clickElement(buttonEle1,"login button");
			
			WebElement profile = driver.findElement(By.xpath("//*[@id=\"userNav\"]")); 
			JavascriptExecutor executor1 = (JavascriptExecutor) driver; 
			executor1.executeScript("arguments[0].click();", profile);
			waitForVisibility(profile,10,"profile link");
			
			WebElement logoutUser = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
			clickElement(logoutUser,"logout button");
			waitForVisibility(logoutUser,10,"logout");		
			
		}	
	
	public static void main(String[] args) throws InterruptedException {
		setUpBeforeTestMethod("chrome");
		//valid_login_sfdc();
		//invalid_login_sfdc1();
		//invalid_login_sfdc2();
		//forgot_password(); 
		//logout_success();
		remember_me();	
	}
}
