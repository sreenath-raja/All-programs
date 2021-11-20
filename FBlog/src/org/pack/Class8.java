package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8 {
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			close.click();
			
			WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
			search.sendKeys("samsungmobiles");
			
			WebElement click = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
			click.click();
			Thread.sleep(3000);
			
			WebElement img = driver.findElement(By.xpath("//div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a/div[1]/div[1]/div[1]/div[1]/img"));
			img.click();
			Thread.sleep(4000);
			
			WebElement buynow = driver.findElement(By.xpath("//button[@type='button']"));
			buynow.click();
			
	}

}
