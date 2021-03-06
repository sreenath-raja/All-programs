package org.pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.EqualsMethod;


public class BaseClassBL {
	public static WebDriver driver;

	public static WebDriver Getbrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\sreenath.raja\\eclipse-workspace\\FBlog\\Driver1\\chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.out.println("invalid browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void currenturl() {
         driver.getCurrentUrl();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void backward() {
		driver.navigate().back();
	}
	public static void refresh() {
        driver.navigate().refresh();
	}
	public static void close() {
		driver.close();
	}
	public static void quite() {
		driver.quit();
	}
	public static void gettitle() {
		driver.getTitle();
	}
	public static void screenshot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File SourcleFile = ts.getScreenshotAs(OutputType.FILE);
		File DestinationFile = new File(path);
		FileUtils.copyFileToDirectory(SourcleFile, DestinationFile);
		
	}
	
	public static void Selection(WebElement element, String Choise, String Value) {
		Select S = new Select(element);
		try {
			if (Choise == "byIndex") {
				int parseInt = Integer.parseInt(Value);
				S.selectByIndex(parseInt);	
			} else if (Choise == "byValue") {
				S.selectByValue(Value);	
			}else if (Choise == "byVisibleText") {
				S.selectByVisibleText(Value);	
			}else {
				System.out.println("Inavlid Option");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	public void inputtoElement(WebElement element, String value) {
		element.sendKeys(value);

	}
	public static void clickonElement(WebElement element) {
		element.click();

	}
	public static void Alert() {
		driver.switchTo().alert().accept();	
	}
	public static void confirmAlert(String ok, String Cancel) {
          if (ok.equalsIgnoreCase("ok")) {
        	  driver.switchTo().alert().accept();	
		}else if (Cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();	
		}
	}
	public static void promptAlert(String ok, String value, String cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();

		} else if (cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();

		}
		
	}
	public static void actionMethod(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.contextClick(Element).build().perform();
	}
	public static void robotClass() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}
	public void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();", element);
	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();", element);
	}
	public void elementClear(WebElement element) {
		element.clear();
	}
	
	
}
	
