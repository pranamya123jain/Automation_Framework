package qsp;

import java.awt.desktop.QuitEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("Pranamya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ name='pass']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ name='login']")).click();
		Thread.sleep(2000);
		

	}

}
