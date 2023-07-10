package ExITestListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryConfig  implements IRetryAnalyzer{

	
	public boolean retry(ITestResult result) {
		int min =0;
		int max =5;
		
		while(min<max) {
			min++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
