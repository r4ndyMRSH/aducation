package ru.stqa.pft.adressbook.appmanager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class ApplicationManager {

	private Map<String, Object> vars;
	private String browser;
	protected WebDriver driver;
	private SessionHelper sessionHelper;
	private GroupHelper groupHelper;
	private NavigationHelper navigationHelper;
	private ContactHelper contactHelper;

	public ApplicationManager(String browser) {
		this.browser = browser;
		// TODO Auto-generated constructor stub
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}

	public GroupHelper getGrouphelper() {
		return groupHelper;
	}

	JavascriptExecutor js;

	public void init() {
//		System.setProperty("webdriver.gecko.driver", "c:\\tools\\geckodriver\\geckodriver.exe");
		if (browser == BrowserType.FIREFOX) {
			driver = new FirefoxDriver();
		} else if (browser == BrowserType.CHROME) {
			driver = new ChromeDriver();
		} else if (browser == BrowserType.IE){
			driver = new InternetExplorerDriver();
		}
		
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		sessionHelper = new SessionHelper(driver);
		groupHelper = new GroupHelper(driver);
		navigationHelper = new NavigationHelper(driver);
		contactHelper = new ContactHelper(driver);
		sessionHelper.login("admin", "secret");
	}

	public ContactHelper getContactHelper() {
		return contactHelper;
	}

	public void stop() {
		driver.quit();
	}

	

}
