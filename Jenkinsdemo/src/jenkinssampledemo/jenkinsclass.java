package jenkinssampledemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jenkinsclass {
	WebDriver driver;
	
	@Test
	public void jenkinstest(){
		//System.out.println("Welcome to jenkins world");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

}
