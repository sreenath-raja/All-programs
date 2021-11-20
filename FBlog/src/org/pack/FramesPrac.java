package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPrac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Frames.html");
		  Thread.sleep(3000);
		  
		  WebElement frame1of2 = driver.findElement(By.id("singleframe"));
		  driver.switchTo().frame(frame1of2);
		  WebElement SingleFeameText = driver.findElement(By.xpath("//input[@type='text']"));
		  SingleFeameText.sendKeys("mohan");
		  driver.switchTo().defaultContent();
		  
		  
		  WebElement findElement = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		  findElement.click();
		  
		  Thread.sleep(3000);
		  WebElement frame2of1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		  driver.switchTo().frame(frame2of1);
		  
		  WebElement frame2of2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		  driver.switchTo().frame(frame2of2);


		  WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		  text.sendKeys("Sree");
	  
	}

}
