package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpnKannadaEleInNwtab_SwitchCntrleOnIt {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement rClick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act = new Actions(driver);
		act.contextClick(rClick).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allwh = driver.getWindowHandles();	
		ArrayList<String> l1 = new ArrayList<String>(allwh);
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			String l2 = l1.get(1);
			driver.switchTo().window(l2);
		}
		//ArrayList<String> l1 = new ArrayList<String>(t);	
	}
}
