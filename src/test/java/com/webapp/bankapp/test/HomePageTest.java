package com.webapp.bankapp.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webapp.bankapp.pages.LoginPage;
import com.webapp.bankapp.pages.NewCustomerAddPage;
import com.webapp.bankapp.utils.ExcelUtils;

public class HomePageTest extends BaseTest {

	@Test
	public void clickonAddCustomer() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.resetidpassword();
		lp.Loginwithidpwd();
		NewCustomerAddPage Np = new NewCustomerAddPage(driver);
		Np.clickaddnewcustomer();
		      
	}

	
@Test(dataProvider="getcustdata")     
public void newcustomerdata(String customername,String Gender,String dob,String Address,String City,String State,String pincode,String Phonenumber,String Mailid) {
	NewCustomerAddPage Np = new NewCustomerAddPage(driver);
	Np.clickaddnewcustomer();
	Np.addnewcust(customername, Gender, dob, Address, City, State, pincode, Phonenumber, Mailid);
}	

@DataProvider
public static Iterator<Object[]> getcustdata() throws IOException {

ArrayList<Object[]> testdata = ExcelUtils.Readcustdatafromexcel();
return testdata.iterator();
	
}
}
