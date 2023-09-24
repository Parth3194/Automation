package TliNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	public void OnTestSuccess(ITestResult result) {
		System.out.println("Testcase is passes");
		}
	public void OnTestFailure(ITestResult result) {
		System.out.println("Testcase is failed");
		System.out.println("Testcase failed is" + result.getName());
		System.out.println("Testcase is failed due to" + result.getThrowable().getMessage());
	}
	public void OnTestSkip(ITestResult result) {
		System.out.println("Testcase is skipped");
		System.out.println("Testcase is skipped due to" + result.getThrowable().getMessage());
	
	
}
}