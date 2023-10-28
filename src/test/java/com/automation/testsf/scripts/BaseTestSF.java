package com.automation.testsf.scripts;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import com.automation.testsf.utilities.PropertiesUtilitySF;

public class BaseTestSF {
	
	
	protected static WebDriver driver=null;
	static WebDriverWait wait=null;
	static final String USERNAME= "sujyot@eclerx.apm";
	static final String PASSWORD = "testing123";

	//launch browser and takes to saleforce page
	public static void setUpBeforeTestMethod(String browser_name) {
		PropertiesUtilitySF pro=new PropertiesUtilitySF();
		Properties applicationProFile=pro.loadFile("applicationDataProperties");
		String url=applicationProFile.getProperty("url");
		launchBrowser(browser_name);
		maximiseBrowser();
		goToUrl(url);		
	}
	
	//valid login to salesforce
	public static WebDriver loginPage() {
		
		setUpBeforeTestMethod("Chrome");
		WebElement usernameEle = driver.findElement(By.id("username"));	
		enterText(usernameEle,USERNAME,"username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,PASSWORD,"password textbox");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		
		return driver;		
	}
	
	//close browser
	public void tearDownAfterTestMethod() {
		closeBrowser();
		System.out.println("******automation script ended***********");
	}
	
	//different type browser launch
	public static void launchBrowser(String browserName) {
		switch(browserName) {
		case "firefox":driver=new FirefoxDriver();
						System.out.println("firefox browser launched");
						break;
		case "chrome":driver=new ChromeDriver();
						System.out.println("chrome browser launched");
						break;
		case "edge":driver=new EdgeDriver();
						System.out.println("edge browser launched");
						break;
		case "safari":driver= new SafariDriver();
						System.out.println("safari browser launched");
						break;
		default: System.out.println("you have not entrered the correct browser");		
			
		}
	}
	
	//get URL
	public static void goToUrl(String url) {
		driver.get(url);
		System.out.println(url+ "is entered");
	}
	
	//Maximize the browser
	public static void maximiseBrowser() {
		driver.manage().window().maximize();
		System.out.println("browser window has maximized");
	}
	//Set Page Title
	public static String getPageTitle() {
		return driver.getTitle();
	}

	//Refresh the page
	public static void refreshPage() {
		driver.navigate().refresh();

	}
	
	//Get the text from element
	public static String getTextFromElement(WebElement ele,String objectName) {
		String data=ele.getText();
		System.out.println("extracted the text from"+objectName);
		return data;
	}
	
	//Close browser
	public static void closeBrowser() {
		driver.close();
		System.out.println("browser closed");
		System.out.println("******automation script ended***********");
	}
	//quit browser
	public static void quitBrowser() {
		driver.quit();
	}
	
	//Enter text in textfield
	public static void enterText(WebElement ele,String data,String ObjectName) {
		if (ele.isDisplayed()) {
			clearElement(ele, ObjectName);
			ele.sendKeys(data);
			System.out.println("data is entered in the "+ObjectName);
		} else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}
	//clear element
	public static void clearElement(WebElement ele,String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			System.out.println(ObjectName+" is cleared");
		}
		else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}
	//click element
	public static void clickElement(WebElement ele,String ObjectName) {
		if(ele.isEnabled()) {
			ele.click();
			System.out.println(ObjectName+"button is clicked");
			}
			else {
				System.out.println("button element is not enabled");
			}
	}
	
		//Explicit Wait
		public static void waitForVisibility(WebElement webele, int time, String objName) {
			wait= new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(webele));
		}
		
		//Fluent wait
		public static void waitForVisibility(WebElement webele, int time, int pollingtime, String objName) {
			FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(pollingtime))
			.ignoring(ElementNotInteractableException.class);	
			
			wait.until(ExpectedConditions.visibilityOf(webele));
			System.out.println(objName+" is waited for visibility using Fluent wait");
			
		}
		
		//Select value from drop down
		public static void selectByValue(WebElement element,String text,String objName) {
			Select selectOption= new Select(element);
			selectOption.selectByValue(text);
			System.out.println(objName+ "selected");
		}

}