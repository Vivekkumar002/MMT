package mmt;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FareDetailsInApp extends LocatorProvider {

	AppiumDriver<MobileElement> mob_driver;

	public FareDetailsInApp(AppiumDriver<MobileElement> driver) {
		this.mob_driver = driver;
	}

	public void flightNames() throws Exception {
		LocatorsFilePathSetter("FareDetails");
		By flight_names = LocatorProvider("flight_names");

		List<MobileElement> listOfFlights = mob_driver.findElements(flight_names);
		for (int i = 0; i < 3; i++) {

			String list_Of_Flights = listOfFlights.get(i).getText();
			System.out.println(list_Of_Flights);
		}
	}

	public void flightFare() throws Exception {
		LocatorsFilePathSetter("FareDetails");
		By fare = LocatorProvider("fare");

		List<MobileElement> fareOfFlights = mob_driver.findElements(fare);
		for (int i = 0; i < 3; i++) {

			String fareList = fareOfFlights.get(i).getText();
			System.out.println(fareList);
		}
	}
}
