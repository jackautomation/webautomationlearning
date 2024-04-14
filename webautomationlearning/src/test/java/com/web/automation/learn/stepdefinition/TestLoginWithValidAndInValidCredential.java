package com.web.automation.learn.stepdefinition;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;

public class TestLoginWithValidAndInValidCredential {
	
	@Given("testing login url {string}")
	public void testingLoginUrl(String url) {
		try {
			URL seleniumGridUrl = new URL("http://localhost:5555");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--disable-notifications");
			
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
