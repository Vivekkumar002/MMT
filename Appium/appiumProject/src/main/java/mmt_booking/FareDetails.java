package mmt_booking;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FareDetails {

	AppiumDriver<MobileElement> driver;

	public FareDetails(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	By flight_names = By.id("com.makemytrip:id/airline_name");
	By fare = By.id("com.makemytrip:id/tv_final_fare");

	public void flightNames() {

		List<MobileElement> listOfFlights = driver.findElements(flight_names);
		for (int i = 0; i < 3; i++) {

			String list_Of_Flights = listOfFlights.get(i).getText();
			System.out.println(list_Of_Flights);
		}
	}

	public void flightFare() {

		List<MobileElement> fareOfFlights = driver.findElements(fare);
		for (int i = 0; i < 3; i++) {

			String fareList = fareOfFlights.get(i).getText();
			System.out.println(fareList);
		}
	}
}
