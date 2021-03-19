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
		for (int flightSequence = 0; flightSequence < 3; flightSequence++) {

			String list_Of_Flights = listOfFlights.get(flightSequence).getText();
			System.out.println(list_Of_Flights);
		}
	}

	public void flightFare() throws Exception {
		LocatorsFilePathSetter("FareDetails");
		By fare = LocatorProvider("fare");

		List<MobileElement> fareOfFlights = mob_driver.findElements(fare);
		for (int fareSequence = 0; fareSequence < 3; fareSequence++) {

			String fareList = fareOfFlights.get(fareSequence).getText();
			System.out.println(fareList);
		}
	}
}
