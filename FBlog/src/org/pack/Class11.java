package org.pack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.myntra.com/men-casual-shirts");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  
		  List<WebElement> Allprices = driver.findElements(By.xpath("//div[text()='Only Few Left!']//..//div[@class='product-price']//span[@class='product-discountPercentage']"));
		  
		  List<Integer> Pricelist = new ArrayList<Integer>();
		  for (WebElement PriceElement : Allprices) {
			 // if (PriceElement.empty()) {
				
			  String Price = PriceElement.getText().replace("Rs. ", " ");
			  System.out.println(Price);
			  Pricelist.add(Integer.parseInt(Price));
			  //}
		}
		  System.out.println(Pricelist);
		  System.out.println("size:" + Pricelist.size());
		  System.out.println("Maximum value:" + Collections.max(Pricelist));
	}

}
