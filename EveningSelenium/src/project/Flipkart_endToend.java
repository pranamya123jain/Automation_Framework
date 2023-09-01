package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_endToend 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@alt='Apple iPhone 14 (128 GB) - Blue'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9731246012");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Pravinya@90");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).sendKeys("Pravinya@90");
	}

}
