package mmt;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SourceAndDesinationInApp extends LocatorProvider {
	AppiumDriver<MobileElement> mob_driver;

	public SourceAndDesinationInApp(AppiumDriver<MobileElement> driver) {
		this.mob_driver = driver;
	}

	public void sourceLocation(String place) throws Exception {

		LocatorsFilePathSetter("SourceAndDestination");
		By editSource = LocatorProvider("editSource");
		By source = LocatorProvider("source");
		By select = LocatorProvider("select");
		System.out.println(source);
		mob_driver.findElement(source).click();
		mob_driver.findElement(editSource).sendKeys(place);
		Thread.sleep(2000);
		mob_driver.findElement(select).click();

	}

	public void destinationLocation(String place) throws Exception {

		LocatorsFilePathSetter("SourceAndDestination");
		By editSource = LocatorProvider("editSource");
		By destination = LocatorProvider("destination");
		By select = LocatorProvider("select");

		mob_driver.findElement(destination).click();
		mob_driver.findElement(editSource).sendKeys(place);
		Thread.sleep(2000);
		mob_driver.findElement(select).click();

	}

	public void clickOnSearch() throws Exception {
		LocatorsFilePathSetter("SourceAndDestination");
		By search = LocatorProvider("search");

		mob_driver.findElement(search).click();
	}

	public String assertion() throws Exception {
		LocatorsFilePathSetter("SourceAndDestination");
		By head = LocatorProvider("head");

		String heading = mob_driver.findElement(head).getText();
		return heading;
	}
}
