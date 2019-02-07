package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Urban_mousehover {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver.chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.urbanladder.com");
	driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
	Actions action = new Actions(driver);
	Thread.sleep(1000);
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.elementToBeClickable(action1));
	List<WebElement> mainoptions = driver.findElements(By.className("topnav_itemname"));
	int count = mainoptions.size();
	for (int i=0;i<count;i++) {
		System.out.println(mainoptions.get(i).getText());
		//String path = "//div[@id='topnav_wrapper'and contains(text(),"+mainoptions.get(i).getText()+")]";
		String path = "//span[@class='topnav_itemname' and contains(text(),'Storage')]/../div/div/ul/li/div/a";
		Thread.sleep(1000);
		action.moveToElement(mainoptions.get(i)).perform();
		List<WebElement> mainmenu = driver.findElements(By.xpath(path));
		int subcount = mainmenu.size();
		for (int j=0;j<subcount;j++) {
			Thread.sleep(1000);
			String values = mainmenu.get(j).getText();
			System.out.println(values);
			String xlpath = "./data/input.xlsx";
			String sheet = "menuoptions";
			setCelValue(xlpath, sheet, i, j, values);
	  }	
	}
	driver.close();
	}
public static void setCelValue(String path,String sheet, int row, int cell,String value) throws Exception, IOException {
		
		Workbook excelsheet = WorkbookFactory.create(new FileInputStream(path));
	    excelsheet.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);
		excelsheet.write(new FileOutputStream(path));
	}
}
