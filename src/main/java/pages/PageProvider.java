package pages;

import org.openqa.selenium.WebDriver;
import pages.elements.CartElements;

public class PageProvider {
    private WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage getLoginPage() {
        return new LoginPage(webDriver);
    }

    public HomePage getHomePage() {
        return new HomePage(webDriver);}


        public MyProfilePage getMyProfilePage() {
            return new MyProfilePage(webDriver);
        }


    public MyProfilePage getHeaderElements() {
        return new MyProfilePage(webDriver);
    }

    public KnigiPage getKnigiPage() {
        return new KnigiPage(webDriver);
    }

    public XudozniaLiteraturaBookPage getXudozniaLiteraturaPage() {
        return new XudozniaLiteraturaBookPage(webDriver);
    }

    public IstorichnaProzaBookPage getIstorichnaHudozhnyaLiteraturaPage() {
        return new IstorichnaProzaBookPage(webDriver);
    }

    public ZaPerekopomJeZemliaBookPage getZaPerekopomJeZemliaPage() {
        return new ZaPerekopomJeZemliaBookPage(webDriver);
    }

    public CartElements getCartElements() {
        return new CartElements(webDriver);
    }
}
