package JiraAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BlueGoldMineError1 {

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
	    String contacterror = driver.findElement(By.id("contactNumber_error")).getText();
	    String nameerror = driver.findElement(By.id("fullname_error")).getText();
	    String addresserror = driver.findElement(By.id("address_error")).getText();
	    String postcodeerror = driver.findElement(By.id("postcode_delivery_error")).getText();
	    Assert.assertEquals(contacterror, "Please enter valid mobile number");
	    System.out.println(contacterror);
	    Assert.assertEquals(nameerror, "Name is required");
	    System.out.println(nameerror);
	    Assert.assertEquals(addresserror, "Your address is required");
	    System.out.println(addresserror);
	    Assert.assertEquals(postcodeerror, "Enter Valid Pincode");
	    System.out.println(postcodeerror);
	    driver.close();
	}

}
