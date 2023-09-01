package handling_multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class FetchTextOfAllLinks {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amezon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		int count = list.size();
		System.out.println(count);
		Thread.sleep(2000);
		for(int i=0;i<count;i++)
			{
				WebElement we = list.get(i);
				String t = we.getText();
				System.out.println(t);
			}
		Thread.sleep(2000);
			driver.close();
			
		
		
		

	}

}
