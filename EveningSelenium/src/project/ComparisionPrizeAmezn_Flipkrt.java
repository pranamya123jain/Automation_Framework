package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComparisionPrizeAmezn_Flipkrt {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("amezon.in");
		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		WebElement rClick = driver.findElement(By.xpath("//h3[text()='Amazon.in']"));
		Actions act = new Actions(driver);
		act.contextClick(rClick).perform();
		Thread.sleep(4000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_T);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='ExCKkf z1asCe rzyADb']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("flipkar.com");
		Thread.sleep(4000);
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		WebElement rClick1 = driver.findElement(By.xpath("//span[text()='Flipkart']"));
		Actions act1 = new Actions(driver);
		act1.contextClick(rClick1).perform();
		Thread.sleep(4000);
		Robot r3 = new Robot();
		r3.keyPress(KeyEvent.VK_T);
		r3.keyRelease(KeyEvent.VK_T);
		Thread.sleep(4000);
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<WebElement> l = new ArrayList<WebElement>();
		l.add(rClick);
		l.add(rClick1);
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			WebElement l2 = l.get(1);
		}
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nokia 5g mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//driver.navigate().to("https://amezon.in");
		//Thread.sleep(2000);
		//driver.navigate().to("https://flipkart.com");
		//Thread.sleep(2000);

	}

}
