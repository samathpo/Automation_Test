import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_TO_XLS {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet1 = wb.createSheet("SHEET A");
		Sheet sheet2 = wb.createSheet("SHEET B");
		Row R1 = sheet2.createRow(0);
		Row R2 = sheet2.createRow(1);
		Row R3 = sheet2.createRow(2);
		
		Cell c1 = R3.createCell(4);
		Cell c2 = R3.createCell(5);
		Cell c3 = R3.createCell(6);
		//c1.setCellValue(1);
		//c2.setCellValue("test");
		//c3.setCellValue(23.5);
		
		
		try (OutputStream fileOut = new FileOutputStream("C:\\Eclip_workspace\\Automation Test Cases\\src\\XLSTEST\\Big.xlsx")) {
		    wb.write(fileOut);
		    System.out.println("file created");
		}

	}

}
