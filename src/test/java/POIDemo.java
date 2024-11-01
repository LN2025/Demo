import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIDemo {

	public static void main(String[] args) {
		
		try {	

//			File file = new File("C:\\tmp\\Employees.xlsx");
//			
//			FileInputStream fis = new FileInputStream(file);
//			//FileReader fr = new FileReader(file);
//			
//			XSSFWorkbook wb = new XSSFWorkbook(fis);
//			//XSSFWorkbook wb = new XSSFWorkbook(fr);
//			//XSSFSheet sheet = wb.getSheet("LoginTestData");
//			XSSFSheet sheet = wb.getSheet("TD");
//			
//			int totalRows = sheet.getLastRowNum();
//			int totalCols = sheet.getRow(1).getLastCellNum();
//			
//			for(int i=0; i<totalRows; i++) {
//				
//				XSSFRow row = sheet.getRow(i);
//						
//			for(int j=0; j<totalCols; j++) {
//				
//				XSSFCell cell = row.getCell(j);
//				
//				
//				System.out.print(cell+"\t");
//				//CellType celltype = cell.getCellType();	
//					
//				}
//			System.out.println("\t");
//			
//			}
//			
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet Sheet1 = wb.createSheet("Sheet1");
			
			Object[][] data = {{"Id", "Name"}, 
							{"100", "Dhoni"},
							{"101", "Virat"}
					};
			
			int rows = data.length;
			int cols = data[0].length;
			
			for(int i=0; i<rows; i++) {
				
				XSSFRow row = Sheet1.createRow(rows);
				
					for(int j=0; j<cols; j++) {
						
						XSSFCell cell = row.createCell(cols);
						
						Object cellData = data[i][j];
						
						if(cellData instanceof String) {
							cell.setCellValue((String) cellData);
						}else if(cellData instanceof Integer) {
							cell.setCellValue((Integer)cellData);
						}
						
						//cell.setCellValue(cellData.toString());
						
					}
			}

			File file = new File("C:\\tmp\\Emp.xlsx");
			FileOutputStream fos = new FileOutputStream(file);
			
			wb.write(fos);
			fos.close();
			
			System.out.println("Success");
			
			
//			Row r1 = sheet.createRow(1);
//			Row r2 = sheet.createRow(2);
//			
//			Cell c1 = r1.createCell(0);
//			Cell c2 = r1.createCell(1);
//
//			Cell c3 = r2.createCell(0);
//			Cell c4 = r2.createCell(1);
//			
//			
//			c1.setCellValue("User1");
//			c2.setCellValue("Pass@1234");
//			
//			c3.setCellValue("User2");
//			c4.setCellValue("Pass@4321");			
//			
//			FileOutputStream fos = new FileOutputStream(file);
//			
//			wb.write(fos);
//			
//			fos.close();
//			
//			System.out.println("Successfully content written to sheet");
			
			
			
			//XSSFSheet sheet = wb.getSheetAt(0);
			
//			XSSFRow row1 = sheet.getRow(1);
//			
//			XSSFCell cell0 = row1.getCell(0);
//			XSSFCell cell1 = row1.getCell(1);
//			
//			System.out.println(cell0);
//			System.out.println(cell1);

			
			
			
			
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
