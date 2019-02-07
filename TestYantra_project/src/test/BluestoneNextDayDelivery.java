package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneNextDayDelivery {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
	    driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
        driver.findElement(By.name("submit_search")).submit();
        Actions action = new Actions(driver);
        WebElement movetodeliverytime = driver.findElement(By.xpath("//div[@id='top-filter']/div[@class='top-filter-blocks']/descendant::span[contains(.,'Delivery Time')]/span"));
        action.moveToElement(movetodeliverytime).perform();
        Thread.sleep(1000);
        String nextdaydeliveryitems = driver.findElement(By.xpath("//div[@class='content']/descendant::form[@id='delivery time']/descendant::span[@data-displayname='next day delivery']/span[@class='items-count']")).getText();
        System.out.println("No. of next day delivery items: "+nextdaydeliveryitems);

	}

}
