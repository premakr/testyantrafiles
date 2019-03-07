package JiraAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliding {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions action = new Actions(driver);
		WebElement slide = driver.findElement(By.xpath("//div[@id='slider']/span"));
		int size = driver.findElement(By.id("slider")).getSize().getWidth();
        
		System.out.println(size);
		for(int i=0;i<20;i++) {
		action.moveToElement(slide).clickAndHold(slide).moveByOffset(i, 0).perform();
		}
		for(int i=20;i>0;i--) {
		action.moveToElement(slide).clickAndHold(slide).moveByOffset(-i, 0).perform();
		}
		driver.close();
	}
}




 
/*for(int i=0;i<size;i++) {
action.clickAndHold(slide).sendKeys(Keys.ARROW_RIGHT).perform();
}

for(int i=size;i>0;i--) {
	action.clickAndHold(slide).sendKeys(Keys.ARROW_LEFT).perform();
	}*/



