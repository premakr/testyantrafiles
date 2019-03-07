package JiraAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueScroll {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		for(int i=0;i<3;i++) {
	    js.executeScript("window.scrollBy(0,500)");
		}
		WebElement element = driver.findElement(By.xpath("//div[@class='bottom-header']"));
		if(element.isDisplayed()) {
			System.out.println("top icon displayed");
		}
		driver.close();

	}

}
