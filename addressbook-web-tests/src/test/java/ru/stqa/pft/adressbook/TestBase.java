package ru.stqa.pft.adressbook;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	private WebDriver driver;
	private Map<String, Object> vars;
	public WebDriver getDriver() {
		return driver;
	}

	JavascriptExecutor js;

	@Before
	public void setUp() {
	
		System.setProperty("webdriver.gecko.driver", "c:\\tools\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		login("admin", "secret");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	private void login(String login, String password) {
		driver.get("http://localhost/addressbook/");
		driver.findElement(By.name("user")).click();
		driver.findElement(By.name("user")).sendKeys(login);
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.cssSelector("input:nth-child(7)")).click();
	}

	protected void returnToGroupPage() {
		driver.findElement(By.linkText("group page")).click();
	}

	protected void submitGroupCreation() {
		driver.findElement(By.name("submit")).click();
	}

	protected void fillGroupForm(GroupData groupData) {
		driver.findElement(By.name("group_name")).click();
		driver.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
		driver.findElement(By.name("group_header")).click();
		driver.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
		driver.findElement(By.name("group_footer")).click();
		driver.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
	}

	protected void initGroupCreation() {
		driver.findElement(By.name("new")).click();
	}

	protected void gotoGroupPage() {
		driver.findElement(By.linkText("groups")).click();
	}

	protected void deleteSelectedGroups() {
		driver.findElement(By.name("delete")).click();
	}

	protected void selectGroup() {
		driver.findElement(By.name("selected[]")).click();
	}

}
