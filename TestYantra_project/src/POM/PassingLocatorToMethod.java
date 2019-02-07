package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class PassingLocatorToMethod {
	
	
	public static WebElement locatorValue(String locator,String value,WebDriver driver) {
		if(locator.equals("id")) 
		    return driver.findElement(By.id(value));
		else if(locator.equals("name")) 
			return driver.findElement(By.name(value));
		else if(locator.equals("className")) 
			return driver.findElement(By.className(value));
		else if(locator.equals("partialLinkText")) 
			return driver.findElement(By.partialLinkText(value));
		else if(locator.equals("linkText")) 
			return driver.findElement(By.linkText(value));
		else if(locator.equals("cssSelector"))
			return driver.findElement(By.cssSelector(value));
		else if(locator.equals("xpath"))
			return driver.findElement(By.xpath(value));
		else if(locator.equals("tagName"))
			return driver.findElement(By.tagName(value));
		else
			return null;
		
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		WebElement path = locatorValue("name","submit",driver);

	}
	

}
