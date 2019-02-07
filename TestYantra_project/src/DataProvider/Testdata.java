package DataProvider;

import org.testng.annotations.Test;

public class Testdata {

	@Test(dataProvider = "CreateUser",dataProviderClass=ReadXldata.class)
	public void test(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
}
