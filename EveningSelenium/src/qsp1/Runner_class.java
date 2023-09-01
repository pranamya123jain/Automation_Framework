package qsp1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.Generic_Script;

public class Runner_class extends Generic_Script
{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
