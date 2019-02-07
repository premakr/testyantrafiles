package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAndWrite {
 static Workbook excel;
	public static void main(String[] args) {
		String path = "./data/input1.xlsx";
		String rowdata= "Tc2";
		String coldata="Result";
		getXldata(path,rowdata,coldata);
	}
	public static String fetchxldata(String path,String book,int r ,int c )
	{
		String p="";
		p=excel.getSheet(book).getRow(r).getCell(c).toString();
		return p;
	}
		public static void getXldata(String path,String data,String coldata) {
	 		try {
				excel = WorkbookFactory.create(new FileInputStream(path));
				Sheet sheet = excel.getSheet("sheet1");
				int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
				int rowindex=0,colindex=0;
				for (int i=0,j=0;i<=rowcount;i++) {
					String value=fetchxldata(path, "sheet1", i, j);
					if(value.equals(data)) {
						rowindex=i;
					}
				}
				for(int i=0;i<=rowcount;i++) {
				Row rows = sheet.getRow(i);
				for(int j=0;j<rows.getLastCellNum();j++){
					String value = fetchxldata(path, "sheet1", i, j);
					if(value.equals(coldata)) {
						colindex=j;
					System.out.print(fetchxldata(path, "sheet1", rowindex, colindex));
				}
			 }		
		   }	
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
