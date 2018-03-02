package seleniumautomation;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class WriteExcel {
public void writeExcel() throws Exception{
	String data[][]=new String[2][3];
	data[0][0]="Testleaf";
	data[0][1] ="ABC";
	data[0][2]="D";
			
	data[1][0] ="Wipro";
	data[1][1] = "MNO";
	data[1][2] = "P";
	XSSFWorkbook wbook = new XSSFWorkbook();
	XSSFSheet sheet = wbook.createSheet("sheet1");
	int rowNumber = 0;
	for(String[] row: data) {
		XSSFRow createRow = sheet.createRow(rowNumber);
		int colCount =0;
		for(String columnData: row) {
			XSSFCell createcell = createRow.createCell(colCount);
			createcell.setCellValue(columnData);
			colCount++;
		}
		rowNumber++;
		}
	FileOutputStream fos = new FileOutputStream(new File("./data/write.xlsx"));
	wbook.write(fos);
	wbook.close();
	
}
}
