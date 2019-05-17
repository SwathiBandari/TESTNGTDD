package com.webapp.bankapp.utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	String cellValue;
	Sheet custdatasheet;
	Row Row;
	Cell cell;
	public static Object[][] Logindata;

	public Object[][] Readcustdata() throws IOException {
		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter data = new DataFormatter();
		FileInputStream custfile = new FileInputStream("resources/NewCustomerdata.xlsx");
		Workbook wb = new XSSFWorkbook(custfile);
		custdatasheet = wb.getSheetAt(0);
		int rowcount = custdatasheet.getLastRowNum();
		int colcount = custdatasheet.getRow(0).getLastCellNum();
		Logindata = new Object[rowcount][colcount];
		System.out.println("Row count ---"+rowcount);
		for (int rCnt = 1; rCnt < rowcount; rCnt++) {
			for (int cCnt = 0; cCnt < colcount; cCnt++) {
				Logindata[rCnt-1][cCnt] = custdatasheet.getRow(rCnt).getCell(cCnt);
				System.out.println(Logindata[rCnt-1][cCnt]);
			}
			System.out.println("in each row----->" + Logindata);
			}
		System.out.println("After whole function -->>>" + Logindata);
		return Logindata;
		//added
	}
}

//				FileInputStream custfile = new FileInputStream("resources/NewCustomerdata.xlsx");
//				Workbook wb = new XSSFWorkbook(custfile);
//				Sheet custdata = wb.getSheetAt(0);
//				// 1. You can obtain a rowIterator and columnIterator and iterate over them
//				System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
//				Iterator<Row> rowIterator = custdata.rowIterator();
//				while (rowIterator.hasNext()) {
//
//					Row row = rowIterator.next();
//					if (row.getRowNum() == 0) {
//						row = rowIterator.next();
//					}
//					// Now let's iterate over the columns of the current row
//					Iterator<Cell> cellIterator = row.cellIterator();
//
//					while (cellIterator.hasNext()) {
//						Cell cell = cellIterator.next();
//						cellValue = data.formatCellValue(cell);
//						System.out.print(cellValue + "\t");
