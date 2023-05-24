package Scenarios;

import Elements.FAQs;
import Utils.ReportLogger;
import Utils.baseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FAQsTest extends baseTest {
    @Test
    public void testGameCostInFAQsSection() {
        try {
            driver.findElement(By.cssSelector("#home_welcome > div > div > div > div.closeWrap.text-right > a > span")).click();
            FAQs.aboutUs(this.driver).click();
            FAQs.EaziWin(this.driver).click();
            FAQs.DropdownCost(this.driver).click();
            driver.findElement(By.xpath("//*[@id=\"accord3\"]/div/div/div[2]/table/tbody/tr[14]/td[1]"));
            Thread.sleep(3000);
            Assert.assertTrue(FAQs.SIYAWINACOST(this.driver).isDisplayed(), "Game costs are not displayed");
            Thread.sleep(3000);
            ReportLogger.passed("Test that 4 SIYA WINA game costs have been added to the FAQs Section");
        } catch (Exception e) {
            ReportLogger.failed("Test that 4 SIYA WINA game costs have been added to the FAQs Section");
        }
    }
    @Test
    public void testOddsOfWinningInFAQsSection(){
        try {
            driver.findElement(By.cssSelector("#home_welcome > div > div > div > div.closeWrap.text-right > a > span")).click();
            FAQs.aboutUs(this.driver).click();
            FAQs.EaziWin(this.driver).click();
            FAQs.DropdownOdds(this.driver).click();
            driver.findElement(By.cssSelector("#accord3 > div > div > div.table-responsive > table > tbody > tr:nth-child(14) > td:nth-child(1)"));
            Thread.sleep(3000);
            Assert.assertTrue(FAQs.SIYAWINAODDS(this.driver).isDisplayed(), "Odds are not displayed");
            Thread.sleep(3000);
            ReportLogger.passed("Test that 4 SIYA WINA Odds of winning have been added to the FAQs Section");
        } catch (Exception e){
            ReportLogger.failed("Test that 4 SIYA WINA Odds of winning have been added to the FAQs Section");
        }
    }
}
