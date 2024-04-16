package dataTests;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Test;

public class TestsForCheckingData extends BaseTest {
    @Test
    public void TC_007_checkingOfDataDisappearingFromInputsAfterRefreshingPage() {
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().clickOnButtonCabinetLoginPage();
        pageProvider.getLoginPage().enterTextIntoInputLogin(TestData.VALID_LOGIN_UI);
        pageProvider.getLoginPage().enterTextIntoInputPassword(TestData.VALID_PASSWORD_UI);
        pageProvider.getLoginPage().refreshPage();
        pageProvider.getLoginPage().clickOnButtonCabinetLoginPage();
        pageProvider.getLoginPage().clickOnButtonSignIn();
        pageProvider.getHomePage().getHeaderElements().checkIsButtonCabinetNotDisplayed();
        pageProvider.getLoginPage().checkIsButtonSignInIsDisplayed();
    }
}
