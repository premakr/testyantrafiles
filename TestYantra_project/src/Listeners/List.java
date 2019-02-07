package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class List implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("before test method");
	}
	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("test execution completed");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("test failed with percentage");
	}
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("test failed");
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("test skipped");
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("test result");
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("test success");
	}  
}
