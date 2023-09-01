package project;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(2000);
	String srs = driver.getPageSource();
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	Dimension d = new Dimension(200,300);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
		//driver.quit();	
		
	}

}
