package ru.stqa.pft.adressbook.tests;

import org.junit.After;
import org.junit.Before;

import ru.stqa.pft.adressbook.appmanager.ApplicationManager;

public class TestBase {
	
	//delegation
	protected final ApplicationManager app = new ApplicationManager();

	@Before
	public void setUp() {
	
		app.init();
	}

	@After
	public void tearDown() {
		app.stop();
	}

}
