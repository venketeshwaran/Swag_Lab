package com.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.baseclass.BaseClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="C:\\Users\\mages\\eclipse-workspace\\Swag_Labs_Cucumber_Project\\src\\test\\java\\com\\feature\\swag.feature",
glue="com.stepdefinition" ,
plugin = {"pretty"})
public class TestNg_Runner extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver;//null driver
	@BeforeClass
	public static void setUp() {

		driver = BaseClass.browser("chrome");
		
	}

}
