package mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google_search {
	WebDriver driver;
	
	
	public Google_search(WebDriver driver) {
		this.driver= driver;}
	
	By searchBox= By.name("q");
	By click= By.xpath("//input[@data-ved='0ahUKEwjUkKn3tpbvAhUm6XMBHaPcAyIQ4dUDCAs']");

	public void input_your_search() {
		
		driver.findElement(searchBox).sendKeys("MMT \n");}}
