package Scenarios;
import Elements.GameLobby;
import Elements.Login;
import Elements.PlayScreen;
import Utils.ReportLogger;
import Utils.baseTest;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GameLobbyTest extends baseTest {
    @Test
    public void testGameLobby() throws FindFailed, InterruptedException {
        try{
        Login.Ad(this.driver).click();
        Login.usernameTxt(this.driver).sendKeys("0614306771");
        Login.pinTxt(this.driver).sendKeys("19998");
        Screen s = new Screen();
        Pattern LoginImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\Login.png");
        s.wait(LoginImg,2000);
        s.click();
        Thread.sleep(2000);
        PlayScreen.PlayNow(this.driver).click();
        Pattern MoreImg = new Pattern("C:\\Workspace\\4SIYAWINA\\src\\main\\resources\\More.png");
        s.wait(MoreImg, 2000);
        s.click();
        Thread.sleep(2000);
        Assert.assertTrue(GameLobby.SiyaWinaLogo(this.driver).isDisplayed(), "Siya Wina game is not displayed in the game lobby");
        Thread.sleep(2000);
            ReportLogger.passed("Test that 4 SIYA WINA has been added to game lobby.");
        } catch (Exception e) {
            ReportLogger.failed("Test that 4 SIYA WINA has been added to game lobby.");
        }

    }
}
