package com.StoreApp.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	
	WebDriver driver;
	WebDriverWait wait;

	// Locators
	By clickOnProduct = By.xpath("//body/div[@id='contcont']/div[@class='row']/div[@class='col-lg-9']/div[@id='tbodyid']/div[1]");


	// Constructor
	public AddToCart(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	//Action methods
	public void productAddToCart() {
		driver.findElement(clickOnProduct).click();
	}
}
