package ReadWriteData.ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteData {

	 @Test
	public void writeData() {
		// Blank Workbook
		XSSFWorkbook workbooks = new XSSFWorkbook();

		// Blank WorkSheet
		XSSFSheet worksheets = workbooks.createSheet("Employee Data");

		// this data need to be use or written in (Object[])
		Map<String, Object[]> data = new HashMap<String, Object[]>();

		// Insert Data

		data.put("1", new Object[] { "ID", "FIRST-NAME", "LAST-NAME", "Email Address" });
		data.put("2", new Object[] { "01", "Mohsin", "Khan", "nazmin@gmail.com" });
		data.put("3", new Object[] { "06", "Hasan", "Khan" });
		data.put("4", new Object[] { "65", "Shumon", "Ahmed", "sumon@gmail.com" });
		data.put("5", new Object[] { "99", "Taher", "Ahmed" });
		data.put("6", new Object[] { "77", "Miraz", "Zaman", "Miraz@gmail.com" });

		// Iterate over data and write to the sheet

		Set<String> keyset = data.keySet();
		int rowNum = 0;

		// Iterate data (Key) by help of Enhanced For Loop

		for (String keys : keyset) {

			// Create row for our Excelsheet

			XSSFRow row = worksheets.createRow(rowNum++);

			// to get value for particuler key
			Object[] objArr = data.get(keys);

			int cellNum = 0;

			// Iterate data (value) by help of Enhanced For Loop
			for (Object cellObj : objArr) {
				Cell cell = row.createCell(cellNum++);
				// --
				if (cellObj instanceof String) {
					cell.setCellValue((String) cellObj);
				} else if (cellObj instanceof Integer) {
					cell.setCellValue((Integer) cellObj);
				}
				// --/Users/khosruzzaman/eclipse-workspace/ExcelData/
			}
		}
		try {
			// Location path for excel sheet
			FileOutputStream fos = new FileOutputStream("./Data/MyData.xls");
			workbooks.write(fos);
			fos.close();
			System.out.println("Congratulations!! Your Record has been saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void readDAta()   {
		
		try {
			// Location path for excel sheet
			FileInputStream fis = new FileInputStream("./Data/MyData.xls");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}

/*
 * */
