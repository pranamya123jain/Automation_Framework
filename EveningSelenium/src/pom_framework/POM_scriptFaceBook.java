package pom_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_scriptFaceBook 
{
	@FindBy(id="email")
	private WebElement unTbox;
	@FindBy(name="pass")
	private WebElement pwdTbox;
	@FindBy(name="login")
	private WebElement loginBtn;
	public POM_scriptFaceBook(WebDriver driver)
	{  
		PageFactory.initElements(driver,this);
	}
	public void username(String un)
	{
		unTbox.sendKeys(un);
	}
	public void password(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginBtn.click();
	}

}
