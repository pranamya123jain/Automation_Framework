package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_fileUpld {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/file%20upload.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\LENOVO\\Desktop\\RESUME 21.docx");
		
	}

}
