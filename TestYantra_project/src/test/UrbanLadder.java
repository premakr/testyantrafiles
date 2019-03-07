package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

		static String path="./data/input.xlsx";
		static String sName="menuoptions";
		static int row=0, cell=0;
		static
		{   
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.urbanladder.com/");
			driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
			Actions action=new Actions(driver);
			Thread.sleep(1000);
		    List<WebElement> firstMenu = driver.findElements(By.className("topnav_itemname"));
		    for(int i=0;i<firstMenu.size();i++)
			{
		    	 	 Thread.sleep(500);
					 String firstMenuItem=firstMenu.get(i).getText();
				     System.out.println(firstMenuItem);
				     if(firstMenuItem.trim().length()!=0)
				     setExcelData(path, sName, row++, cell, firstMenuItem.trim());
				     System.out.println("--------------------------------------------------------------");
				     Thread.sleep(1000);
				     action.moveToElement(firstMenu.get(i)).perform();
				     List<WebElement> secondMenu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']//span[contains(text(),'"+firstMenuItem+"')]/..//div[@class='taxontype']"));
				     for(int j=0;j<secondMenu.size();j++)
				     {
				         Thread.sleep(1000);
				    	 String secondMenuItem=secondMenu.get(j).getText();
				    	 if(secondMenuItem.trim().length()!=0)
				    	 setExcelData(path, sName, row++, cell, secondMenuItem.trim());
					     System.out.println(secondMenuItem);
					     System.out.println("_______________________________________________");
					     List<WebElement> thirdMenu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']//span[contains(text(),'"+firstMenuItem+"')]/..//a[contains(text(),'"+secondMenuItem+"')]/../..//span"));
				    	 for(int k=0;k<thirdMenu.size();k++)
				    	 {
				    		 Thread.sleep(1000);
				    		 String lastItems=thirdMenu.get(k).getText();
				    		 System.out.println(lastItems);
				    		 if(lastItems.trim().length()!=0)
				    		 setExcelData(path, sName, row++, cell, lastItems.trim());
				    		 System.out.println("..............................................");
				    	 }
				     }
		    }
		}
		    public static void setExcelData(String  path,String sheetName,int row ,int cell, String value )
			{
				
				Workbook f; 
				try {
					f = WorkbookFactory.create(new FileInputStream(path));
					f.getSheet(sheetName).createRow(row).createCell(cell);
					f.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
					f.write(new FileOutputStream(path));
					
				} catch (EncryptedDocumentException  | InvalidFormatException | IOException e  ) {
					
					e.printStackTrace();
			}	
		}
	}   