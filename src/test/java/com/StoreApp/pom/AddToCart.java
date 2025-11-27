package com.StoreApp.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	
	WebDriver driver;
	WebDriverWait wait;
	String productName;

	// Locators
	By clickOnProduct = By.xpath("//a[contains(text(), '" + productName + "')]");



	// Constructor
	public AddToCart(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	//Action methods
	public void clickProductByName(String productName) {
	    By product = By.xpath("//a[contains(text(), '" + productName + "')]");
	    driver.findElement(product).click();
	}
}
