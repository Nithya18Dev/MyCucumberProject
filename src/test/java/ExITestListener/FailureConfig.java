package ExITestListener;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class FailureConfig implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(RetryConfig.class);
	}

}
