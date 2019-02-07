package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BluestoneTest {

	@DataProvider
	public String[][] pricelist() throws Exception {
		
		String a[][];
		Workbook excel = WorkbookFactory.create(new FileInputStream("./data/pricelist.xlsx"));
		Sheet sheet = excel.getSheet("default");
		a= new String[4][2];
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return a;
	}
	
	@Test(dataProvider="pricelist")
	public void test(String defaultp,String sortedp) {
		Assert.assertNotEquals(defaultp, sortedp);
	}
}
