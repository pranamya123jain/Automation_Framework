package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_DragNdDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		//	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement srs = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		//or
		//WebElement srs = driver.findElement(By.id("box3"));
		WebElement dst = driver.findElement(By.xpath("//div[text()='United States']"));
		//or
		//WebElement srs = driver.findElement(By.id("box103"));
		Thread.sleep(2000);
		//WebElement srs1 = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		//WebElement dst1= driver.findElement(By.xpath("(//div[text()='Italy']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(srs, dst).perform();
		//act.dragAndDrop(srs1, dst1).perform();
	}

}
