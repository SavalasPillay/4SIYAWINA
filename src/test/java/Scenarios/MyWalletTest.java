package Scenarios;

import Elements.Login;
import Elements.MyWallet;
import Utils.ReportLogger;
import Utils.baseTest;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyWalletTest extends baseTest {

    @Test
    public void testMyWalletBalance() throws FindFailed, InterruptedException {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        Pattern LoginImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\Login.png");
        s.wait(LoginImg, 2000);
        s.click();
        Thread.sleep(5000);
        Assert.assertTrue(MyWallet.WalletBalance(this.driver).isDisplayed(), "Wallet Balance does not appear");
        Thread.sleep(3000);
            ReportLogger.passed("Test Player can view their wallet balance.");
        } catch (Exception e){
            ReportLogger.failed("Test Player can view their wallet balance.");
        }
    }
    @Test
    public void testMyWalletTransactionHistory() throws FindFailed, InterruptedException {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        Pattern LoginImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\Login.png");
        s.wait(LoginImg, 2000);
        s.click();
        Thread.sleep(5000);
        MyWallet.MyWallet(this.driver).click();
        MyWallet.TransactionHistory(this.driver).click();
        Assert.assertTrue(MyWallet.TransactionHistoryTBL(this.driver).isDisplayed(), "Transaction history does not appear");
            ReportLogger.passed("Test Player can view their transaction history.");
        } catch (Exception e){
            ReportLogger.failed("Test Player can view their transaction history.");
        }
    }
}
