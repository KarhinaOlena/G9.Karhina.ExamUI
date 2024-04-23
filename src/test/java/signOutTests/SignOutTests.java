package signOutTests;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Test;

public class SignOutTests extends BaseTest {
    @Test
    public void TC_003_SignOut(){
        pageProvider.getLoginPage().enterLoginForm(TestData.VALID_LOGIN_UI, TestData.VALID_PASSWORD_UI);
        pageProvider.getHomePage().checkIsRedirectToHomePage();
        pageProvider.getHeaderElements().clickOnButtonCabinet();
        pageProvider.getMyProfilePage().checkIsRedirectToMyProfilePage();
        pageProvider.getMyProfilePage().clickOnButtonLogout();
        pageProvider.getMyProfilePage().checkIsRedirectToMyProfilePage();
        pageProvider.getLoginPage().checkIsbuttonCabinetLoginPageIsDisplayed();
        pageProvider.getMyProfilePage().checkIsButtonLoginDisplayed();
        pageProvider.getMyProfilePage().checkIsButtonRegisterDisplayed();

  }
}
