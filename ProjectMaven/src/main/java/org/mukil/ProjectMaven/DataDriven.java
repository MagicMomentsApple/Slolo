package org.mukil.ProjectMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\3\\eclipse-workspace\\Nirai\\ProjectMaven\\Sheet\\Book1.xlsx");

		FileInputStream s = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(s);
		Sheet s1 = w.getSheet("mukilan");
		for (int i = 0; i <s1.getPhysicalNumberOfRows(); i++) {
			Row r = s1.getRow(i);
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
	 int type = c.getCellType();
	 if (type==1) {
		 String name = c.getStringCellValue();
		System.out.println(name);
	}
	 if (type==0) {
		if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat f=new SimpleDateFormat("dd-mm-yy");
	        String date = f.format(d);
			System.out.println(date);
		}
		else {
			double cellValue = c.getNumericCellValue();
			long l=(long)cellValue;
			
			
			String number = String.valueOf(l);
			System.out.println(number);
		}
	}}
}}}