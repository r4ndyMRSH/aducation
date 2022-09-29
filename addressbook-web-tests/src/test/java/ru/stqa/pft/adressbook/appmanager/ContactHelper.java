package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ru.stqa.pft.adressbook.model.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(WebDriver driver) {
		super(driver);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contactData) {
		type(By.name("firstname"), contactData.getFirstName());
		click(By.name("lastname"));
		type(By.name("lastname"), contactData.getLastName());
		click(By.name("mobile"));
		type(By.name("mobile"), contactData.getMobilePhone());
		click(By.name("address2"));
		type(By.name("address2"), contactData.getAdress());

	}

	public void submitContactCreation() {
		click(By.cssSelector("input:nth-child(87)"));
		click(By.linkText("home page"));
	}

	public void selectContact() {
		click(By.cssSelector("tr:nth-child(2) > .center:nth-child(8) img"));
		
	}

	public void deleteSelectedContact() {
		click(By.cssSelector("input:nth-child(2)"));	
	}

	public void confirmContactDeletion() {
		driver.switchTo().alert().accept();
		
	}

}
