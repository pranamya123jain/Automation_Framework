package asert;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Generic_Script;

public class Assert_fail extends Generic_Script
{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals(title,"Facebook – log in ");
		System.out.println(1);
	}


}
