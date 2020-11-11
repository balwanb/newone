package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
	
	
	@Test
	public void testcase1()
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.findElementById("email").sendKeys("balwan@clarion");
	driver.findElementById("pass").sendKeys("123456");
	;
	
	
	}

}
