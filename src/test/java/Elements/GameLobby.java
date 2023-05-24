package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GameLobby {

    private static WebElement element = null;
    //Logo in the game lobby and play button
    public static WebElement PlayNow(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(2)"));
        return element;
    }

    //EAZiWIN
    public static WebElement EaziWin(WebDriver driver){
        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(2) > div > div > div > div > div > div > div > div.groupWrap > div > div > ul > li:nth-child(6) > a:nth-child(1) > img"));
        return element;
    }

    //4SIYAWINALOGO
    public static WebElement SiyaWinaLogo(WebDriver driver) {
         element = driver.findElement(By.cssSelector("#sp-component > div > section.gameListingWrap > div > div:nth-child(7) > div > figure > img"));
         return element;
    }

     //Play Button
    public static WebElement PlayButton(WebDriver driver){
        element = driver.findElement(By.cssSelector("#sp-component > div > section.gameListingWrap > div > div:nth-child(7) > div > figure > figcaption > button"));
        return element;
    }

     //Play Screen
    public static WebElement PlayScreen(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#gameCanvas"));
        return element;
    }
}
