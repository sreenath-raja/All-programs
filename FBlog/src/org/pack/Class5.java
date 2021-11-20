package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Login Button click
		WebElement TwitLogin = driver.findElement(By.xpath("(//div[@dir='auto'])[4]"));
		TwitLogin.click();
		Thread.sleep(5000);
		
		//Enter the values
		WebElement email = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[1]"));
		email.sendKeys("9787017165");
		Thread.sleep(5000);
		
		WebElement pwd = driver.findElement(By.xpath("(//input[@autocapitalize='none'])[2]"));
		pwd.sendKeys("twitter@123");
		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.xpath("(//div[@dir='auto'])[5]"));
		button.click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
