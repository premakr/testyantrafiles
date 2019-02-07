package Annotations;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testb extends AllAnnotations {
	@Parameters("browser1")
  @Test
  public void testB(String name) {
	  Reporter.log("testB",true);
	  System.out.println(name);
  }
}
