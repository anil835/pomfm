import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoA {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
			
			Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
			
			int rc = wb.getSheet("Sheet1").getLastRowNum();
			System.out.println(rc);
			
			short cc = wb.getSheet("Sheet1").getRow(2).getLastCellNum();
			System.out.println(cc);
			
			for(int i=1; i<=rc;i++) {
				for(int j=0;j<cc;j++) {
				String s = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
				System.out.println(s);
				}
			}

		}

	}


