package cartTest;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Test;

public class AddToCart extends BaseTest {
    @Test
    public void TC_002_AddOneBookToCart(){
        pageProvider.getLoginPage().enterLoginForm(TestData.VALID_LOGIN_UI, TestData.VALID_PASSWORD_UI);
        pageProvider.getHomePage().checkIsRedirectToHomePage();
        pageProvider.getHomePage().clickOnButtonKnigiInCatalog();
        pageProvider.getKnigiPage().checkIsRedirectToKnigiPage();
        pageProvider.getKnigiPage().clickOnButtonXudozniaLiteraturaInCatalog();
        pageProvider.getXudozniaLiteraturaPage().checkIsRedirectToXudozniaLiteraturaBookPage();
        pageProvider.getXudozniaLiteraturaPage().clickOnButtonIstorichnaProzaInCatalog();
        pageProvider.getIstorichnaHudozhnyaLiteraturaPage().checkIsRedirectToIstorichnaHudozhnyaLiteraturaBookPage();
        pageProvider.getIstorichnaHudozhnyaLiteraturaPage().clickOnButtonZaPerekopomJeZemlia();
        pageProvider.getZaPerekopomJeZemliaPage().checkIsRedirectToZaPerekopomJeZemliaBookPage();
        pageProvider.getZaPerekopomJeZemliaPage().clickOnButtonAddToCart();
        pageProvider.getCartElements().checkIsButtonCheckoutLinkDisplayed();
        pageProvider.getCartElements().checkIsButtonRemoveFromCartDisplayed();
        pageProvider.getCartElements().checkIsCartModalLabelDisplayed();


    }
}
