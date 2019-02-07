package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions action = new Actions(driver);
		List<WebElement> mainmenu = driver.findElements(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li"));
		
		for(int i=0;i<mainmenu.size();i++) {
			String value = mainmenu.get(i).getText();
			//System.out.println(value);
			action.moveToElement(mainmenu.get(i)).perform();
			List<WebElement> submain = driver.findElements(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'Rings')]/ following-sibling::div/descendant::div/div[@class='wh-submenu-header']"));
			for(int j=0;j<submain.size();j++) {
				//String value1 = submain.get(j).getText();
				//System.out.println(value1);
				action.moveToElement(submain.get(j)).perform();
				List<WebElement> submenu = driver.findElements(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'Rings')]/following-sibling::div/descendant::div/div[@class='wh-submenu-header' and contains(.,'Popular Ring Types ')]/parent::div/descendant::li"));
			    submenu.get(0).click();
				}
		
		}
		}
}