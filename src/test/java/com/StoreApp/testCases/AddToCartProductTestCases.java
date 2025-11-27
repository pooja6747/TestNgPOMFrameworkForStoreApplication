package com.StoreApp.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.StoreApp.pom.AddToCart;
import com.StoreApp.pom.SignUp;

public class AddToCartProductTestCases {
	WebDriver driver;




	@BeforeTest
	public void luanchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		System.out.println("Website open");
	}


	@Test
	public void addProductToCart() {
		System.out.println("Enter in AddToCart function");
		AddToCart addToCart = new AddToCart(driver);
		addToCart.productAddToCart();
		System.out.println("addProductToCart done");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
