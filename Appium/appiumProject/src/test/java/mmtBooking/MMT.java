package mmtBooking;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mmt_booking.FareDetails;
import mmt_booking.SourceAndDesination;

public class MMT {
	AppiumDriver<MobileElement> driver;

	@Test
	public void mmtFlightBooking() throws Exception {
		DesiredCapabilities dec = new DesiredCapabilities();
		dec.setCapability("deviceName", "Mi A1");
		dec.setCapability("platformVersion", "9.0");
		dec.setCapability("platformName", "Android");
		dec.setCapability("udid", "6f699b080504");
		dec.setCapability("appPackage", "com.makemytrip");
		dec.setCapability("appActivity", "com.mmt.travel.app.flight.ui.search.flightsearch.CorpFlightSearch");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, dec);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		SourceAndDesination searchFlight = new SourceAndDesination(driver);

		FareDetails fare = new FareDetails(driver);

		searchFlight.sourceLocation("Delhi");
		searchFlight.destinationLocation("Pune");
		searchFlight.clickOnSearch();

		fare.flightNames();
		fare.flightFare();
		

	}
}
