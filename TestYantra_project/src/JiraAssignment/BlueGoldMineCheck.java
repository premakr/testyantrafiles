package JiraAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BlueGoldMineCheck {

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
	    String email = driver.findElement(By.id("email")).getText();
	    String amount = driver.findElement(By.xpath("//div[@class='input-wrapper']/span/span")).getText();
       
        Assert.assertEquals(amount, " 15,000");
        System.out.println(amount);
        driver.close();
	}

}
