package smokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	@Test
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().contains("Goog"));
		
	}

}
