package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowToPlay {

    private static WebElement element = null;

    //How To Navigation
    public static WebElement HowTo(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(3)"));
        return element;
    }

    //EAZiWIN
    public static WebElement EaziWin(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(3) > div > div > div > div > div > div > div > div.groupWrap > div > div > ul > li:nth-child(6) > a:nth-child(1) > img"));
        return element;
    }

    //4SIYAWINALOGO
    public static WebElement SIYAWINA(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#contentList0-237 > div > div > ul > li:nth-child(7) > img"));
        return element;
    }

    //How to play and How to win pop-up
    public static WebElement WinPopUp(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#eaziwin_4_siya_wina_online > div > div > div.modal-body > div.hTPGameWrap.hTPEaziWin > div.hTP-panel.htPlay-wrap > div.hTP-panelBody"));
        return element;
    }

    //Logo in the game lobby and play button
    public static WebElement GameLobby(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(2)"));
        return element;
    }

    //EAZiWIN
    public static WebElement EaziWin1(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(2) > div > div > div > div > div > div > div > div.groupWrap > div > div > ul > li:nth-child(6) > a:nth-child(1) > img"));
        return element;
    }

    //4SIYAWINALOGO
    public static WebElement SiyaWinnaLogo(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-component > div > section.gameListingWrap > div > div:nth-child(7) > div > figure > img"));
        return element;
    }

    //Play Button
    public static WebElement PlayButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-component > div > section.gameListingWrap > div > div:nth-child(7) > div > figure > figcaption > button"));
        return element;
    }

    //Play Screen
    public static WebElement PlayScreen(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#gameCanvas"));
        return element;
    }
}