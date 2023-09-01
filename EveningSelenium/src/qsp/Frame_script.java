package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_script {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/mainpge.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='a']")).sendKeys("Qspiders");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@id='p1']")).sendKeys("Rajajinagar");
	}

}
