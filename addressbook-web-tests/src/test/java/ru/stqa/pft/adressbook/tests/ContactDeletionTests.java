package ru.stqa.pft.adressbook.tests;

import org.junit.Test;

import ru.stqa.pft.adressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {
	
	@Test
	public void testContactDeletion() {
		app.getNavigationHelper().gotoHomePage();
		if (!app.getContactHelper().isThereAContact()) {
			app.getContactHelper().createContact(new ContactData("First Name", "Last Name", "9379992", "Some Adress", "test1"));
		}
		app.getContactHelper().selectContact();
		app.getContactHelper().deleteSelectedContact();
		app.getNavigationHelper().gotoHomePage();
	}

}
