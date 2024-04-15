package WishListTest;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Test;

public class RemoveFromWishList extends BaseTest {
    @Test
    public void TC_006_RemoveOneBookFromWishList() {
        pageProvider.getLoginPage().enterLoginFormWithValidCred(TestData.VALID_LOGIN_UI, TestData.VALID_PASSWORD_UI);
        pageProvider.getHomePage().checkIsRedirectToHomePage();
        pageProvider.getHomePage().clickOnButtonKnigiInCatalog();
        pageProvider.getKnigiPage().checkIsRedirectToKnigiPage();
        pageProvider.getKnigiPage().clickOnButtonXudozniaLiteraturaInCatalog();
        pageProvider.getXudozniaLiteraturaPage().checkIsRedirectToXudozniaLiteraturaBookPage();
        pageProvider.getXudozniaLiteraturaPage().clickOnButtonIstorichnaProzaInCatalog();
        pageProvider.getIstorichnaHudozhnyaLiteraturaPage().checkIsRedirectToIstorichnaHudozhnyaLiteraturaBookPage();
        pageProvider.getIstorichnaHudozhnyaLiteraturaPage().clickOnButtonZaPerekopomJeZemlia();
        pageProvider.getZaPerekopomJeZemliaPage().checkIsRedirectToZaPerekopomJeZemliaBookPage();
        pageProvider.getZaPerekopomJeZemliaPage().clickOnButtonAddToWishList();
        pageProvider.getHomePage().getHeaderElements().clickOnButtonWishList();
        pageProvider.getWishListPage().checkIsRedirectToWishListPage();
        pageProvider.getWishListPage().clickOnImgZaPerekopomJeZemlia();
        pageProvider.getZaPerekopomJeZemliaPage().checkIsRedirectToZaPerekopomJeZemliaBookPage();
        pageProvider.getZaPerekopomJeZemliaPage().clickOnButtonRemoveFromWishList();
        pageProvider.getZaPerekopomJeZemliaPage().checkIsButtonAddToWishListDisplayed();
        pageProvider.getHomePage().getHeaderElements().clickOnButtonWishList();
        pageProvider.getWishListPage().checkIsRedirectToWishListPageNotDisplayed();


    }

}
