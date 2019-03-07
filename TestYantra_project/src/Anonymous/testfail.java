package Anonymous;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class testfail implements IRetryAnalyzer{
	public int count=0;
	public int maxrun=3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<=maxrun) {
			System.out.println("pass");
			count++;
			return true;
		}
		return false;
	}

}
