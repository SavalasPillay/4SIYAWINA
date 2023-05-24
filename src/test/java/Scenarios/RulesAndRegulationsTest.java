package Scenarios;
import Elements.RulesAndRegulations;
import Utils.ReportLogger;
import org.openqa.selenium.By;
import Utils.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RulesAndRegulationsTest extends baseTest {
    @Test
    public void testPlayViewRulesAndRegulations(){

        try {
            driver.findElement(By.cssSelector("#home_welcome > div > div > div > div.closeWrap.text-right > a > span")).click();
            RulesAndRegulations.HowToDropdown(this.driver).click();
            RulesAndRegulations.EaziWin(this.driver).click();
            RulesAndRegulations.RulesAndRegulation(this.driver).click();
            Assert.assertTrue(RulesAndRegulations.RulesandReg(this.driver).isDisplayed(), "Rules and Regulations are not displayed");
            Thread.sleep(4000);
            RulesAndRegulations.Close(this.driver).click();
            Thread.sleep(2000);
            ReportLogger.passed("Test Player Views Rules And Regulations.");
        } catch (Exception e){
            ReportLogger.failed("Test Player Views Rules And Regulations.");
        }
    }
}
