package JiraAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BlueGoldMineErrormsg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
	    driver.findElement(By.className("hp-gms-banner")).click();
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    driver.findElement(By.id("tahLpSubmit")).submit();
	    String amounterror = driver.findElement(By.id("amount_error")).getText();
	    String emailerror = driver.findElement(By.id("Email_error")).getText();
	    Assert.assertEquals(amounterror, "Amount is required");
	    System.out.println(amounterror);
	    Assert.assertEquals(emailerror, "Email is required");
	    System.out.println(emailerror);
	    driver.close();

	}

}
