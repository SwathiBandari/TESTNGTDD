package com.webapp.bankapp.utils;

import java.util.ArrayList;

public class ExcelUtils {
	static Xls_Reader reader;

	public static ArrayList<Object[]> Readcustdatafromexcel() {
		ArrayList<Object[]> custdata = new ArrayList<Object[]>();
		
		try {
			reader = new Xls_Reader("resources/NewCustomerdata.xlsx");
			}
		catch(Exception e){
			e.printStackTrace();
		}
		for(int rownum=2;rownum<=reader.getRowCount("sheet1");rownum++) {
			String customername = reader.getCellData("sheet1", "CustomerName", rownum);
			String Gender = reader.getCellData("sheet1", "Gender", rownum);
			String dob	= reader.getCellData("sheet1", "DateofBirth", rownum);
			String Address = reader.getCellData("sheet1", "Address", rownum);
			String City = reader.getCellData("sheet1", "City", rownum);
			String State = reader.getCellData("sheet1", "State", rownum);
			String pincode = reader.getCellData("sheet1", "PIN", rownum);
			String Phonenumber = reader.getCellData("sheet1", "TelephoneNumber", rownum);
			String Mailid = reader.getCellData("sheet1", "Email", rownum);
			Object obj[] = {customername,Gender,dob,Address,City,State,pincode,Phonenumber,Mailid};
		custdata.add(obj);
	}
		return custdata;
		
	}}
