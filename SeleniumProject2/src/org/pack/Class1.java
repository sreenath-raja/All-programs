package org.pack;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreenath.raja\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		Dimension A = new Dimension(500, 500);
		driver.manage().window().setSize(A);
		
		Point P=new Point(250,250);
		driver.manage().window().setPosition(P);

		
		  driver.navigate().to("https://www.amazon.in/");
		  
		  String S = driver.getCurrentUrl(); System.out.println(S);
		  
		  String V = driver.getTitle(); System.out.println(V);
		  
		  driver.navigate().back(); Thread.sleep(5000); driver.navigate().forward();
		  driver.navigate().refresh();
		  driver.navigate().to("https://www.instagram.com/"); driver.quit();
		 
		 
	}

}
