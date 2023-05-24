package Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;


public class PlayScreen {
    private static WebElement element = null;

    //Play Now!
    public static WebElement PlayNow(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(2)"));
        return element;
    }

    //EAZiWIN
    public static WebElement EAZiWIN(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-menu > div > div > ul > li:nth-child(2) > div > div > div > div > div > div > div > div.groupWrap > div > div > ul > li:nth-child(6) > a:nth-child(1) > img"));
        return element;
    }


    //Play button for SIYA WINA on EAZiWIN list of games
    public static WebElement PlayButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-component > div > section.gameListingWrap > div > div:nth-child(7) > div > figure > figcaption > button"));
        return element;

    }

    //Play screen 
    public static WebElement SiyaWinaGame(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#gamePlayDiv > section > div"));
        return element;
    }

    //Logout
    public static WebElement Logout(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#sp-top3 > div > div > div > div.basicLoginWrap > a"));
        return element;
    }

    public static WebElement LoginButton(WebDriver driver) {
        element = driver.findElement(By.className("btnDefault"));
        return element;
    }



//    public static WebElement cyp(WebDriver driver) {
//        element = driver.findElement(By.cssSelector("#complete_your_profile_popup > div > div > div.modal-body > div.popBorderWrap > div > div.panelHead"));
//        return element;
//    }
    public static Pattern cyp() {
        Pattern cypImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\CompleteProfile.png");
        return cypImg;
    }


//    public static WebElement cypClose(WebDriver driver) {
//        element = driver.findElement(By.cssSelector("#complete_your_profile_popup > div > div > div.modal-body > div.closeWrap.text-right.close-popup > a > span"));
//        return element;
//    }
    public static Pattern cypClose() {
        Pattern cyClose = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\cpClose.png");
        return cyClose;
    }





//    public static Pattern LoginButton() {
//        Pattern Login = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\Login.png");
//        return Login;
//    }

    public static Pattern PlayNowButton() {
        Pattern PlayNow = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\PlayNow.png");
        return PlayNow;
    }

    public static Pattern MoreButton() {
        Pattern More = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        return More;
    }

    public static Pattern YesButton() {
        Pattern Yes = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\YesSound.png");
        return Yes;
    }

    public static Pattern NoButton() {
        Pattern NoButton = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\NoSound.png");
        return NoButton;
    }

    public static Pattern BackButton() {
        Pattern Back = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\BackButton.png");
        return Back;
    }

    public static Pattern PlaySoundButton() {
        Pattern PlaySoundButton = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\PlaySoundButton.png");
        return PlaySoundButton;
    }

    public static Pattern MuteSoundButton() {
        Pattern MuteSoundButton = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\MuteSoundButton.png");
        return MuteSoundButton;
    }

    public static Pattern AddButton() {
        Pattern AddButtonForR5 = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\AddButtonForR5.png");
        return AddButtonForR5;
    }

    public static Pattern SubtractButton() {
        Pattern SubtractButtonFor3 = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\SubtractButtonForR3.png");
        return SubtractButtonFor3;
    }
    public static Pattern gameInLobby() {
        Pattern game = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\gameInLobby.png");
        return game;
    }
    public static Pattern playBtn() {
        Pattern PlayGame = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\Play.png");
        return PlayGame;
    }
}

