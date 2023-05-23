package com.stepdefinition;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;
import com.pom.PomPage04;
import com.pom.PomPage05;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@Given("User launch the browser and url")
	public void user_launch_the_browser_and_url() throws IOException {
	   
		String url = File_Reader_Manager.getInstanceCr().getUrl();
		getUrl(url);
	}

	@When("User send the valid username")
	public void user_send_the_valid_username() {
	
		
		pom.getInstancePomPage01().getUserName().sendKeys("standard_user");
	}

	@When("User send the valid password")
	public void user_send_the_valid_password() throws InterruptedException {
	
		Thread.sleep(2000);
		
		pom.getInstancePomPage01().getPassWord().sendKeys("secret_sauce");
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
	
		
		pom.getInstancePomPage01().getLogin().click();
	}
	
	@When("User click the Sauce Labs backpack add to cart button")
	public void user_click_the_sauce_labs_backpack_add_to_cart_button() {
	   
		
		pom.getInstancePomPage01().getLogin();
	}

	@When("User click the add to cart icon")
	public void user_click_the_add_to_cart_icon() {
	 
		pom.getInstancePomPage02().getAddToCartIcon().click();
	}

	@When("User click the checkout button")
	public void user_click_the_checkout_button() {
	
		pom.getInstancePomPage03().getCheckOut().click();
	}

	@When("User send the firstname")
	public void user_send_the_firstname() {
	   
		pom.getInstancePomPage04().getFirstName().sendKeys("Arun");
	}

	@When("uers send the lastname")
	public void uers_send_the_lastname() {
	 
		pom.getInstancePomPage04().getLastName().sendKeys("kumar");
	}

	@When("user send the postal code")
	public void user_send_the_postal_code() {
	 
		pom.getInstancePomPage04().getPostalCode().sendKeys("600019");
	}

	@When("user click the continue button")
	public void user_click_the_continue_button() {
	  
		pom.getInstancePomPage04().getContinueButton().click();
	}
	
	@When("user click the Finish button")
	public void user_click_the_finish_button() {
		
		pom.getInstancePomPage05().getFinish().click();
		
	  }

	@Then("user validate the page")
	public void user_validate_the_page() {
	   
		System.out.println("Finish");
	}
}
