package JiraAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BlueGender {
	
	@Test
      public void test() {
		
	//public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
	    driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
        driver.findElement(By.name("submit_search")).submit();
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[@class='top-filter-blocks']/section[@id='Gender-form']/span/span[contains(.,'Gender')]"));
        action.moveToElement(element).perform();
        String count = driver.findElement(By.xpath("//div[@class='top-filter-blocks']/descendant::div[@class='form-items']/descendant::span[@data-displayname='women']/span[@class='items-count']")).getText();
        System.out.println("Number of womens:"+count);
        driver.close();
	}

}
