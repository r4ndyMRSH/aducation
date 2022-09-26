package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {

	protected WebDriver driver;
	
	
	public HelperBase(WebDriver driver) {
		this.driver = driver;
	}

	protected void click(By locator) {
		driver.findElement(locator).click();
	}

	protected void type(By locator, String text) {
		driver.findElement(locator).click();
		driver.findElement(locator).sendKeys(text);
	}

}
