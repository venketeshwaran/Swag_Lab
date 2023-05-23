package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties pro;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\mages\\eclipse-workspace\\Swag_Labs_Cucumber_Project\\src\\test\\java\\com\\helper\\swag.properties");
	
		FileInputStream fis = new FileInputStream(f);
		
		 pro = new Properties();
		
		pro.load(fis);

	}

	public String getBrowser() {

		String browser = pro.getProperty("browser");
		
		return browser;
		
	}
	
	public String getUrl() {

		String url = pro.getProperty("url");
		
		return url;
	}

}
