package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(WebDriver driver) {
		super(driver);
	}

	public void gotoGroupPage() {
		if (isElementPresent(By.tagName("h1")) && driver.findElement(By.tagName("h1")).getText().equals("Groups")
				&& isElementPresent(By.name("new"))) {
			return;
		}
		click(By.linkText("groups"));
	}

	// Needed to improve
	public void gotoHomePage() {
		if(isElementPresent(By.id("maintable"))) {
			return;
		}
		click(By.linkText("home"));
	}

}
