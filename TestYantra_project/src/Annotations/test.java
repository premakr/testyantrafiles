package Annotations;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test extends AllAnnotations {
	@Parameters("browser")
   @Test(priority=1,groups="chrome")
   public void testA(String name) {
	   Reporter.log("testA running",true);
	   System.out.println(name);
   }
	@Test(priority=-1,invocationCount=2,groups="firefox")
	   public void testC() {
		   Reporter.log("testC running",true);
		   
	   }
	@Test(dependsOnMethods="testC",priority=0)
	   public void testD() {
		   Reporter.log("testD running",true);
		   
	   }
}
