package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile_Generic 
{
	@Test
	public void test2(String path,String key) throws FileNotFoundException, IOException
	{
		//steps1
		Properties p= new Properties();
		//step2
		p.load(new FileInputStream(path));
		//step3
		String val=p.getProperty(key);
		System.out.println(val);
}

}
