package Tiwary123.Parma123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	WebDriver driver;
	Login(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public By Locat1=By.className("textfield");
	public By byutton=By.className("button");
	public void CloseBrowser() 
	{
		driver.quit();
	}
	
	public void EnterText(String text) 
	{
		driver.findElement(Locat1).sendKeys(text);
	}
	
	public void Click(String byutton ) 
	{
		driver.findElement(By.className(byutton)).click();;
	}
	//driver.findElement

}
