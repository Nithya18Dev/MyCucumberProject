package BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass_New {
	
	protected WebDriver driver=null;
	
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000043444\\eclipse-workspace\\MavenProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void navigateURL(String url) {
		driver.get(url);
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public String sendValuesToAlert(String str) throws InterruptedException {
		
		driver.switchTo().alert().sendKeys(str);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		return str;
		
	}
	
	public void textBox(By by,String str) {
		driver.findElement(by).sendKeys(str);
	}
	
	public void sleep(int secs) throws Exception {
		Thread.sleep(secs);
	}
	
	public WebElement findElement(By by) {
		WebElement ele = driver.findElement(by);
		return ele;
	}
	
	public void elementClick(WebElement ele) {
		ele.click();
	}
	
	public void screenShot() throws IOException {
		TakesScreenshot ss = ((TakesScreenshot)driver);
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\1000043444\\OneDrive - Hexaware Technologies\\Desktop\\Automation\\ScreenShots\\Nithya.jpeg");
		FileUtils.copyFile(source, destination);
	}
	
	public void closeAppln() throws Exception {
		driver.quit();
	}
	
}
