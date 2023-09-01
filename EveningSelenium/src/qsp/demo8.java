package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		//driver.get("file:///C:/Users/LENOVO/Desktop/fb.html");
		Thread.sleep(2000);
		//driver.quit();
		driver.findElement(By.id("email")).sendKeys("pranamya123jain@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.id("pass")).sendKeys("1234567");
		//Thread.sleep(2000);
		//driver.findElement(By.name("login")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//Thread.sleep(2000);
		//driver.quit();
	    //driver.findElement(By.partialLinkText(" ")).click();
	   // driver.quit();
	    //driver.findElement(By.partialLinkText("faceb")).click();
	}

}
