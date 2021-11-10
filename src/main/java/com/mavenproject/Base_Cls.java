package com.mavenproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Cls {

	public static WebDriver driver;
	
	public static WebDriver getBrowser(String method) {
		if (method.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver =  new ChromeDriver();
			
		}
		else if (method.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		return driver;
		
	}
	 public static void clickOnElement(WebElement element) {
		element.click();

	}
	 public static void inputValue(WebElement element,String value) {
		 element.sendKeys(value);

	}
	 public static void selectbyindex(WebElement size,int two) {
		 Select s=new Select(size);
	       s.selectByIndex(two);
	}
	 
	 public static void getURL(String Url) {
	 driver.get(Url);
	 }
	 
	 public static void maximize() {
	 driver.manage().window().maximize();
	 }
	 
	 public static void time() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 }
	 public static void screenshot() throws IOException {
		    TakesScreenshot s=(TakesScreenshot)driver;
			File f =s.getScreenshotAs(OutputType.FILE);
			File f1= new File("C:\\Users\\ELCOT\\eclipse-workspace\\mavenproject\\Screenshot.png");
			FileUtils.copyFile(f,f1);
			

	}
	 public static void thread() throws InterruptedException {
		Thread.sleep(3000);
	}
		 
	 
	 
}
