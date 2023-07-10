import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ParallelTestExample {
	
	protected WebDriver driver = null;
	
	@Test
	public void lunchChromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000043444\\eclipse-workspace\\MavenProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://redbus.in");
		Thread.sleep(4000);
	}

	@Test
	public void launchEdgeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000043444\\eclipse-workspace\\MavenProject\\src\\test\\resources\\msedgedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://redbus.in");
		Thread.sleep(4000);
	}
}
