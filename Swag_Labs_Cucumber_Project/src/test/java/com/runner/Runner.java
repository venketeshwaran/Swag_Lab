package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\mages\\eclipse-workspace\\Swag_Labs_Cucumber_Project\\src\\test\\java\\com\\feature\\swag.feature",
                   glue="com.stepdefinition" ,
                   monochrome = true ,
                   dryRun = false,
                   plugin= {"pretty" , "html:target/Cucumber-Report.html" ,
                		   "json:target/Cucumber-JsonReport.json" ,
                		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner {

	public static WebDriver driver;//null driver
	@BeforeClass
	public static void setUp() throws IOException {

		String browser = File_Reader_Manager.getInstanceCr().getBrowser();
		driver = BaseClass.browser(browser);
		
	}
	
}
