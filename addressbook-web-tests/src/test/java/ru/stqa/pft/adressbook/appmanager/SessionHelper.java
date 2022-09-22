package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
	
	private WebDriver driver;

	public SessionHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void login(String login, String password) {
		driver.get("http://localhost/addressbook/");
		driver.findElement(By.name("user")).click();
		driver.findElement(By.name("user")).sendKeys(login);
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.cssSelector("input:nth-child(7)")).click();
	}

}
