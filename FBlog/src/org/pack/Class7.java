package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='search']"));
		email.sendKeys("Veyyon silli Songs");
		
		WebElement search = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		search.click();
		Thread.sleep(2000);
		
		WebElement Play = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
		Play.click();
		
		
		
			
	}


}
