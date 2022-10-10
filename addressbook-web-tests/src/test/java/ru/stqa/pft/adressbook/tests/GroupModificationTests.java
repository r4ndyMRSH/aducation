package ru.stqa.pft.adressbook.tests;

import java.util.Comparator;
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
		List<GroupData> before = app.getGrouphelper().getGroupList();
		app.getGrouphelper().selectGroup(before.size() - 1);
		app.getGrouphelper().initGroupModification();
		GroupData group = new GroupData(before.get(before.size() - 1).getId(), "test1", "test2", "test3");
		app.getGrouphelper().fillGroupForm(group);
		app.getGrouphelper().submitGroupModification();
		app.getGrouphelper().returnToGroupPage();
		List<GroupData> after = app.getGrouphelper().getGroupList();
		Assert.assertTrue(after.size() == before.size());

		before.remove(before.size() - 1);
		before.add(group);
//Using Lambda
		Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
		before.sort(byId);
		after.sort(byId);

		Assert.assertEquals(before, after);
//		Assert.assertEquals(new HashSet <Object>(before),new HashSet <Object> (after));

	}

}
