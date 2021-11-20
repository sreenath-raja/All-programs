package org.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\DemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.youtube.com/");
		driver1.navigate().to("https://www.flipkart.com/");
		/*driver1.getCurrentUrl();
		driver1.getc
		driver1.getTitle();
		driver1.close();
		driver1.quit();
		driver1.manage().window().maximize();
		driver1.navigate().to(arg0);
		driver1.navigate().forward();
		driver1.navigate().back();
		driver1.navigate().refresh();*/
		
	}
}
