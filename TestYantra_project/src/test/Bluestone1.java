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

public class Bluestone1 {
	static String sheet = "default";
	static String path = "./data/pricelist.xlsx";

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions action = new Actions(driver);
		WebElement mainmenu = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li"));
		action.moveToElement(mainmenu).perform();
		WebElement submain = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'Rings')]/ following-sibling::div/descendant::div/div[@class='wh-submenu-header']"));
		action.moveToElement(submain).perform();
		driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'Rings')]/ following-sibling::div/descendant::div/div[@class='wh-submenu-header' and contains(.,'Popular Ring Types ')]/parent::div/descendant::li/a[contains(.,'Diamond')]")).click();
        List<WebElement> defaultprice = driver.findElements(By.xpath("//div[@class='inner pd-gray-bg']/descendant::span[@id='bst-discounted-price']"));
         for(int i=0;i<defaultprice.size();i++) {
        	 String prices=defaultprice.get(i).getText();
    		 System.out.println(prices);
    		 setXlData(path, sheet, i, 0, prices.trim());
         }
         WebElement sortelements = driver.findElement(By.xpath("//div[@class='pull-right sort-options']/section/span/i[contains(@class,'icon-ion-chevron-down')]"));
         action.moveToElement(sortelements).perform();
         driver.findElement(By.xpath("//section[@class='block sort-by pull-right active']/descendant::div[@id='view-sort-by']/descendant::div/a[contains(.,'Price Low to High ')]")).click();
         List<WebElement> sortedprice = driver.findElements(By.xpath("//div[@class='inner pd-gray-bg']/descendant::span[contains(@class,'p-wrap')]/descendant::span[@id='bst-discounted-price']"));
             for(int i=0;i<sortedprice.size();i++) {
        	 String prices1=sortedprice.get(i).getText().replaceAll("Rs.", " ");
    		 System.out.println(prices1);
    		 setXlData(path, sheet, i, 1, prices1);
         }
             driver.close();
	}
	public static void setXlData(String path,String sheet,int row,int cell,String value) {
		Workbook f; 
		try {
			f = WorkbookFactory.create(new FileInputStream(path));
			if(f.getSheet(sheet).getPhysicalNumberOfRows()==0) {
			f.getSheet(sheet).createRow(row).createCell(cell).setCellValue("");
			}
			else
			f.getSheet(sheet).getRow(row).createCell(cell).setCellValue("");
			f.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
			f.write(new FileOutputStream(path));
			
		} catch (EncryptedDocumentException  | InvalidFormatException | IOException e  ) {
			
			e.printStackTrace();
	}

}
	
}