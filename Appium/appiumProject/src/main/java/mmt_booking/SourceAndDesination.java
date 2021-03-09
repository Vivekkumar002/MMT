package mmt_booking;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SourceAndDesination {
	AppiumDriver<MobileElement> driver;

	public SourceAndDesination(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	By source = By.id("com.makemytrip:id/depCity");
	By destination = By.id("com.makemytrip:id/arrCity");
	By search = By.id("com.makemytrip:id/searchFlights");
	By editSource = By.id("com.makemytrip:id/city_edit_text");
	By select = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]");
	By head = By.id("com.makemytrip:id/tv_heading_new");

	public void sourceLocation(String place) throws Exception {
		driver.findElement(source).click();
		driver.findElement(editSource).sendKeys(place);
		Thread.sleep(3000);
		driver.findElement(select).click();

	}

	public void destinationLocation(String place) throws Exception {
		driver.findElement(destination).click();
		driver.findElement(editSource).sendKeys(place);
		Thread.sleep(3000);
		driver.findElement(select).click();

	}

	public void clickOnSearch() {
		driver.findElement(search).click();
	}



	public String assertion() {

		String heading = driver.findElement(head).getText();
		return heading;
	}
}
