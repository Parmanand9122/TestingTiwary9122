package Tiwary123.Parma123;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCustomer{

	WebDriver driver;
	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	@AfterClass
	public void CloseBrowser() 
	{
		driver.close();
	}
	
	@Test
	public void Tiwary567() 
	{
		driver.navigate().to("https://mvnrepository.com/artifact/org.testng/testng/7.10.2");
	    Login Lo=new Login(driver);
	    Lo.EnterText("Selenium");
	    Lo.Click("");
		System.out.println("Successfully laucnh broswer");//
		//Lo.EnterText("");
		
		
	}
}
