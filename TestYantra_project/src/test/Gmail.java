package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");
			driver.findElement(By.id("identifierId")).sendKeys("prema.shine@gmail.com");
			driver.findElement(By.xpath("//div[@id='identifierNext']/descendant::span")).click();
		    driver.findElement(By.name("password")).sendKeys("PadmaLalithamma@*123");
			driver.findElement(By.xpath("//div[@id='passwordNext']/descendant::span")).click();
			WebElement primary = driver.findElement(By.className("aKz"));
			String value = primary.getCssValue("color");
			System.out.println(value);
			if(value.equals("rgba(217, 48, 37, 1)")){
				System.out.println("primary tab is selected");
			}
			else {
				primary.click();
			}
			String count = driver.findElement(By.xpath("//div[@aria-label='Show more messages']/descendant::span[@class='Dj' and contains(.,'of')]/span/following-sibling::span")).getText();
			System.out.println("No. of email count in primary: "+count);
		}
	}
