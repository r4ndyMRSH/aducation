package ru.stqa.pft.adressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ru.stqa.pft.adressbook.model.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(WebDriver driver) {
		super(driver);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contactData, boolean  creation) {
		type(By.name("firstname"), contactData.getFirstName());
		click(By.name("lastname"));
		type(By.name("lastname"), contactData.getLastName());
		click(By.name("mobile"));
		type(By.name("mobile"), contactData.getMobilePhone());
		click(By.name("address2"));
		type(By.name("address2"), contactData.getAdress());
		if(creation) {
			new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
		} else {
			Assert.assertFalse(isElementPresent(By.name("new_group")));
		}
	}

	
	public void submitContactCreation() {
		click(By.cssSelector("input:nth-child(87)"));
		click(By.linkText("home page"));
	}

	public void selectContact() {
		click(By.name("selected[]"));

	}

	public void deleteSelectedContact() {
		click(By.cssSelector(".left:nth-child(8) > input"));
		driver.switchTo().alert().accept();
	}

	public void confirmContactDeletion() {
		driver.switchTo().alert().accept();

	}

	public boolean isThereAContact() {
		return (isElementPresent(By.name("selected[]")) && isElementPresent(By.name("MainForm")));
	}

	public void createContact(ContactData contactData) {
		initContactCreation();
		fillContactForm(contactData, true);
		submitContactCreation();
		
	}

}
