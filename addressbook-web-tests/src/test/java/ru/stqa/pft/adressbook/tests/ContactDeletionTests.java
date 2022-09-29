package ru.stqa.pft.adressbook.tests;

import org.junit.Test;

public class ContactDeletionTests extends TestBase {
	
	@Test
	public void testContactDeletion() {
		app.getNavigationHelper().gotoHomePage();
		app.getContactHelper().selectContact();
		app.getContactHelper().deleteSelectedContact();
//		app.getContactHelper().confirmContactDeletion();
		app.getNavigationHelper().gotoHomePage();
	}

}
