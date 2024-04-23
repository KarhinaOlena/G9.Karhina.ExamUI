package WishListTest;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Test;

public class AddToWishList extends BaseTest {
   final String bookName = "За перекопом є земля";
    @Test
    public void TC_005_AddOneBookToWishList() {
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
        pageProvider.getZaPerekopomJeZemliaPage().clickOnButtonAddToWishList();
        pageProvider.getHomePage().getHeaderElements().clickOnButtonWishList();
        pageProvider.getWishListPage().checkIsRedirectToWishListPage();
        pageProvider.getWishListPage().checkIsImgZaPerekopomJeZemliaDisplayed(bookName);

    }

}
