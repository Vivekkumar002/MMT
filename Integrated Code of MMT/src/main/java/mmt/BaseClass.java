package mmt;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public AppiumDriver<MobileElement> mob_driver;

	public void MMT() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/flights/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void quit() {
		driver.close();
		driver.quit();

	}

	public void mmtMobile() throws Exception {
		DesiredCapabilities dec = new DesiredCapabilities();
		dec.setCapability("deviceName", "Mi A1");
		dec.setCapability("platformVersion", "9.0");
		dec.setCapability("platformName", "Android");
		dec.setCapability("udid", "6f699b080504");
		dec.setCapability("appPackage", "com.makemytrip");
		dec.setCapability("appActivity", "com.mmt.travel.app.flight.ui.search.flightsearch.CorpFlightSearch");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		mob_driver = new AppiumDriver<MobileElement>(url, dec);
		mob_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
}
