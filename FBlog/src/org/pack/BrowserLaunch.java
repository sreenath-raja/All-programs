package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class BrowserLaunch extends BaseClassBL{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	     driver=Getbrowser("chrome");
		geturl("https://www.google.com/");
		Thread.sleep(2000);	
		
		//inputtoElement(driver.findElement(By.xpath("//input[@type='text']")), "amazon");
		

		
	}
}