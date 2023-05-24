package Scenarios;


import Elements.HowToPlay;
import Utils.ReportLogger;
import Utils.baseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowToPlayTest extends baseTest {
    @Test
    public void testHowToPlayLogo(){
        try {
            driver.findElement(By.cssSelector("#home_welcome > div > div > div > div.closeWrap.text-right > a > span")).click();
            HowToPlay.HowTo(this.driver).click();
            HowToPlay.EaziWin(this.driver).click();
            Assert.assertTrue(HowToPlay.SIYAWINA(this.driver).isDisplayed(), "4 SIYA WINA game does not appear");
            Thread.sleep(3000);
            ReportLogger.passed("Test 4 SIYA WINA LOGO appears on the EAZiWIN game lobby on How To Play Section");
        } catch (Exception e) {
            ReportLogger.failed("Test 4 SIYA WINA LOGO appears on the EAZiWIN game lobby on How To Play Section");
        }
    }

    @Test
    public void testHowToPlayInformation() {
        try {
            driver.findElement(By.cssSelector("#home_welcome > div > div > div > div.closeWrap.text-right > a > span")).click();
            HowToPlay.HowTo(this.driver).click();
            HowToPlay.EaziWin(this.driver).click();
            HowToPlay.SIYAWINA(this.driver).click();
            Thread.sleep(3000);
            Assert.assertTrue(HowToPlay.WinPopUp(this.driver).isDisplayed(), "4 SIYA WINA How to play does not appear");
            Thread.sleep(3000);
            ReportLogger.passed("Test 4 SIYA WINA How To Play information appears on the EAZiWIN game lobby under How To Play Section");
        } catch (Exception e) {
            ReportLogger.failed("Test 4 SIYA WINA How To Play information appears on the EAZiWIN game lobby under How To Play Section");
        }
    }
}