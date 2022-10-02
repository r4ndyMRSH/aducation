package ru.stqa.pft.adressbook.tests;

import org.junit.Test;

import ru.stqa.pft.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

	@Test
	public void testContactCreation() {
		app.getNavigationHelper().gotoHomePage();
		app.getContactHelper().initContactCreation();
		app.getContactHelper()
				.fillContactForm(new ContactData("First Name", "Last Name", "9379992", "Some Adress", "test1"), true);
		app.getContactHelper().submitContactCreation();
	}

}
