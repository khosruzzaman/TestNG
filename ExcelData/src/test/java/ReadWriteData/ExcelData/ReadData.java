package ReadWriteData.ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {

	@Test
	public void readData() throws IOException {
		try {
			// Location path for excel sheet
			FileInputStream fis = new FileInputStream("./Data/MyData.xls");

			// Blank Workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			// Blank worksheet
			XSSFSheet workSheet = workbook.getSheetAt(2); // 0= sheet 1, 1=sheet 2, 2= sheet 3

			// Iterate through each row one by one
			Iterator<Row> rowIterator = workSheet.iterator();

			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();

				// Iterate through each Cell one by one
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					
//					if(cell.getCellType().NUMERIC!= null) {
//						
//						System.out.println(cell.getNumericCellValue()+ " \t");
//						
//					} else if (cell.getCellType().STRING != null) {
//						System.out.print(cell.getStringCellValue()+" \t");
//					}
					
					switch (cell.getCellType()) 
					{
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+ " \t");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue()+" \t");
						break;
					} 
						
						
					
				}
				System.out.println("");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
