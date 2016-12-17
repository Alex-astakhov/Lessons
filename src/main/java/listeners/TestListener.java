package listeners;

import lesson16.TryListener;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

/**
 * Created by Alex Astakhov on 25.11.2016.
 */
public class TestListener extends TestListenerAdapter {
    private Logger logger = LoggerFactory.getLogger("Driver");
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        logger.info(tr.getName() + " успешен");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        File screenshotAs = ((TakesScreenshot) ((TryListener) tr.getInstance()).driver).getScreenshotAs(OutputType.FILE);
        try {
            screenshotAs.createNewFile();
            File myScreen = new File("D:\\jack.png");
            FileUtils.copyFile(screenshotAs, myScreen);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info(tr.getName() + " упал");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        logger.info(tr.getName() + " пропущен");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {

    }

}
