package Elements;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    private static WebElement element = null;

    //Email or phone number field
    public static WebElement usernameTxt(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#userName_email"));
        return element;
    }

    //Pin field
    public static WebElement pinTxt(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#password"));
        return element;
    }

    //submit
    public static WebElement loginBTN(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"login-form-2\"]/div/div/fieldset/div[4]/button"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
        return element;
    }

    //logout
    public static WebElement logoutBTN(WebDriver driver) {
        element = driver.findElement(By.linkText("LOGOUT"));

        new WebDriverWait(driver, 10)
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    //Complete you profile button
    public static WebElement cypCloseBTN(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-top3 > div > div > div > div.mobileLoginWrap > div.loginAreaWrap > a > div"));

        new WebDriverWait(driver, 10)
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    //Complete you profile
    public static WebElement cyp(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#complete_your_profile_popup > div > div > div.modal-body"));
        return element;
    }

    public static WebElement Ad(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#home_welcome > div > div > div > div.closeWrap.text-right > a > span"));
        return element;
    }

    public static WebElement pinError(WebDriver driver){
        element = driver.findElement(By.cssSelector("#error_password"));
        return element;
    }
    public static WebElement usernameError(WebDriver driver){
        element = driver.findElement(By.cssSelector("#error_userName_email"));
        return element;
    }
}
