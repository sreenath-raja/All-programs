package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("vovogoh998@1heizi.com");
		driver.findElement(By.id("passwd")).sendKeys("abc@123");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		
		WebElement title = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions A = new Actions(driver);
		A.moveToElement(title).perform();
		Thread.sleep(3000);
		
		WebElement shirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		A.moveToElement(shirts).perform();
		A.click(shirts).perform();
		
		JavascriptExecutor B = (JavascriptExecutor) driver;
		B.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		WebElement Buy = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		A.moveToElement(Buy).perform();
		A.click(Buy).perform();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		Thread.sleep(2000);
		
		WebElement down = driver.findElement(By.id("group_1"));
		Select S = new Select(down);
		S.selectByValue("2");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		A.moveToElement(submit).perform();
		A.click(submit).perform();
		Thread.sleep(2000);
		
		JavascriptExecutor C = (JavascriptExecutor) driver;
		C.executeScript("window.scrollBy(0,500)");	

	}

}
