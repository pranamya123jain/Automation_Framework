package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SrtElementsAscendnOrder_TreeSet {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("image"));
		TreeSet<String> ts=new TreeSet<String>();
		Select s = new Select(ele);
	List<WebElement> opt = s.getOptions();
	int count=opt.size();
	System.out.println(count);
	for(WebElement we:opt)
		{
			String t = we.getText();
			ts.add(t);
		}
	for(String t1:ts)
	{
		System.out.println(t1);
	}	

	}

}
