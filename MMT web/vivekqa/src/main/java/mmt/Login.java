package mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;}
	
	By arrow = By.className("rightArrow pushRight");
	By flight = By.className("chNavIcon appendBottom2 chSprite chFlights active");
	By login = By.cssSelector("[data-cy=\"googleLogin\"]");
	By outside = By.cssSelector("[data-cy=\"outsideModal\"]");

	public void login() throws Exception {
		if(!driver.findElements(login).isEmpty()){
			driver.findElement(outside).click();
	       // driver.findElement(flight).click();
	    }else{
	        System.out.println("No login popup");
}}}
