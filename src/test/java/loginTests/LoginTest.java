package loginTests;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Assert;
import org.junit.Test;

    public class LoginTest extends BaseTest {
        @Test
        public void C_001_SignInWithValidLogin(){
            pageProvider.getLoginPage().openLoginPage();
            pageProvider.getLoginPage().clickOnButtonCabinetLoginPage();
            pageProvider.getLoginPage().enterTextIntoInputLogin(TestData.VALID_LOGIN_UI);
            pageProvider.getLoginPage().enterTextIntoInputPassword(TestData.VALID_PASSWORD_UI);
            pageProvider.getLoginPage().setCheckBoxRememberMeToNeededState("Checked");
            pageProvider.getLoginPage().clickOnButtonSignIn();
            pageProvider.getHomePage().checkIsRedirectToHomePage();
            pageProvider.getHeaderElements().clickOnButtonCabinet();
            pageProvider.getMyProfilePage().checkIsRedirectToMyProfilePage();
            pageProvider.getMyProfilePage().checkIsButtonLogoutDisplayed();
            pageProvider.getMyProfilePage().checkIsButtonEditProfileDisplayed();
            pageProvider.getMyProfilePage().checkIsButtonOrdersDisplayed();
            pageProvider.getMyProfilePage().checkIsCabinetTitleDisplayed();
            pageProvider.getMyProfilePage().checkIsPersonalDataTitleDisplayed();
            pageProvider.getMyProfilePage().checkIsUserAvatarDisplayed();
            pageProvider.getLoginPage().checkIsbuttonCabinetLoginPageIsNotDisplayed();
            pageProvider.getLoginPage().checkIsButtonSignInIsNotDisplayed();
            pageProvider.getLoginPage().checkIsCheckBoxRememberMeIsNotDisplayed();
            pageProvider.getLoginPage().checkIsInputLoginIsNotDisplayed();
            pageProvider.getLoginPage().checkIsInputPasswordIsNotDisplayed();

        }
    }

