package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FAQs {
    private static WebElement element = null;

    //About Us dropdown
    public static WebElement aboutUs(WebDriver driver){
    element = driver.findElement(By.cssSelector(".hidden-sm.hidden-xs.menu-fade.sp-megamenu-parent  a[title='Ithuba National Lottery | About Us'] > img[alt='About Us']"));
    return element;
    }

    // Click Eaziwin
    public static WebElement EaziWin(WebDriver driver){
    element = driver.findElement(By.cssSelector(".sp-menu-left > div:nth-of-type(1) > div:nth-of-type(1) li:nth-of-type(6) img:nth-of-type(1)"));
    return element;
    }



    //Dropdown of cost
    public static WebElement DropdownCost(WebDriver driver){
    element = driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > div.panel-heading.iconLeft > h4"));
    return element;
    }

    //4 SIYA WINA appears
    public static WebElement SIYAWINACOST(WebDriver driver){
        element = driver.findElement(By.cssSelector("#accord2 > div > div > div.table-responsive > table > tbody > tr:nth-child(14) > td:nth-child(1)"));
        return element;
    }


    //Dropdown of odds
    public static WebElement DropdownOdds(WebDriver driver){
    element = driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > div:nth-child(3) > div.panel-heading.iconLeft > h4"));
    return element;
    }

    //4 SIYA WINA appears
    public static WebElement SIYAWINAODDS(WebDriver driver){
        element = driver.findElement(By.cssSelector("#accord3 > div > div > div.table-responsive > table > tbody > tr:nth-child(14) > td:nth-child(1)"));
        return element;
    }

}
