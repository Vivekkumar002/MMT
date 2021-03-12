package mmt;

import org.testng.annotations.Test;

public class MMT_test extends BaseClass {

	@Test
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

}
