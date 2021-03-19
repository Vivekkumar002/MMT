package mmt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FareDetailsInWeb extends LocatorProvider {
	RemoteWebDriver web_driver;

	public FareDetailsInWeb(RemoteWebDriver driver) {
		this.web_driver = driver;
	}

	public void flightNames() throws Exception {
		LocatorsFilePathSetter("FareDetailsInWeb");
		By flight_names = LocatorProvider("flight_names");
		By block = LocatorProvider("block");

		if (!web_driver.findElements(block).isEmpty()) {
			web_driver.findElement(block).click();
			System.out.println("notification blocked successfully");
		} else {
			System.out.println("No popup");
		}

		List<WebElement> listOfFlights = web_driver.findElements(flight_names);
		for (int i = 0; i < 3; i++) {

			String list_Of_Flights = listOfFlights.get(i).getText();
			System.out.println(list_Of_Flights);
		}
	}

	public void flightFare() throws Exception {
		LocatorsFilePathSetter("FareDetailsInWeb");
		By fare = LocatorProvider("fare");

		List<WebElement> fareOfFlights = web_driver.findElements(fare);
		for (int i = 0; i < 3; i++) {

			String fareList = fareOfFlights.get(i).getText();
			System.out.println(fareList);
		}
	}
}
