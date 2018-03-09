package com.tt.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestRunner {
@CucumberOptions (
			
			features = {"Feature"},
			
			
			glue = {"stepdefs"}
			)
	
	public class TestRunner extends AbstractTestNGCucumberTests{}
}
	



