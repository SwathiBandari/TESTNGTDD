package com.webapp.bankapp.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public Properties returnprop() throws IOException {
		FileInputStream fis = new FileInputStream("resources/Datasource.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
	public File Screenshot() {
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File dest= new File("C:\\Users\\sbandari\\Desktop\\bankapp\\"+"FormPage"+"_"+timestamp+".jpg");
		return dest;
				
	
	
}}
