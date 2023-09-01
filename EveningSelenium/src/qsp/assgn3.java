package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgn3 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.instagram.com/");
        String url=driver.getCurrentUrl();
        if(url.equals("https://www.instagram.com/"))
        		
        		{
        	System.out.println("pass");
        		}
        else
        {
        	System.out.println("fail");
        }
		driver.quit();

	}

}
