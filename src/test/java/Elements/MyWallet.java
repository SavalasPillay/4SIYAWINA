package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWallet {


    private static WebElement element = null;

    //Home Page Wallet Balance
    public static WebElement WalletBalance(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-top3 > div > div > div > div.basicLoginWrap > div > span.currency.cash-balance"));
        return element;
    }


    //My Wallet
    public static WebElement MyWallet(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-myaccountpos > div > div.sp-module.myAccountNav > div > ul > li.item-123 > a > span"));
        return element;
        }

        //Transaction history
        public static WebElement TransactionHistory(WebDriver driver) {
            element = driver.findElement(By.cssSelector("#sp-left > div > div > div > ul > li.item-201 > a"));
            return element;
        }

    //Transaction history table
    public static WebElement TransactionHistoryTBL(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-component > div > div.myaccount_body_section > div.transactionBlock.transactionHistory > div.transaction_details"));
        return element;
    }
    }
