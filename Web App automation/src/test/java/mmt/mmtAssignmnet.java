package mmt;

import org.testng.annotations.Test;

public class mmtAssignmnet extends BaseClass {

	public void mmt() {

		try {
			MMT();

			Login loginToMMT = new Login(driver);
			FlightSearch bookingSearch = new FlightSearch(driver);

			loginToMMT.login();

			bookingSearch.searchingFlightFromLocation("Kolkata");
			bookingSearch.searchingFlightToLocation("Delhi");
			bookingSearch.dateSelection();
			bookingSearch.clickOnSearch();
			bookingSearch.showingFlightNames();
			bookingSearch.showingFlightFare();

			quit();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void mmtBookingInMobile() {

		try {
			mmtMobile();

			SourceAndDesinationInApp searchFlight = new SourceAndDesinationInApp(mob_driver);

			FareDetailsInApp fare = new FareDetailsInApp(mob_driver);

			searchFlight.sourceLocation("Pune");
			searchFlight.destinationLocation("Goa");
			searchFlight.clickOnSearch();

			fare.flightNames();
			fare.flightFare();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void mmtBookingUsingWebApp() {

		try {
			mmtWebApp();

			FlightSearchInWebApp searchFlight = new FlightSearchInWebApp(web_driver);

			FareDetailsInWeb fare = new FareDetailsInWeb(web_driver);

			searchFlight.sourceLocation("Pune");
			searchFlight.destinationLocation("Goa");
			searchFlight.clickOnSearch();

			fare.flightNames();
			fare.flightFare();
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	@Test
	public void platformSelecion() {
		String platform = "WebApp";

		if (platform == "Mobile") {
			mmtBookingInMobile();
		}
		if (platform == "Desktop") {
			mmt();
		}
		if (platform == "WebApp") {
			mmtBookingUsingWebApp();
		}

	}

}
