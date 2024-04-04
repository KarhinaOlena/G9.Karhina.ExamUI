package baseTest;

import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void validLogin(){
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().clickOnButtonCabinet();


    }
}
