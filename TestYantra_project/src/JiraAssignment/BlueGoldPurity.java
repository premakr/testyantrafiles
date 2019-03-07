package JiraAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueGoldPurity {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
	    driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
        driver.findElement(By.name("submit_search")).submit();
        driver.findElement(By.xpath("//div[@id='top-filter']/descendant::div/span[contains(.,'More Filters')]")).click();
        String count = driver.findElement(By.xpath("//div[@id='top-filter-hover']/descendant::section/descendant::form[@id='gold purity']/descendant::div/span[@data-displayname='22k']/span[@class='items-count']")).getText();
        System.out.println("number of items in 22k: "+count);
        driver.close();
	}

}
