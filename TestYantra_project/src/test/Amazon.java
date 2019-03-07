package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.get("https://www.amazon.in/");
		Actions action = new Actions(driver1);
		driver1.navigate().to("");//from eclipse
		
		WebElement item = driver1.findElement(By.xpath("//div[@class='a-cardui fat-image-link card-lite']/descendant::img[@alt='Amazon Echo']"));
		action.moveToElement(item).perform();
		item.click();
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("scrollBy(0,200)");
		
		driver1.findElement(By.xpath("//div[@class='acsUxWidget']/descendant::div/div[@class='bxc-grid__image   bxc-grid__image--light']/a/img[@alt='echo plus']")).click();
		
		Thread.sleep(5000);
		Set<String> windows = driver1.getWindowHandles();
		int count = windows.size();
		for(String win:windows) {
			driver1.switchTo().window(win);
		}
		String producttxt = driver1.findElement(By.xpath("//div[@id='titleSection']/descendant::span[@id='productTitle']")).getText();
		System.out.println(producttxt);
		driver1.findElement(By.xpath("//input[contains(@title,'Add to Shopping Cart')]")).submit();
		String producttxt1 = driver1.findElement(By.xpath("//div/a[@title='All-new Echo Plus (2nd gen) – Premium sound with a built-in smart home hub-Black']")).getAttribute("title");
		System.out.println(producttxt1);
		if(producttxt.contains(producttxt1)) {
			System.out.println("same title validated");
		}
	}

}










//WebElement signin = driver.findElement(By.xpath("//div[@id='nav-main']/descendant::div/div[@id='nav-tools']/a/span[@class='nav-line-1' and contains(.,'Hello, Sign in')]"));
//driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span[text()='Sign in']")).click();
//driver.findElement(By.name("email")).sendKeys("8095157909");
//driver.findElement(By.id("continue")).click();
//driver.findElement(By.name("password")).sendKeys("PadmaLalithamma@*123");
//driver.findElement(By.id("signInSubmit")).submit();
