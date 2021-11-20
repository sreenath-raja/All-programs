package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("Sreenath2772@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("123456789");
	    Thread.sleep(5000);
		
		WebElement bttn = driver.findElement(By.xpath("//button[@value='1']"));
		bttn.click();
		
	}

}
