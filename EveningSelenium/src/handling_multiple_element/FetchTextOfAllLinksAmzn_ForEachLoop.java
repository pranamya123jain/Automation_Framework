package handling_multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextOfAllLinksAmzn_ForEachLoop {

	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amezon.in/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(count);
		for(WebElement we:links)
			{
				String t = we.getText();
				System.out.println(t);
			}
		
		

	}

}
