package org.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();

		WebElement SingleDropdown = driver.findElement(By.id("select-demo"));
		Select S = new Select(SingleDropdown);
		S.selectByIndex(4);

		WebElement multidropdown = driver.findElement(By.id("multi-select"));
		Select D = new Select(multidropdown);

		for (int i = 0; i <= 7; i++) {
			if (i%2==0) {
				D.selectByIndex(i);

			}

		}

		WebElement firstSelectedOption = D.getFirstSelectedOption();
		System.out.println("First Option : " + firstSelectedOption.getText());

		List<WebElement> allSelectedOptions = D.getAllSelectedOptions();
		for (WebElement options : allSelectedOptions) {
			System.out.println(options.getText());
		}
	}
}
