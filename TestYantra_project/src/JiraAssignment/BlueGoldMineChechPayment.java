package JiraAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueGoldMineChechPayment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
	    driver.findElement(By.className("hp-gms-banner")).click();
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    driver.findElement(By.id("amount")).sendKeys("15000");
	    driver.findElement(By.id("Email")).sendKeys("prerana@gmail.com");
	    driver.findElement(By.id("tahLpSubmit")).submit();
	    driver.findElement(By.name("_eventId_savePersonalAddressDetails")).submit();
	    driver.findElement(By.id("contactNumber")).sendKeys("9874563210");
	    driver.findElement(By.id("address")).sendKeys("#22,7th main,14th cross,vijaynagar, Bangalore");
	    driver.findElement(By.id("fullname")).sendKeys("prerana");
	    driver.findElement(By.id("postcode_delivery")).sendKeys("560041");
	    driver.findElement(By.name("_eventId_savePersonalAddressDetails")).submit();
	    driver.findElement(By.id("nomineeName")).sendKeys("shreyank");
	    driver.findElement(By.name("_eventId_checkoutSaveAddressDetails")).submit();
	    WebElement paymentdetailspage = driver.findElement(By.xpath("//span[@class='checkout-current']"));
	    String enable = paymentdetailspage.getCssValue("color");
	    if(enable.equals("rgb(241, 93, 71)")) {
	    	System.out.println("payment page displayed");
	    }

	}

}
