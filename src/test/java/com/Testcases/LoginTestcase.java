package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTestcase {
	
	public WebDriver driver;
	
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	          driver = new FirefoxDriver();
		
	    
	}

	@Given("^Enter the URL$")
	public void enter_the_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://amazon.in");
	    
	}

	@Then("^maximize the browser$")
	public void maximize_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
	    
	}

	@Then("^enter the valid credential$")
	public void enter_the_valid_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println();
		driver.quit();
		
	    
	}



}
