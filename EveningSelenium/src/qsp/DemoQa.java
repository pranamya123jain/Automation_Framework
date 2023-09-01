 package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQa {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pranamya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("AP");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("pranamya123jain@gmail.com"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9731246012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))
		
		//WebElement ele = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		//Thread.sleep(2000);
		//Select s = new Select(ele);
		//Thread.sleep(2000);
		//s.selectByVisibleText("1991");
		//Thread.sleep(2000);
		//WebElement eleSc = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		//Select sc = new Select(eleSc);
		//Thread.sleep(2000);
		//sc.deselectByVisibleText("May");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='29']")).click();
		//Thread.sleep(2000);
		
		
	}

}
