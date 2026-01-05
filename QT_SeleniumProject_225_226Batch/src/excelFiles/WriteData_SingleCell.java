package excelFiles;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_SingleCell {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		//XSSFSheet sheet1=workbook.getSheetAt(0);
		XSSFSheet sheet1=workbook.createSheet("DataSheet");
		XSSFRow row=sheet1.createRow(10);
		XSSFCell cell=row.createCell(10);
		cell.setCellValue("One");
		
		FileOutputStream fileout=new FileOutputStream("D:\\QT\\QT_Selenium_225,226,227\\ExcelFiles\\WriteDataSingleCell.xlsx");
		workbook.write(fileout);
		
		System.out.println("Data written successfully");
		workbook.close();
		
	}

}
