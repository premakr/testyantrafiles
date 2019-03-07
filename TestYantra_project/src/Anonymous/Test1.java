package Anonymous;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	  @Test(retryAnalyzer=testfail.class)
	  public void test() {
		  System.out.println("running test");
		  Assert.fail();
	  }
	

}
