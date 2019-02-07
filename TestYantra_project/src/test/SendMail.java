package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendMail {

		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			driver.findElement(By.id("identifierId")).sendKeys("prema.shine@gmail.com");
			driver.findElement(By.xpath("//div[@id='identifierNext']/descendant::span")).click();
		    driver.findElement(By.name("password")).sendKeys("PadmaLalithamma@*123");
		    driver.findElement(By.xpath("//div[@id='passwordNext']/descendant::span")).click();
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    wait.until(ExpectedConditions.titleContains("Inbox"));
		    String title = driver.getTitle();
		    if(title.contains("Inbox")) {
		    	System.out.println("Home page successfully displayed");
		    }
		    else
		    	System.out.println("Enter valid credentials");
			driver.findElement(By.xpath("//div[@class='z0']/div[contains(.,'Compose')]")).click();
			
			driver.findElement(By.xpath("//div[@class='wO nr l1']/descendant::textarea[@aria-label='To']")).sendKeys("girish.professional@gmail.com");
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("automated mail");
			driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi have a great day");
			driver.findElement(By.xpath("//div[text()='Send']")).click();
	}

}
