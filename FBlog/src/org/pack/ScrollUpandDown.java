package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		/*
		 * WebElement close =
		 * driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 * close.click(); Thread.sleep(2000);
		 * 
		 * 
		 * WebElement scrolldown =
		 * driver.findElement(By.xpath("(//a[@class='_1arVWX'])[2]"));
		 * JavascriptExecutor A = (JavascriptExecutor) driver;
		 * A.executeScript("arguments[0].scrollIntoView();",scrolldown);
		 * Thread.sleep(3000); WebElement scrollup =
		 * driver.findElement(By.xpath("//[@class='_1_3w1N']"));
		 * A.executeScript("arguments[0].scrollIntoView();", scrollup);
		 * Thread.sleep(3500);
		 * 
		 * 
		 * // Write a script to ScrollDown and ScrollUp the window using pixel?
		 * 
		 * JavascriptExecutor B = (JavascriptExecutor) driver;
		 * B.executeScript("window.scrollBy(0,500)"); Thread.sleep(4000);
		 * B.executeScript("window.scrollBy(0,-500)");
		 * 
		 * 
		 * //write a script to ScrollDown and ScrollUp the window up to 50px for
		 * 10times? JavascriptExecutor C = (JavascriptExecutor) driver; //To Scroll Down
		 * for (int i = 0; i < 10; i++) { C.executeScrpt("window.scrollBy(0,500)");
		 * Thread.sleep(500); } Thread.sleep(2000); //To ScrollUp for (int i = 0; i <
		 * 10; i++) { C.executeScript("window.scrollBy(0,-500)"); Thread.sleep(500); }
		 * 
		 */	
		//write a script to scroll web page up to specified element?
		/*
		 * driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		 * JavascriptExecutor D = (JavascriptExecutor)driver; WebElement down =
		 * driver.findElement(By.xpath("//*[text()='Live Demo']"));
		 * D.executeScript("arguments[0].scrollIntoView(true)", down);
		 * Thread.sleep(2000); WebElement clk =
		 * driver.findElement(By.xpath("//*[text()='View more demos']")); clk.click();
		 */
		
		//write a script to enter TextBox value and click using JavaScript?
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor E = (JavascriptExecutor)driver;
		E.executeScript("document.getElementById('email').setAttribute('value',Hello')");
		Object S = E.executeScript("return document.getElementById('email').getAttribute('value')");
		System.out.println(S);
		Thread.sleep(3000);
		E.executeScript("return document.getElementByID('u_0_r').click()");
		
		
		
		
		
		
		
		
		
		
	}

}
