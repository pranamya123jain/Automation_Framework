package pom_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner 
{
	@Test
	public void click() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		POM_scriptFaceBook p1=new POM_scriptFaceBook(driver);
		p1.username("admin");
		Thread.sleep(2000);
		p1.password("manager");
		Thread.sleep(2000);
		p1.clicklogin();
	}
}
