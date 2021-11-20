package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email_create")).sendKeys("vovogoh998@1heizi.com");
		Thread.sleep(2000);

		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("id_gender1")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Abinash");
		driver.findElement(By.id("customer_lastname")).sendKeys("Abinash");
		driver.findElement(By.id("passwd")).sendKeys("abc@123");
		
		WebElement day = driver.findElement(By.id("days"));
		Select A = new Select(day);
		A.selectByIndex(20);
		
		WebElement month = driver.findElement(By.id("months"));
		Select B = new Select(month);
		B.selectByValue("3");
		
		WebElement year = driver.findElement(By.id("years"));
		Select C = new Select(year);
		C.selectByVisibleText("1996  ");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		driver.findElement(By.id("company")).sendKeys("Iopex");
		driver.findElement(By.id("address1")).sendKeys("No.54, Ambit It park,mogapair road");
		driver.findElement(By.id("address2")).sendKeys("No.54, Ambit It park,mogapair road");
		driver.findElement(By.id("city")).sendKeys("Chennai");

		WebElement state = driver.findElement(By.id("id_state"));
		Select D = new Select(state);
		D.selectByIndex(2);
		
		driver.findElement(By.id("postcode")).sendKeys("90001");
		driver.findElement(By.id("other")).sendKeys("Hi how are you");
		driver.findElement(By.id("phone")).sendKeys("04425434312");
		driver.findElement(By.id("phone_mobile")).sendKeys("9765323451");
		driver.findElement(By.id("alias")).sendKeys("Ambit It");
		driver.findElement(By.id("submitAccount")).click();

	
 
		
		

		

		
	}

}
