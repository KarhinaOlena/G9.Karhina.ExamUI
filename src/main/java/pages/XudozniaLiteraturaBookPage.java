package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XudozniaLiteraturaBookPage extends ParentPage{
    public XudozniaLiteraturaBookPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/catalog/xudoznia-literatura";
    }

    @FindBy(xpath = ".//a[@class='d-block link-primary fw-bolder mb-2 mb-lg-3 lh-sm'][contains(text(),'Історична проза')]")
    private static WebElement buttonIstorichnaProzaInCatalog;

    public XudozniaLiteraturaBookPage checkIsRedirectToXudozniaLiteraturaBookPage() {
        checkUrl();
        return this;
    }

    public void clickOnButtonIstorichnaProzaInCatalog() {
        clickOnElement(buttonIstorichnaProzaInCatalog);
    }
}

