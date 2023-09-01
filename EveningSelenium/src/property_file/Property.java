package property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import generic.PropertyFile_Generic;

public class Property extends PropertyFile_Generic
{
	@Test
	public void test1() throws FileNotFoundException, IOException
	{
		//steps1
		Properties p= new Properties();
		//step2
		p.load(new FileInputStream("./p.properties"));
		//step3
		String val=p.getProperty("baseurl");
		System.out.println(val);
	}
}
	
