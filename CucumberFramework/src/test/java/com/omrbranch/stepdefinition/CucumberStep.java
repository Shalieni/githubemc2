package com.omrbranch.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStep {
	WebDriver driver = new ChromeDriver();
	@Given("User is on the Grocery Login Page")
	public void user_is_on_the_grocery_login_page() {
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("User enters Username and Password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("Shalinidharmendran@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shalinishalu@96");
	    // Write code here that turns the phrase above into concrete actions
	
	}
	@When("User clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("//button['@value=login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	}



}
