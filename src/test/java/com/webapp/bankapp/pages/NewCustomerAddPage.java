package com.webapp.bankapp.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomerAddPage extends LoginPage{
	
	public NewCustomerAddPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickaddnewcustomer() {
		
	driver.findElement(By.xpath(".//ul[@class='menusubnav']/li[2]/a")).click();
	
}
	public void addnewcust(String customername,String Gender,String dob,String Address,String City,String State,String pincode,String Phonenumber,String Mailid) {
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys(customername);
		List<WebElement> Genders = driver.findElements(By.xpath(".//table/tbody/tr[5]"));  
		if(Gender=="female" ) {
			Genders.get(1).click();
		}
		else
		Genders.get(0).click();
		driver.findElement(By.cssSelector("input[name='dob']")).sendKeys(dob);
		driver.findElement(By.name("addr")).clear();
		driver.findElement(By.name("addr")).sendKeys(Address);
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(City);
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys(State);
		driver.findElement(By.name("pinno")).clear();        
		driver.findElement(By.name("pinno")).sendKeys(pincode);
		driver.findElement(By.name("telephoneno")).clear();
		driver.findElement(By.name("telephoneno")).sendKeys(Phonenumber);
		driver.findElement(By.name("emailid")).clear();     
		driver.findElement(By.name("emailid")).sendKeys(Mailid);
		File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		// now copy the  screenshot to desired location using copyFile with timestamp
		FileUtils.copyFile(src1,Screenshot());
		}
		catch (IOException e)  
		{
		System.out.println(e.getMessage());
		}
		//driver.findElement(By.name("sub")).click();
		
	}

	}  