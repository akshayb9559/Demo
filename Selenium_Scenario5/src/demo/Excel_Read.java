package demo;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Excel_Read {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {

		String path = "D:\\Eclipse Project\\Selenium_Scenario5\\demo.xlsx";
		FileInputStream FileStream = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(FileStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		for (int i = 1; i <= rowcount; i++) {
			int id = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
			String name = sheet.getRow(i).getCell(1).getStringCellValue();
			
			Assert.assertNotNull(name);

			System.out.print(id);
			System.out.print("  ");
			System.out.println(name);
		}
	}

}
