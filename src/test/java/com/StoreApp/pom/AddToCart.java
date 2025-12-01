package com.StoreApp.pom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	
	WebDriver driver;
	WebDriverWait wait;
	String productName;

	// Locators
	By clickOnProduct = By.xpath("//a[contains(text(), '" + productName + "')]");
	By addTocartButton = By.xpath("//a[normalize-space()='Add to cart']");



	// Constructor
	public AddToCart(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void applyImplicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	//Action methods
	public void clickProductByName(String productName) {
	    By product = By.xpath("//a[contains(text(), '" + productName + "')]");
	    applyImplicitWait(10);
	    driver.findElement(product).click();
	    applyImplicitWait(10);
	    driver.findElement(addTocartButton).click();
	    // Wait for alert to appear
	    wait.until(ExpectedConditions.alertIsPresent());
	 // Switch to alert
	    Alert alert = driver.switchTo().alert();

	    // Print alert message
	    System.out.println("Alert Message: " + alert.getText());

	    // Click OK button
	    alert.accept();
	    System.out.println("upto end");
	}
}
