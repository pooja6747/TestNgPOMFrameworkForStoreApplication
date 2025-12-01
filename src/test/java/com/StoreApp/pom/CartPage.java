package com.StoreApp.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	WebDriverWait wait;
	String productName;

	// Locators
	By placeOrderButton = By.xpath("//button[normalize-space()='Place Order']");
	
	// Constructor
		public CartPage(WebDriver driver) {
			this.driver = driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		}
		
	
		//Action methods
		public void placeOrderButton() {
			driver.findElement(placeOrderButton).click();
		}
	
	

}
