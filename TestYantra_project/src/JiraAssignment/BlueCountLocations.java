package JiraAssignment;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueCountLocations {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions actions=new Actions(driver);
		driver.findElement(By.xpath("//div[@class='top-header-inner']/div/ul/li[@class='visit-our-stores']")).click();
		List<WebElement> cities = driver.findElements(By.xpath("//div[@class='store-city ']/div/div[@class='map-wrap']/descendant::div[@class='store-location']"));
		for(int i=0;i<cities.size();i++)
		{
			System.out.println(cities.get(i).getText());
		}
		System.out.println("no of locations found "+cities.size());
	}	
}
