//package scenarios;
//
//import elements.Login;
//import elements.Rules_Regulations;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import utils.baseTest;
//import utils.readExcelSheet;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginTest extends baseTest{
//
//    @DataProvider(name = "Login")
//    public Object[][] loginUsers() {
//        return readExcelSheet.loginList();
//    }
//
//    @Test(dataProvider = "Login")
//    public void testThatPlayerCanLogin(String PhoneNum, String Pin) throws InterruptedException, FindFailed, FindFailed {
//        Screen s = new Screen();
//
//        Login.Ad(this.driver).click();
//        Login.usernameTxt(this.driver).sendKeys(PhoneNum);
//        String username = Login.usernameTxt(this.driver).getText();
//        Login.pinTxt(this.driver).sendKeys(Pin);
//        String enteredPin = Login.pinTxt(this.driver).getText();
//        Pattern logIn = new Pattern("C:\\Users\\Lerato\\Documents\\GitHub\\4SiyaWina\\src\\main\\resources\\Login.png");
//        s.wait(logIn,2000);
//        s.click();
//
//        Thread.sleep(1000);
//        if (username == null) {
//        // Login.usernameError(this.driver).getText();
//        Assert.assertEquals("Username error message is not displayed", "Please enter valid Mobile/Email", Login.usernameError(this.driver).getText());
//         }
//        if (enteredPin.length() < 5) {
//            //Login.pinError(this.driver).getText();
//            Assert.assertEquals("Pin error message is not displayed", "Pin must be 5 digits", Login.pinError(this.driver).getText());
//        }
//
//        Thread.sleep(5000);
//
//        Pattern logout = new Pattern("C:\\Users\\Lerato\\Documents\\GitHub\\4SiyaWina\\src\\main\\resources\\Logout.png");
//        s.wait(logout,2000);
//        s.click();
//        Thread.sleep(2000);
//    }
//
//    }
