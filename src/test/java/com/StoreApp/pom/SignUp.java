package com.StoreApp.pom;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {


	WebDriver driver;
	WebDriverWait wait;

	// Locators
	By signupLink = By.id("signin2");
	By usernameField = By.id("sign-username");
	By passwordField = By.id("sign-password");
	By signupButton = By.xpath("//button[text()='Sign up']");
	By closeButton = By.xpath("//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']");
	By loginLink = By.xpath("//a[@id='login2']");
	By usernameFeild1 = By.xpath("//input[@id='loginusername']");
	By passwordFeild1 = By.xpath("//input[@id='loginpassword']");
	By loginButton = By.xpath("//button[normalize-space()='Log in']");


	// Constructor
	public SignUp(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}



	public WebElement waitForElement(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void applyImplicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void clearField(By locator) {
		WebElement ele = waitForElement(locator);
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.DELETE);
	}

	public void createUser(String uname, String pass) {

		waitForElement(signupLink).click();
		// Clear old values

		clearField(usernameField);
		waitForElement(usernameField).sendKeys(uname);
		clearField(passwordField);
		waitForElement(passwordField).sendKeys(pass);

		waitForElement(signupButton).click();

		System.out.println("Upto sgnup done");
		// Wait for alert
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		System.out.println("After alert click sgnup done");
		driver.findElement(By.xpath("//div[@id='signInModal']//button[@aria-label='Close']")).click();

	}

	public void loginWithNewUser(String uname, String pass) {
		System.out.println("loginWithNewUser done");
		applyImplicitWait(10);
		driver.findElement(loginLink).click();
		applyImplicitWait(10);
		driver.findElement(usernameFeild1).sendKeys(uname);
		applyImplicitWait(10);
		driver.findElement(passwordFeild1).sendKeys(pass);
		applyImplicitWait(10);
		driver.findElement(loginButton).click();
	}
}



