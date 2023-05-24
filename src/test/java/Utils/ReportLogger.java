package Utils;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReportLogger {
    private static ExtentTest test;
    private static ExtentReports report;


    public static void startTest(String title) {
        String path = "src\\test\\java\\reports\\"+title+".html";
        report = new ExtentReports(path);
        test = report.startTest("4 SIYA WINA Game Test Report");
    }

    public static ExtentTest test() {
        return test;
    }

    public static ExtentReports report() {
        return report;
    }

    public static void endTest() {
        report.endTest(test);
        report.flush();
    }

    public static String capture(WebDriver driver) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src\\test\\java\\reports\\images" + System.currentTimeMillis() + ".png");
        String errflpath = Dest.getAbsolutePath();
        try {
            Files.copy(scrFile, Dest);
        } catch (IOException e) {
            System.out.println("Failed capture");
        }
        return errflpath;
    }
    public static void passed(String caseName){
        ReportLogger.test().log(LogStatus.PASS, caseName + " - Test passed");
    }

    public static void failed(String caseName){
        ReportLogger.test().log(LogStatus.FAIL, caseName + " - Test failed");
    }
}
