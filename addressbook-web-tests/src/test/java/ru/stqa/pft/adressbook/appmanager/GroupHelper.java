package ru.stqa.pft.adressbook.appmanager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.stqa.pft.adressbook.model.GroupData;

public class GroupHelper extends HelperBase {

	public GroupHelper(WebDriver driver) {
		super(driver);
	}

	public void returnToGroupPage() {
		click(By.linkText("group page"));
	}

	public void submitGroupCreation() {
		click(By.name("submit"));
	}

	public void fillGroupForm(GroupData groupData) {
		type(By.name("group_name"), groupData.getGroupName());
		click(By.name("group_header"));
		type(By.name("group_header"), groupData.getGroupHeader());
		click(By.name("group_footer"));
		type(By.name("group_footer"), groupData.getGroupFooter());
	}

	public void initGroupCreation() {
		click(By.name("new"));
	}

	public void deleteSelectedGroups() {
		click(By.name("delete"));
	}

	public void selectGroup() {
		click(By.name("selected[]"));
	}

	public void selectGroup(int index) {
		driver.findElements(By.name("selected[]")).get(index).click();
		// TODO Auto-generated method stub
		
	}

	public void initGroupModification() {
		click(By.name("edit"));

	}

	public void submitGroupModification() {
		click(By.name("update"));

	}

	public void createGroup(GroupData group) {
		initGroupCreation();
		fillGroupForm(group);
		submitGroupCreation();
		returnToGroupPage();

	}

	public boolean isThereAGroup() {

		return isElementPresent(By.name("selected[]"));

	}

	public int getGroupCount() {
		return driver.findElements(By.name("selected[]")).size();
	}

	public List<GroupData> getGroupList() {
		
		List<GroupData> groups = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
		for(WebElement element : elements) {
			String name = element.getText();
			int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
			GroupData group = new GroupData(id, name, null, null);
			groups.add(group);
		}
		return groups;
	}

//	public WebDriver getDriver() {
//		return driver;
//	}

}
