package com.pomfw.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	//this method is used to read the data into excel
	public String read_XL_Data(String path,String sheet,int rowno,int cellno) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String data= wb.getSheet(sheet).getRow(rowno).getCell(cellno).toString();
		return data;
	}
	
	
	//this method is use to write the data into excel
	
	public void  write_XL_Data(String path,String sheet,int rowno,int cellno,String data) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		wb.getSheet(sheet).getRow(rowno).createCell(cellno).setCellValue(data);
		wb.write(new FileOutputStream(path));
	}
	
	
	// this method is used to count number of data rows
	
	public int  xlRowCount_XL_Data(String path,String sheet) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
		
	}
	
	
	
	//this method is used to count the number of cell in row
	public int  xlCellCount_XL_Data(String path,String sheet,int rowno) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		int cellCount = wb.getSheet(sheet).getRow(rowno).getLastCellNum();
		return cellCount;
		
	}



}
