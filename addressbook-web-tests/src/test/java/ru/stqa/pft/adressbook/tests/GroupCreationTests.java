package ru.stqa.pft.adressbook.tests;

// Generated by Selenium IDE
import org.junit.Test;

import ru.stqa.pft.adressbook.model.GroupData;


public class GroupCreationTests extends TestBase{
	@Test
	public void testGroupCreation() {

		app.getNavigationHelper().gotoGroupPage();
		app.getGrouphelper().initGroupCreation();
		app.getGrouphelper().fillGroupForm(new GroupData("test1", null, null));
		app.getGrouphelper().submitGroupCreation();
		app.getGrouphelper().returnToGroupPage();
	}
}
