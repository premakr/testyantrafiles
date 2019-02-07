package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners
public class TestList {
   @Test
   public void test() {
	   SoftAssert sa = new SoftAssert();
	   sa.assertEquals(true, false);
	   System.out.println("running test");
   }
   @Test
   public void testA() {
	   Assert.assertEquals(123, 12);
	   System.out.println("running testA");
   }
}
