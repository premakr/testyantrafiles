package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BluestoneOffer {
	@Test
	public void main() {
	
	//public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions action = new Actions(driver);
		WebElement mainmenu = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li"));
		action.moveToElement(mainmenu).perform();
		WebElement submain = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'Offers')]"));
		action.moveToElement(submain).perform();
		String offer = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'Offers')]/following-sibling::div[@class='wh-submenu single-column-submenu']/descendant::span[contains(.,'0% Making Charge')]")).getText();
		driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'Offers')]/following-sibling::div[@class='wh-submenu single-column-submenu']/descendant::span[contains(.,'0% Making Charge')]")).click();
		//String product = driver.findElement(By.xpath("//div[@id='grid-view-result']/descendant::li/descendant::span[@class='offers-wrapper']/span")).getText();
		List<WebElement> alllist = driver.findElements(By.xpath("//div[@id='grid-view-result']/descendant::li/descendant::span[@class='offers-wrapper']/span"));
		
		String expected = offer.toUpperCase();
		for(WebElement list:alllist) {
		Assert.assertEquals(expected, list.getText());
		}
		
	}

}
