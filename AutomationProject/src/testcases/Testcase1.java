package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test
	public void testcase1(){
		

		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("data1");
		driver.findElementById("password").sendKeys("data2");
		driver.quit();
		
			
		
		
	}

}
