package ParallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestExample {

	protected WebDriver driver = null;

	@Test
	public void lunchChromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1000043444\\eclipse-workspace\\MavenProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://redbus.in");
		Thread.sleep(4000);
	}

	@Test
	public void launchEdgeBrowser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\1000043444\\eclipse-workspace\\MavenProject\\src\\test\\resources\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://redbus.in");
		Thread.sleep(4000);
	}
	
	@Test
	public void verifyFailure() throws InterruptedException  {
		System.out.println("Test Failed");
		Assert.assertTrue(false);
		
	}

}
