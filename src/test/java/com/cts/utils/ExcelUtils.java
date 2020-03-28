package com.cts.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static String[][] getsheetIntoStringArray(String fileDetails, String sheetName) throws IOException
	{
	FileInputStream file = null;
	XSSFWorkbook book = null;
	String[][] main = null;
	try
	{

	file = new FileInputStream(fileDetails);
	book = new XSSFWorkbook(file);
	XSSFSheet sheet = book.getSheet(sheetName);
	int rowCount = sheet.getPhysicalNumberOfRows();
	System.out.println(rowCount);
	int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println(cellCount);
	      main = new String[rowCount-1][cellCount];

	for(int i=1;i<rowCount;i++)
	{
	XSSFRow row = sheet.getRow(i);

	for(int j=0;j<cellCount;j++)
	{
	XSSFCell cell = row.getCell(j);
	DataFormatter format = new DataFormatter();
	String cellValue= format.formatCellValue(cell);
	System.out.println(cellValue);
	main[i-1][j]=cellValue;
	}
	System.out.println();
	}
	}

	catch(Exception e) {
	e.printStackTrace();
	}

	finally {

	book.close();
	file.close();

	}
	return main;

	}

}


