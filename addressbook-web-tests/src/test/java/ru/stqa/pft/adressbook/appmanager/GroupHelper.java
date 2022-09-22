package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.stqa.pft.adressbook.model.GroupData;

public class GroupHelper {

	private WebDriver driver;
	
	public GroupHelper(WebDriver driver2) {
		this.driver = driver2;
	}

	public void returnToGroupPage() {
		driver.findElement(By.linkText("group page")).click();
	}

	public void submitGroupCreation() {
		driver.findElement(By.name("submit")).click();
	}

	public void fillGroupForm(GroupData groupData) {
		driver.findElement(By.name("group_name")).click();
		driver.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
		driver.findElement(By.name("group_header")).click();
		driver.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
		driver.findElement(By.name("group_footer")).click();
		driver.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
	}

	public void initGroupCreation() {
		driver.findElement(By.name("new")).click();
	}

	public void deleteSelectedGroups() {
		driver.findElement(By.name("delete")).click();
	}

	public void selectGroup() {
		driver.findElement(By.name("selected[]")).click();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
