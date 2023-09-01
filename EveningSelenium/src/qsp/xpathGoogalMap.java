package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathGoogalMap {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='eYqqWd vF7Cdb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("Banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Search'and @data-tooltip='Search']]")).click();
        Thread.sleep(2000);
		
	}

}
