package Anonymous;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class RunFailedTestScripts {
	
	@Test
	public void rerun() {
		TestNG test = new TestNG();
		List<String> ls = new ArrayList<>();
		ls.add("C:\\Users\\admin\\git\\repository1\\TestYantra_project\\test-output\\Default suite\\testng-failed.xml");
		test.setTestSuites(ls);
		test.run();
	}

}
