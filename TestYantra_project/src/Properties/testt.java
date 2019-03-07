package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class testt {

	//public static void main(String[] args) throws FileNotFoundException, IOException {
		@Test
		public void run() throws Exception{
		Properties p = new Properties();
		p.load(new FileInputStream("C:\\Users\\admin\\git\\repository1\\TestYantra_project\\new.properties"));
		Object value = p.get("one");
		System.out.println(value);

	}

}
