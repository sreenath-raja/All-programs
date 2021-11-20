package org.pack;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class10 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  
		  WebElement Createaccount = driver.findElement(By.xpath("//a[@role='button']"));
		  Createaccount.click();
		  Thread.sleep(3000);
		  
		  WebElement day = driver.findElement(By.id("day"));
		  Select s = new Select(day);
		  s.selectByValue("4");
		  
		  WebElement month = driver.findElement(By.id("month"));
		  Select d = new Select(month);
		  d.selectByIndex(2);
		  
		  WebElement year = driver.findElement(By.id("year"));
		  Select y = new Select(year);
		  y.selectByVisibleText("2018");
		  
		  TakesScreenshot screen = (TakesScreenshot) driver;
		  File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		  File Destination = new File("C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Screenshots\\Sreenath.png");
          FileUtils.copyFile(screenshotAs, Destination);
		 
		 
	}
	
	
}
