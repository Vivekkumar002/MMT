package appiumProject;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Appium_first {
	static AppiumDriver<MobileElement> driver;
	

	public static void main(String[] args) {
		try {
		calculator();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	public static void calculator() throws Exception {
		DesiredCapabilities dec= new DesiredCapabilities();
		dec.setCapability("deviceName", "Mi A1");
		dec.setCapability("platformVersion", "9.0");
		dec.setCapability("platformName", "Android");
		dec.setCapability("udid", "6f699b080504");
		dec.setCapability("appPackage", "com.google.android.calculator");
		dec.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url,dec);
		System.out.println("Calculator");
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
		
		String value = driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();	
		System.out.println(value);
		Assert.assertEquals(value, "23");
	
	}
		
		


}

