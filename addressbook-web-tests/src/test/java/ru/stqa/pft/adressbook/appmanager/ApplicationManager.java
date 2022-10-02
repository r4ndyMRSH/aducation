package ru.stqa.pft.adressbook.appmanager;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
		if (browser.equals(BrowserType.FIREFOX)) {
			driver = new FirefoxDriver();
		} else if (browser.equals(BrowserType.CHROME)) {
			driver = new ChromeDriver();
		} else if (browser.equals(BrowserType.IE)){
			driver = new InternetExplorerDriver();
		}
		
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
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
