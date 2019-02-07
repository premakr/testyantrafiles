package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AllAnnotations {
	
	@BeforeSuite
	public void testS1() {
		Reporter.log("suite",true);
	}
	@BeforeTest
	public void testStart() {
		Reporter.log("teststart",true);
	}
	@BeforeClass
	public void testclass() {
		Reporter.log("testclass",true);
	}
	@BeforeMethod
	public void testMethod() {
		Reporter.log("testmethod",true);
	}
	@AfterMethod
	public void atestMethod() {
		Reporter.log("aftertestmethod",true);
	}
	@AfterClass
	public void atestclass() {
		Reporter.log("atestclass",true);
	}
	@AfterTest
	public void atestend() {
		Reporter.log("testend",true);
	}
	@AfterSuite
	public void atestSuite() {
		Reporter.log("asuite",true);
	}
	@BeforeGroups
	public void bbgroups() {
		Reporter.log("bgroups",true);
	}
	@AfterGroups
	public void abgroups() {
		Reporter.log("agroups",true);
	}
	
	
	

}
