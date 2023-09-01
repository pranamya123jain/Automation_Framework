package paralellExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_exec 
{
public WebDriver driver;
@Test
@Parameters({"browser"})
public void test1(String browser)
{
System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
if(browser.equals("ChromeDriver"))
{
	driver=new ChromeDriver();
	driver.get("https://ww.googal.com");
}
else
{
	driver=new FirefoxDriver();
	driver.get("https://ww.googal.com");
}
}
}
