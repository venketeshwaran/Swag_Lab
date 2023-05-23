package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private PomPage01 p;
	
	private PomPage02 p1;
	
	private PomPage03 p2;
	
	private PomPage04 p3;

	private PomPage05 p4;
	
	
	public Page_Object_Manager(WebDriver driver2) {

		this.driver=driver2;
		
	}

	public PomPage01 getInstancePomPage01() {

		p = new PomPage01(driver);
		
		return p;
	}
	
	public PomPage02 getInstancePomPage02() {

		p1 = new PomPage02(driver);
		
		return p1;
	}
	
	public PomPage03 getInstancePomPage03() {

		p2 = new PomPage03(driver);
		
		return p2;
	}
	
	public PomPage04 getInstancePomPage04() {

		p3 = new PomPage04(driver);
		
		return p3;
	}
	
	public PomPage05 getInstancePomPage05() {

		p4 = new PomPage05(driver);
		
		return p4;
	}
	
	
	

}
