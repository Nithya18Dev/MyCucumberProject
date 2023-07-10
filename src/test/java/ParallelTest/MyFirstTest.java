package ParallelTest;
import org.testng.annotations.*;
import BaseClass.BaseClass_New;
import java.io.IOException;
import org.openqa.selenium.*;



public class MyFirstTest extends BaseClass_New
{
	BaseClass_New bc = new BaseClass_New();
	
	@BeforeClass
	public void launchBrowser() {
		bc.browserLaunch();
	}
	
	@BeforeMethod
	public void maximizeWindow() {
		bc.maximize();
	}
	
	@Parameters({"From","To"})
	@Test(description="Launch RedBus site",priority=0,enabled=true,groups= {"WebSite"})
	public void launchRedBusAppln() {
		bc.navigateURL("https://redbus.in");
		bc.textBox(By.id("src"),"From");
		bc.textBox(By.id("dest"),"To");
		WebElement search_Btn = bc.findElement(By.id("search_button"));
		bc.elementClick(search_Btn);
		System.out.println("RebBus Website -Bus route searched successfully");
	}
	
	@Test(description="Flipkart application site",priority=1,enabled=true,groups= {"WebSite"})
	public void launchFlipkartAppln() throws Exception {
		bc.navigateURL("https://flipkart.com");
		bc.sleep(2000);
		System.out.println("Flipkart Application launched Successsfully");
		
	}
	
	@AfterMethod
	public void takeScreenShot() throws IOException {
		bc.screenShot();
	}
	
	@AfterClass
	public void closeBrowser() throws Exception {
		bc.closeAppln();
	}
	
}
