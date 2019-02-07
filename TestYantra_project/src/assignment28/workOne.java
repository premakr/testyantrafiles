package assignment28;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workOne {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Xml/assignment.html");
		List<WebElement> whaleNo = driver.findElements(By.xpath("//tr//td[contains(text(),'whale')]"));
		System.out.println(" People working in project Whale = "+whaleNo.size());
		
		WebElement time=driver.findElement(By.xpath("//td[contains(text(),'Girish')]/../td[contains(text(),'whale')]/../td[3]"));
		System.out.println(time.getText());
	    List<WebElement> totalTime = driver.findElements(By.xpath("//td[contains(text(),'Girish')]/../td[3]"));
		double sum=0;
		for(int i=0;i<totalTime.size();i++)
		{
		    String s=totalTime.get(i).getText();
		    sum=sum+Double.parseDouble(s);
		}
		 System.out.println("total time spent by girish in all project: "+sum);
		 List<WebElement> names=driver.findElements(By.xpath("//tr/td[1]"));
		 Set<String> s=new HashSet<String>();
		 System.out.println("Unique names working on projects: ");
		 for(int i=0;i<names.size();i++)
		 {
			 s.add(names.get(i).getText());
		 }
		 for(String ob:s)
		 {
			 System.out.println(ob);
		 }
		 List<WebElement> projects = driver.findElements(By.xpath("//td[contains(text(),'Girish')]/../td[2]"));
		 System.out.println("projects working by Girish: ");
		for(WebElement p : projects) {
			
			System.out.println(p.getText());
		}
		 driver.close();	 
		
	}

}
