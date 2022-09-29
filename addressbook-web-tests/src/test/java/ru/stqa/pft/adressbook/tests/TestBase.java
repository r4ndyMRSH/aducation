package ru.stqa.pft.adressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.BrowserType;

import ru.stqa.pft.adressbook.appmanager.ApplicationManager;

public class TestBase {
	
	//delegation
	protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

	@Before
	public void setUp() {
	
		app.init();
	}

	@After
	public void tearDown() {
		app.stop();
	}

}
