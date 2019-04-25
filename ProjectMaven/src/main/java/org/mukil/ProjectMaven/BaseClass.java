package org.mukil.ProjectMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static String getdata(int row,int cell) throws IOException {
		File loc = new File("C:\\Users\\3\\eclipse-workspace\\Nirai\\ProjectMaven\\Sheet\\Book1.xlsx");
		FileInputStream s = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(s);
		Sheet s1 = w.getSheet("mukilan");
		Row r = s1.getRow(row);
		Cell c = r.getCell(cell);
	 int type = c.getCellType();
	 String name=null;
	 if (type==1) {
		 name = c.getStringCellValue();
	}
	 else {
		if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat f=new SimpleDateFormat("dd-mm-yy");
	        String date = f.format(d);
			System.out.println(date);
		}
		else {
			double cellValue = c.getNumericCellValue();
			long l=(long)cellValue;
			name=String.valueOf(l);
		}
	}
	 return name;
	}
public static WebDriver Browser(String url) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\3\\eclipse-workspace\\Nirai\\MavenPro\\driv\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	return driver;
}
public static void type(WebElement element, String name) {
	element.sendKeys(name);
}
public static void clickbtn(WebElement element) {
	element.click();
}
public static void closeBrowser(WebDriver driver) {
	driver.quit();
}
public static void dropDown(WebElement element, String name) {
	Select s = new Select(element);
	s.selectByVisibleText(name);
}
public static void dropDown1(WebElement element, String name) {
	Select s = new Select(element);
	s.selectByValue(name);
}
public static void dropDown2(WebElement element, int index) {
	Select s = new Select(element);
	s.selectByIndex(index);
}
public static void radiobtn(WebElement element, String name) {
	element.click();
}
}
