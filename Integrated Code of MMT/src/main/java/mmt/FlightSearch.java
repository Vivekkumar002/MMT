package mmt;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightSearch extends LocatorProvider {
	WebDriver driver;

	public FlightSearch(WebDriver driver) {

		this.driver = driver;

	}

	// providing the source location
	public void searchingFlightFromLocation(String sourceLocation) throws Exception {

		LocatorsFilePathSetter("BookingPageLocators");

		By from = LocatorProvider("from");
		By source = LocatorProvider("source");
		By suggest = LocatorProvider("suggest");

		driver.findElement(from).click();
		driver.findElement(source).sendKeys(sourceLocation);
		Thread.sleep(8000);
		driver.findElement(suggest).click();
	}

	// providing the destination location
	public void searchingFlightToLocation(String desinationLocation) throws Exception {

		LocatorsFilePathSetter("BookingPageLocators");

		By suggest = LocatorProvider("suggest");
		By destination = LocatorProvider("destination");

		driver.findElement(destination).sendKeys(desinationLocation);
		Thread.sleep(8000);
		driver.findElement(suggest).click();
	}

	// selecting the sate
	public void dateSelection() throws Exception {
		LocatorsFilePathSetter("BookingPageLocators");
		By date = LocatorProvider("date");

		driver.findElement(date).click();
	}

	// clicking on search button
	public void clickOnSearch() throws Exception {
		LocatorsFilePathSetter("BookingPageLocators");

		By search = LocatorProvider("search");

		driver.findElement(search).click();
	}

	public void showingFlightNames() throws Exception {
		LocatorsFilePathSetter("BookingPageLocators");

		By flight = LocatorProvider("flight");

		List<WebElement> nameOfFlights = driver.findElements(flight); // storing all the desired flightname in a list

		List<String> flights = new ArrayList<>();
		for (int flightName = 0; flightName < 3; flightName++) { // printing the vale of top 3 suggestions
			flights.add(nameOfFlights.get(flightName).getText());
			System.out.println(nameOfFlights.get(flightName).getText());
		}
	}

	public void showingFlightFare() throws Exception { // storing all the desired flight fare in a list
		LocatorsFilePathSetter("BookingPageLocators");

		By price = LocatorProvider("price");

		List<WebElement> fareOfFlight = driver.findElements(price);

		for (int fareSequence = 0; fareSequence < 3; fareSequence++) { // printing the vale of top 3 suggestions

			String fares = fareOfFlight.get(fareSequence).getText();
			System.out.println(fares);
		}
	}

}
