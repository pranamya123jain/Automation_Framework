package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer ");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("h3[id='video-title']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("yt-formatted-string[aria-label='KGF Trailer Kannada | Yash | Srinidhi Shetty | Prashanth Neel, Vijay Kiragandur, KGF Kannada Trailer by Hombale Films 4 years ago 2 minutes, 45 seconds 23,494,355 views']']]")).click();
	

	}

}
