package org.pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement BestSellers = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		Actions A = new Actions(driver);
		A.contextClick(BestSellers).perform();
	    Robot B = new Robot();
	    B.keyPress(KeyEvent.VK_DOWN);
	    B.keyRelease(KeyEvent.VK_DOWN);
	    B.keyPress(KeyEvent.VK_ENTER);
	    B.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    
	    WebElement Mobiles = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		A.contextClick(Mobiles).perform();
		B.keyPress(KeyEvent.VK_DOWN);
	    B.keyRelease(KeyEvent.VK_DOWN);
	    B.keyPress(KeyEvent.VK_ENTER);
	    B.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    
	    WebElement TodayDeals = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
		A.contextClick(TodayDeals).perform();
		B.keyPress(KeyEvent.VK_DOWN);
	    B.keyRelease(KeyEvent.VK_DOWN);
	    B.keyPress(KeyEvent.VK_ENTER);
	    B.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    
	    WebElement NewRelease = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		A.contextClick(NewRelease).perform();
		B.keyPress(KeyEvent.VK_DOWN);
	    B.keyRelease(KeyEvent.VK_DOWN);
	    B.keyPress(KeyEvent.VK_ENTER);
	    B.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
		
	    String ParentWindow = driver.getWindowHandle();
	    System.out.println(ParentWindow);
	    
	    
	    

	}
}
