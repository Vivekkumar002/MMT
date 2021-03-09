package mmt;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class To_From {
	WebDriver driver;

	public To_From(WebDriver driver) {
		this.driver = driver;
	}

	By from = By.id("fromCity");
	By source = By.xpath("//input[@placeholder=\"From\"]");
	By suggest = By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]");
	By destination = By.xpath("//input[@placeholder=\"To\"]");
	By date = By.xpath("//div[@aria-label=\"Tue Mar 09 2021\"]");
	By search = By.xpath("//a[@class=\"primaryBtn font24 latoBold widgetSearchBtn \"]");
	By flightName = By.cssSelector("span[class='airways-name ']");
	By loc = By.xpath("//div[@class='makeFlex perfectCenter appendRight15']");
	By price = By.xpath("//div[@class='appendRight12 textRight flexOne']");

	public void fromLocation() throws Exception {

		driver.findElement(from).click();
		driver.findElement(source).sendKeys("kolkata");
		Thread.sleep(6000);

		driver.findElement(suggest).click();
	}

	public void ToLocation() throws Exception {
		driver.findElement(destination).sendKeys("Delhi");
		Thread.sleep(3000);
		driver.findElement(suggest).click();
	}

	public void dateSelection() {

		driver.findElement(date).click();
	}

	public void search() {
		driver.findElement(search).click();
	}

	public void flightNames() {
		List<WebElement> myList = driver.findElements(loc);

		List<String> all_elements_text = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			all_elements_text.add(myList.get(i).getText());
			System.out.println(myList.get(i).getText());
		}
	}

	public void flightFare() {

		List<WebElement> listElement = driver.findElements(price);
		for (int i = 0; i < 3; i++) {

			String elementText = listElement.get(i).getText();
			System.out.println(elementText);
		}
	}

	public void quit() {
		driver.close();
		driver.quit();

	}

}
