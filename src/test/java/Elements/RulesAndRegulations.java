package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RulesAndRegulations {

    private static WebElement element = null;


//How to dropdown

    public static WebElement HowToDropdown(WebDriver driver) {
        element = driver.findElement(By.cssSelector(".sp-megamenu-parent .howToLink .image-title"));
        return element;
    }


//Clicking on EaziWin

    public static WebElement EaziWin(WebDriver driver) {
        element = driver.findElement(By.cssSelector(".sp-dropdown.sp-dropdown-main.sp-menu-right > .sp-dropdown-inner > .sp-module ul img[alt='EAZiWIN']"));
        return element;
    }


//Rules and regulations button

    public static WebElement RulesAndRegulation(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#contentList0-237 > div > div > a > button"));
        return element;
    }

    public static WebElement Close(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#docIframe > div > div > div.modal-body > div.closeWrap.text-right > a > span"));
        return element;
    }
    //Rules and regulations window
    public static WebElement RulesandReg(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#docIframe > div > div > div.modal-body"));
        return element;
    }
}













////How To Navigation
//public static WebElement HowTo(WebDriver driver) {
//        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(3)"));
//        return element;
//
////EAZiWIN
//public static WebElement EaziWin (WebDriver driver){
//        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(3) > div > div > div > div > div > div > div > div.groupWrap > div > div > ul > li:nth-child(6) > a:nth-child(1) > img"));
//        return element;
//
////Rules and regulations
//public static WebElement Rulesandreg (WebDriver driver){
//        element = driver.findElement(By.cssSelector("#contentList0-237 > div > div > a > button"));
//        return element;
//
////Close
//public static WebElement Close (WebDriver driver){
//        element = driver.findElement(By.cssSelector("#docIframe > div > div > div.modal-body > div.closeWrap.text-right > a > span"));
//        return element;