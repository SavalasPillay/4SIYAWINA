package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseTest {
    public WebDriver driver;
    @BeforeTest
    public void startUp() {
        // System.setProperty
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Savalas Pillay\\chromedriver.exe");
        ReportLogger.startTest(super.getClass().getName());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://www.nationallottery.co.za/";
        driver.get(baseUrl);

    }

    @AfterTest
    public void tearDown() {
        ReportLogger.endTest();
        driver.quit();

    }
}
