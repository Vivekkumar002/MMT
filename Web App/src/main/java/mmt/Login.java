package mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends LocatorProvider {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void login() throws Exception {
		LocatorsFilePathSetter("LoginPageLocators");
		By login = LocatorProvider("login");
		By outsideModel = LocatorProvider("outsideModel");

		if (!driver.findElements(login).isEmpty()) { // if login pop-up will appear then we have to click outside.
			driver.findElement(outsideModel).click();
			System.out.println("Successfully clicked outside");
		} else {
			System.out.println("No login popup"); // if login pop-up will not appear.
		}
	}
}
