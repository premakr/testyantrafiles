package test;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneChat {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.switchTo().frame("wiz-iframe");
		driver.findElement(By.xpath("//div[@id='contentDiv']/span[@class='CT_BannerClose']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-compact-view");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='content']/descendant::span[@class='icon-maximize']/following-sibling::span")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("livechat-full-view");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='container_2']/descendant::input[@id='name']")).sendKeys("prerana");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='container_3']/descendant::input[@id='email']")).sendKeys("premak86@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='container_4']/descendant::input[@id='container_4_4']")).sendKeys("9856321472");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(100000);
		driver.findElement(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")).sendKeys("hi");
		driver.findElement(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")).sendKeys(Keys.ENTER);
		//driver.close();

	}

}
	