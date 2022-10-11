package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("       \n    WOW! Test is pass         ");

    }


    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("     \n    Oops! Test is fail       ");
    }


}
