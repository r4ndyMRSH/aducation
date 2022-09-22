package ru.stqa.pft.adressbook.appmanager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {

	private Map<String, Object> vars;
	protected WebDriver driver;
	private SessionHelper sessionHelper;
	private GroupHelper groupHelper;
	private NavigationHelper navigationHelper;

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}

	public GroupHelper getGrouphelper() {
		return groupHelper;
	}

	JavascriptExecutor js;

	public void init() {
		System.setProperty("webdriver.gecko.driver", "c:\\tools\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		sessionHelper = new SessionHelper(driver);
		groupHelper = new GroupHelper(driver);
		navigationHelper = new NavigationHelper(driver);
		sessionHelper.login("admin", "secret");
	}

	public void stop() {
		driver.quit();
	}

	

}
