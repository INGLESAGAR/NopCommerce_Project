package DemoTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class VerifyTitle {
	
	@Test
	public void VerifyPageTitle() 
	{  
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("https://www.google.com/");
		String expectedTitle ="Google";
		String actualTitle =driver.getTitle();
		
		//verify tilte
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
		
	}
	

}
