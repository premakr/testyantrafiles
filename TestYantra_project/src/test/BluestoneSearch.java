package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
	    driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
        driver.findElement(By.name("submit_search")).submit();
        Actions action = new Actions(driver);
        WebElement movetoprice = driver.findElement(By.xpath("//div[@id='top-filter']/div[@class='top-filter-blocks']/descendant::span[text()='Price']"));
        action.moveToElement(movetoprice).perform();
        String pricecount = driver.findElement(By.xpath("//div[@class='content']/descendant::form[@id='price']/descendant::span[@data-displayname='below rs 10000']/span[@class='items-count']")).getText();
        System.out.println("No. of items below price 10000: "+pricecount);
        driver.close();
	}

}
