package mmt;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MMT_test {
	WebDriver driver;

	@Test
	public void MMT() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\FLOPPY\\Automation\\vivekqa\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Google_search search = new Google_search(driver);

		Click_on_link mmt = new Click_on_link(driver);

		Login log = new Login(driver);

		To_From bookingSearch = new To_From(driver);

		search.input_your_search();

		mmt.click();

		log.login();

		bookingSearch.fromLocation();
		bookingSearch.ToLocation();
		bookingSearch.dateSelection();
		bookingSearch.search();
		bookingSearch.flightNames();
		bookingSearch.flightFare();
		bookingSearch.quit();

	}

}
