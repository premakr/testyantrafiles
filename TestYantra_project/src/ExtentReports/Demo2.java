package ExtentReports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Demo2 {
       
	ExtentReports reports = new ExtentReports();
	ExtentTest test = reports.createTest("dem");
	@Test
	public void dem() {
		
		ExtentHtmlReporter rep = new ExtentHtmlReporter("C:\\Users\\admin\\git\\repository1\\TestYantra_project\\reports//rep.html");
		
		rep.config().setDocumentTitle("Automation");
		rep.config().setReportName("Testing");
		rep.config().setTheme(Theme.STANDARD);
		
		
		reports.attachReporter(rep);
		reports.setSystemInfo("hostname", "prema");
		reports.setSystemInfo("testERname", "PREMA");
		reports.setSystemInfo("envname", "windows");
		reports.setSystemInfo("project name", "DemoProject");
		
		
		test.log(Status.INFO, "running extent report");
		
//		test.log(Status.PASS, "test is passed");
//		reports.flush();
	}
	@AfterMethod
	public void aftertest(ITestResult r) {
		
		System.out.println(r.getMethod().getMethodName());
		System.out.println(r.getStatus());
		if(r.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "test is passed");
			reports.flush();
		}
		else
		{
			test.log(Status.FAIL, "test  is failed");
			reports.flush();
		}
	}
}
