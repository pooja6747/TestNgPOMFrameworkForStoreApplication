package com.StoreApp.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.StoreApp.pom.SignUp;


public class SignUpTestCases {
	WebDriver driver;




	@BeforeTest
	public void luanchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		System.out.println("Website open");
	}

	@DataProvider(name = "userData")
	public Object[][] getUserData() {
		return new Object[][] {
			{"pooja12256", "pass@12296"},
			{"ananya232323", "pass@232323"},
			{"testUser123456", "test@123456789"}
		};
	}

	@Test(dataProvider = "userData")
	public void createUser(String username, String password) {
		SignUp signup = new SignUp(driver);
		signup.createUser(username, password);
		System.out.println(username + " --- " + password);
	}

	@Test
	public void loginUser() {
		System.out.println("Enter in Login function");
		SignUp signup = new SignUp(driver);
		signup.loginWithNewUser("pooja12256", "pass@12296");
		System.out.println("Login done");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}


}
