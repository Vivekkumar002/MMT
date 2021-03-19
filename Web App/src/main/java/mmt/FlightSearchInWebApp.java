package mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FlightSearchInWebApp extends LocatorProvider {
	RemoteWebDriver web_driver;

	public FlightSearchInWebApp(RemoteWebDriver driver) {
		this.web_driver = driver;
	}
	
	public void sourceLocation(String place) throws Exception {

		LocatorsFilePathSetter("FlightSearchInWebApp");
		By close = LocatorProvider("close");
		By flight = LocatorProvider("flight");
		By inputLocation = LocatorProvider("inputLocation");
		By source = LocatorProvider("source");
		By select = LocatorProvider("select");
		
		
		web_driver.findElement(close).click();
		web_driver.findElement(flight).click();
		web_driver.findElement(source).click();
		web_driver.findElement(inputLocation).sendKeys(place);
		Thread.sleep(2000);
		web_driver.findElement(select).click();

	}

	public void destinationLocation(String place) throws Exception {

		LocatorsFilePathSetter("FlightSearchInWebApp");
		By inputLocation = LocatorProvider("inputLocation");
		By select = LocatorProvider("select");

		web_driver.findElement(inputLocation).sendKeys(place);
		Thread.sleep(2000);
		web_driver.findElement(select).click();

	}

	public void clickOnSearch() throws Exception {
		LocatorsFilePathSetter("FlightSearchInWebApp");
		By search = LocatorProvider("search");

		web_driver.findElement(search).click();
	}

}

