package DataProvider;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXldata {
	
    @DataProvider
	public String[][] CreateUser() throws Exception{
    	/*public static void main(String[] args) throws Exception {*/
		 
       String[][] s ;
       String path="./data/userdetails.xlsx";
       Workbook excel = WorkbookFactory.create(new FileInputStream(path));
       Sheet sheet = excel.getSheet("userdata");
       s = new String[sheet.getPhysicalNumberOfRows()-1][sheet.getRow(0).getLastCellNum()];
       for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
    	   for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
    		   Cell value = sheet.getRow(i).getCell(j);
    		  // System.out.println(value);
    		   s[i-1][j]=value.toString();
    		   System.out.println(s[i-1][j]);
    	   }
       }
	return s;
	}

}
