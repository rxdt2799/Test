package Mypckg;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest 
{

	WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{
		String OS = System.getProperty("os.name").toUpperCase();
		System.out.println("Current Operating System: "+OS);
	
		if(OS.contains("WINDOWS")){		
		/*FireFox Driver*/	
		System.setProperty("webdriver.gecko.driver", ".//GeckoDriver//geckodriver.exe");
		}
		
		else if(OS.contains("UBUNTU") || OS.contains("LINUX")) {
		/*FireFox Driver*/
		System.setProperty("webdriver.gecko.driver", "GeckoDriver//geckodriver");
		}
		driver = new FirefoxDriver();
		
		//Maximizing browser windows
		driver.manage().window().maximize();		
		//Below code will open url of admin.
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}	
				

	@Test
	public void f() 
	{
		
	}


	@AfterTest
	public void afterTest() {
	}

}
