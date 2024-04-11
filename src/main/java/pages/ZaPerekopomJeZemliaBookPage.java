package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZaPerekopomJeZemliaBookPage extends ParentPage{
    public ZaPerekopomJeZemliaBookPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/product/104302-za-perekopom-je-zemlia";
    }

    @FindBy(xpath = ".//button[@class='btn btn-primary w-100 px-0 fn_cartAdd']")
    private static WebElement buttonAddToCart;

    public ZaPerekopomJeZemliaBookPage checkIsRedirectToZaPerekopomJeZemliaBookPage() {
        checkUrl();
        return this;
    }

    public void clickOnButtonAddToCart() {
        clickOnElement(buttonAddToCart);
    }

}

