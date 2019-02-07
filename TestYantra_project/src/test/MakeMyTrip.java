package test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable--notification");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com");
			driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul[@id='ui-id-2']/descendant::li[@class='ui-menu-item']/descendant::span[contains(.,'Goa')]")).click();
	        String month = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
	        Month lmonth = LocalDate.now().getMonth();
	        String year = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']/following-sibling::span[@class='ui-datepicker-year']")).getText();
	        int lyear = LocalDate.now().getYear();
	        System.out.println(year + lyear);
	        Thread.sleep(2000);
	        String date = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/descendant::td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a")).getText();
	        System.out.println(date);
	        
	        String submonth = month.substring(0, 3);
	        String submonth1 = submonth.substring(1).toLowerCase();
	        String submonth2 = submonth.substring(0,1)+submonth1;
	        String cdate = submonth2+" "+date+" "+year;
	        LocalDate expecteddate = LocalDate.parse(cdate, DateTimeFormatter.ofPattern("MMM d yyyy"));
	        LocalDate actualdate = LocalDate.now();
	        Assert.assertEquals(actualdate,expecteddate);
	        
	        LocalDate departdate = actualdate.plusDays(30);
	        String dmonth = departdate.getMonth()+"";
	        System.out.println(dmonth);
	        int add = departdate.getDayOfMonth();
	        System.out.println(add);
	        String expdepartmonth = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::span[@class='ui-datepicker-month']")).getText();
	        System.out.println(expdepartmonth);
	       if(dmonth.equals(expdepartmonth)) {
	    	   Thread.sleep(1000);
	        	driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td[@data-handler='selectDay']/a[text()='"+add+"']")).click();
	       }
	       driver.findElement(By.id("hp-widget__return")).click(); 
	       
	       LocalDate arrival = departdate.plusDays(30);
	       int adate = arrival.getDayOfMonth();
	       System.out.println(adate);
	       driver.findElement(By.xpath("//div[@class='dateFilterReturn hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/descendant::td[@data-handler='selectDay']/a[text()='"+adate+"']")).click();
	       driver.findElement(By.id("searchBtn")).click();
	}
	         
	}

