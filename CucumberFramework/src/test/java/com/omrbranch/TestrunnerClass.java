package com.omrbranch;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.omrbranch.stepdefinition", features = "C:\\Users\\Admin\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\BDDCucumber\\Cucumber.feature", 
plugin = {"pretty"}, 
monochrome = true)

public class TestrunnerClass{
	
}