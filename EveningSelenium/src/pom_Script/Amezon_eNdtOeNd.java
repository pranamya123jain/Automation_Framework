package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amezon_eNdtOeNd 
{
	//declaration
	@FindBy(xpath="//button[text()='✕']")
	private WebElement clse;
	@FindBy(name="q")
	private WebElement sTfield;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement sbtn;
	@FindBy(xpath="//div[text()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']")
	private WebElement text;
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addCart;
	@FindBy(xpath="//div[text()='Grocery']")
	private WebElement gText;
	@FindBy(xpath="//button[text()='Shop now']")
	private WebElement snbtn;
	//Initialization
	public Amezon_eNdtOeNd(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void clickclse()
	{
		clse.click();
	}
	public void searchTxtfield(String pro)
	{
		sTfield.sendKeys(pro);
	}
	public void clicksbtn()
	{
		sbtn.click();	
	}
		public void clicktext()
		{
			text.click();
		}
		public void clickaddCart() 
		{
			addCart.click();
		}
	public void clickgText()
	{
		gText.click();
	}
	public void clicksnbtn()
	{
		snbtn.click();
	}
}

