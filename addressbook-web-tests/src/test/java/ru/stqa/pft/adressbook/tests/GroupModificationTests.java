package ru.stqa.pft.adressbook.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ru.stqa.pft.adressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

	@Test
	public void TestGroupModification() {
		app.getNavigationHelper().gotoGroupPage();
		if (!app.getGrouphelper().isThereAGroup()) {
			app.getGrouphelper().createGroup(new GroupData("test1", null, null));
		}
		List <GroupData> before = app.getGrouphelper().getGroupList();
		app.getGrouphelper().selectGroup(before.size() - 1);
		app.getGrouphelper().initGroupModification();
		app.getGrouphelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
		app.getGrouphelper().submitGroupModification();
		app.getGrouphelper().returnToGroupPage();
		List <GroupData> after = app.getGrouphelper().getGroupList();
		Assert.assertTrue(after.size() == before.size());

	}

}
