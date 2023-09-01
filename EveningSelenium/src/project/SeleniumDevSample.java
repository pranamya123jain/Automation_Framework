package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumDevSample {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement r1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement r2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement r3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement r4 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement r5 = driver.findElement(By.xpath("//span[text()='Blog']"));
		ArrayList<WebElement> l = new ArrayList<WebElement>();
		l.add(r1);
		l.add(r2);
		l.add(r3);
		l.add(r4);
		l.add(r5);
		Actions act = new Actions(driver);
		Robot r = new Robot();
		for(WebElement we:l)
		{
			act.contextClick(we).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);	
		}
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> l2 = new ArrayList<String>(allwh);
		for(String wh:allwh)
		{
			//driver.switchTo().window(wh);
			Thread.sleep(2000);
			String l3 = l2.get(4);	
			driver.switchTo().window(l3);
		}
	}

}
