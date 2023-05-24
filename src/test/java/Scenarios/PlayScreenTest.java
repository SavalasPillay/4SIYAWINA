package Scenarios;

import Elements.Login;
import Elements.PlayScreen;
import Utils.ReportLogger;
import Utils.baseTest;
import Utils.readExcelSheet;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class PlayScreenTest extends baseTest {
    @DataProvider(name = "Play Screen")
    public Object[][] loginUsers(){
        return readExcelSheet.ListforPlay();
    }
    @Test(dataProvider = "Play Screen")
    public void testThatAPlayerCanAccessTheGame(String PhoneNum, String Pin) throws InterruptedException, FindFailed {
        try {
            Login.Ad(this.driver).click();
            Login.usernameTxt(this.driver).sendKeys(PhoneNum);
            Login.pinTxt(this.driver).sendKeys(Pin);
            Screen s = new Screen();
            PlayScreen.LoginButton(this.driver).click();
            s.click();
            Thread.sleep(5000);
            if (s.exists(PlayScreen.cyp()) != null) {
                PlayScreen.cypClose();
                s.click();
            }
            PlayScreen.PlayNow(this.driver).click();
            Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
            s.wait(MoreImg, 2000);
            s.click();
            Thread.sleep(4000);

            PlayScreen.PlayButton(this.driver).click();
            Thread.sleep(2000);
            Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
            Thread.sleep(2000);
            Pattern Yes = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\YesSound.png");
            s.wait(Yes, 2000);
            s.click();
            Thread.sleep(2000);
            PlayScreen.BackButton();
            s.click();
            Thread.sleep(2000);
            PlayScreen.Logout(this.driver).click();
            driver.wait(2000);
            ReportLogger.passed("Test that a player can access the game");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can access the game");
        }

//
        }




    @Test
    public void testThatAPlayerCanPlayGameSounds() throws InterruptedException, FindFailed {
        try {
            Login.Ad(this.driver).click();
            Login.usernameTxt(this.driver).sendKeys("0614306771");
            Login.pinTxt(this.driver).sendKeys("19998");
            Screen s = new Screen();
            PlayScreen.LoginButton(this.driver).click();
            s.click();
            Thread.sleep(5000);
            PlayScreen.PlayNow(this.driver).click();
            Thread.sleep(2000);
            Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
            s.wait(MoreImg, 2000);
            s.click();
            Thread.sleep(4000);
            PlayScreen.PlayButton(this.driver).click();
            Thread.sleep(10000);
            Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
            Thread.sleep(2000);
            Pattern Yes = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\YesSound.png");
            s.wait(Yes, 2000);
            s.click();
            Thread.sleep(4000);
            ReportLogger.passed("Test that a player can choose to play game sounds");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can choose to play game sounds");
        }
        }

    @Test
    public void testThatAPlayerCanMuteGameSounds() throws InterruptedException, FindFailed {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        PlayScreen.LoginButton(this.driver).click();
        s.click();
        Thread.sleep(5000);
        PlayScreen.PlayNow(this.driver).click();
        Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        s.wait(MoreImg,2000);
        s.click();
        Thread.sleep(4000);
        PlayScreen.PlayButton(this.driver).click();
        Thread.sleep(10000);
        Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
        Thread.sleep(2000);
        Pattern No = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\NoSound.png");
        s.wait(No,2000);
        s.click();
        Thread.sleep(4000);
            ReportLogger.passed("Test that a player can choose to mute game sounds");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can choose to mute game sounds");
        }
    }
    @Test
    public void testPlayGameSoundIcon() throws InterruptedException, FindFailed {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        PlayScreen.LoginButton(this.driver).click();
        s.click();
        Thread.sleep(5000);
        PlayScreen.PlayNow(this.driver).click();
        Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        s.wait(MoreImg,2000);
        s.click();
        Thread.sleep(4000);
        PlayScreen.PlayButton(this.driver).click();
        Thread.sleep(10000);
        Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
        Thread.sleep(2000);
        Pattern No = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\NoSound.png");
        s.wait(No,2000);
        s.click();
        Thread.sleep(4000);
        Pattern playS = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\PlaySoundButton.png");
        s.wait(playS,2000);
        s.click();
        Thread.sleep(4000);
            ReportLogger.passed("Test that a player can choose to play game sounds by screen icon");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can choose to play game sounds by screen icon");
        }
    }
    @Test
    public void testMuteGameSoundIcon() throws InterruptedException, FindFailed {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        PlayScreen.LoginButton(this.driver).click();
        s.click();
        Thread.sleep(5000);
        PlayScreen.PlayNow(this.driver).click();
        Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        s.wait(MoreImg,2000);
        s.click();
        Thread.sleep(4000);
        PlayScreen.PlayButton(this.driver).click();
        Thread.sleep(10000);
        Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
        Thread.sleep(2000);
        Pattern Yes = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\YesSound.png");
        s.wait(Yes,2000);
        s.click();
        Thread.sleep(4000);
        Pattern muteS = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\MuteSoundButton.png");
        s.wait(muteS,2000);
        s.click();
        Thread.sleep(4000);
            ReportLogger.passed("Test that a player can choose to mute game sounds by screen icon");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can choose to mute game sounds by screen icon");
        }
    }

    @Test
    public void testBackButtonIcon() throws InterruptedException, FindFailed {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        PlayScreen.LoginButton(this.driver).click();
        s.click();
        Thread.sleep(5000);
        PlayScreen.PlayNow(this.driver).click();
        Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        s.wait(MoreImg,2000);
        s.click();
        Thread.sleep(4000);
        PlayScreen.PlayButton(this.driver).click();
        Thread.sleep(2000);
        Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
        Thread.sleep(2000);
        Pattern No = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\NoSound.png");
        s.wait(No,2000);
        s.click();
        Thread.sleep(2000);
        Pattern back = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\BackButton.png");
        s.wait(back,2000);
        s.click();
        Thread.sleep(2000);
        Pattern logout = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\Logout.png");
        s.wait(logout,2000);
        s.click();
        Thread.sleep(2000);
            ReportLogger.passed("Test that a player can exit the game with the back button");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can exit the game with the back button");
        }
    }

    @Test
    public void testAddForR5() throws InterruptedException, FindFailed {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        PlayScreen.LoginButton(this.driver).click();
        s.click();
        Thread.sleep(5000);
        PlayScreen.PlayNow(this.driver).click();
        Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        s.wait(MoreImg,2000);
        s.click();
        Thread.sleep(4000);
        PlayScreen.PlayButton(this.driver).click();
        Thread.sleep(10000);
        Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
        Thread.sleep(2000);
        Pattern No = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\NoSound.png");
        s.wait(No,2000);
        s.click();
        Thread.sleep(4000);
        Pattern plus = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\AddButtonForR5.png");
        s.wait(plus,2000);
        s.click();
        Thread.sleep(4000);
            ReportLogger.passed("Test that a player can click the plus button and show R5");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can click the plus button and show R5 ");
        }
    }

    @Test
    public void testSubtractForR3() throws InterruptedException, FindFailed {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        PlayScreen.LoginButton(this.driver).click();
        s.click();
        Thread.sleep(5000);
        PlayScreen.PlayNow(this.driver).click();
        PlayScreen.MoreButton();
        s.click();
        Thread.sleep(4000);
        PlayScreen.PlayButton(this.driver).click();
        Thread.sleep(10000);
        Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
        Thread.sleep(2000);
        Pattern No = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\NoSound.png");
        s.wait(No,2000);
        s.click();
        Thread.sleep(4000);
        Pattern plus = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\AddButtonForR5.png");
        s.wait(plus,2000);
        s.click();
        Pattern minus = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\SubtractButtonForR5.png");
        s.wait(minus,2000);
        s.click();
        Thread.sleep(4000);
            ReportLogger.passed("Test that a player can click the plus button and show R3");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can click the plus button and show R3");
        }
    }
    @Test
    public void testR3BetAndPlayNow() throws InterruptedException, FindFailed {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        PlayScreen.LoginButton(this.driver).click();
        s.click();
        Thread.sleep(5000);
        PlayScreen.PlayNow(this.driver).click();
        Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        s.wait(MoreImg,2000);
        s.click();
        Thread.sleep(4000);
        PlayScreen.PlayButton(this.driver).click();
        Thread.sleep(10000);
        Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
        Thread.sleep(2000);
        Pattern No = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\NoSound.png");
        s.wait(No,2000);
        s.click();
        Thread.sleep(4000);
        Pattern playNow = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\PlayNow.png");
        s.wait(playNow,2000);
        s.click();
        Thread.sleep(4000);
            ReportLogger.passed("Test that a player can make a R3 bet and Play");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can make a R3 bet and Play  ");
        }
    }
    @Test
    public void testR5BetAndPlayNow() throws InterruptedException, FindFailed {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        PlayScreen.LoginButton(this.driver).click();
        s.click();
        Thread.sleep(5000);
        PlayScreen.PlayNow(this.driver).click();
        Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        s.wait(MoreImg,2000);
        s.click();
        Thread.sleep(4000);
        PlayScreen.PlayButton(this.driver).click();
        Thread.sleep(10000);
        Assert.assertTrue(PlayScreen.SiyaWinaGame(this.driver).isDisplayed(), "Siya Wina game is not displayed");
        Thread.sleep(2000);
        Pattern No = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\NoSound.png");
        s.wait(No,2000);
        s.click();
        Thread.sleep(4000);
        Pattern plus = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\AddButtonForR5.png");
        s.wait(plus,2000);
        s.click();
        Thread.sleep(4000);
        Pattern playNow = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\PlayNow.png");
        s.wait(playNow,2000);
        s.click();
        Thread.sleep(4000);
            ReportLogger.passed("Test that a player can make a R5 bet and Play");
        } catch (Exception e) {
            ReportLogger.failed("Test that a player can make a R5 bet and Play");
        }
    }
}
