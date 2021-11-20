package org.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IELaunch {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\DemoProject\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		//Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
	
		driver.navigate().to("https://www.flipkart.com/");
		
	}

}
