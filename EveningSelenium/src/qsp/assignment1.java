package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/");
            String title=driver.getTitle();
            if(title.equals("Instagram"))
            		
            		{
            	System.out.println("pass");
            		}
            else
            {
            	System.out.println("fail");
            }
			
	}

}

