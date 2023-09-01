package test_script;
import org.testng.annotations.Test;
import generic_script.Amezon_EndToEnd;
import pom_Script.Amezon_eNdtOeNd;

public class Amezon_testsScript extends Amezon_EndToEnd 
{
@Test
public void click() throws InterruptedException
{
	Amezon_eNdtOeNd p1=new Amezon_eNdtOeNd (driver);
	p1.clickclse();
	Thread.sleep(4000);
	p1.searchTxtfield("iphone pro 14");
	Thread.sleep(4000);
	p1.clicksbtn();
	Thread.sleep(4000);
	p1.clicktext();
	Thread.sleep(4000);
	p1.clickaddCart();
	Thread.sleep(4000);
	p1.clickgText();
	Thread.sleep(4000);
	p1.clicksnbtn();
	
}
}
