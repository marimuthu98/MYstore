package com.mystore.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	protected static WebDriver driver;

	public static void browserLanuch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void btnclick(WebElement element) {
		element.click();

	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public static WebElement findLocatorById(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}

	public static WebElement findLocatorByName(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;
	}

	public static WebElement findLocatorByClassName(String data) {
		WebElement element = driver.findElement(By.className(data));
		return element;
	}

	public static WebElement findLocatorByXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}

	public static void implicitlyWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public static String gettitle() {
		String title = driver.getTitle();
		return title;

	}

	public static void closebrowser() {
		driver.close();
	}

	public static void closeallbrowser() {
		driver.quit();

	}

	public static void alertByAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public static void alertByDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
		;

	}

	public static void alertBySendkeys(String data) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(data);

	}

	public static void selectByIndex(WebElement element, int indexnum) {
		Select s = new Select(element);
		s.selectByIndex(indexnum);
	}

	public void selectByValue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public void selectByVisibletext(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public void deselectByIndex(WebElement element, int indexnum) {
		Select s = new Select(element);
		s.deselectByIndex(indexnum);
	}

	public void deselectByValue(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByValue(data);
	}

	public static void scrollByVisibleElement(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", element);
}
}
