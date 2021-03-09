package mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click_on_link {

	WebDriver driver;

	public Click_on_link(WebDriver driver) {
		this.driver = driver;}
	
	By link= By.xpath("//*[text()='MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights ...']");
	
	public void click() {
		driver.findElement(link).click();}}
