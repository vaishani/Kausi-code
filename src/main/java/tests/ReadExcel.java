package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readData() throws IOException {
		FileInputStream fis = new FileInputStream(new File("./data/CreateTD.xlsx"));
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		int pNum = sheet.getPhysicalNumberOfRows();
		System.out.println(pNum);
		int Rcount = sheet.getLastRowNum();
		System.out.println(Rcount);
		int Ccount = sheet.getRow(0).getLastCellNum();
		System.out.println(Ccount);
		for (int i = 1; i <=Rcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < Ccount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				System.out.println(cell.getCellTypeEnum());
			}
				
			}wbook.close();
		}
		
	}
